package mqq.app;

import android.content.Intent;
import android.os.Looper;

import com.tencent.qphone.base.remote.FromServiceMsg;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import mqq.util.MqqConnRateReport;
import mqq.util.MqqConnRateReport.EventType;

public class ServletContainer {
    private final ConcurrentHashMap<String, Set<String>> actionMap = new ConcurrentHashMap();
    private AppRuntime app;
    private ExecutorService mService = Executors.newSingleThreadExecutor(new ThreadFactory() {
        public Thread newThread(Runnable r) {
            return new Thread(r, "ServletForward");
        }
    });
    final ConcurrentHashMap<String, Servlet> managedServlet = new ConcurrentHashMap();

    public ServletContainer(AppRuntime app) {
        this.app = app;
    }

    public void forward(AppRuntime runtime, Intent intent) {
        if (this.mService.isShutdown()) {
//            QLog.e("mqq", 1, "ServletContainer has destoryed," + intent.getComponent().getClassName() + " can not be started.");
            return;
        }
        final String className = intent.getComponent().getClassName();
        final Intent form = intent;
        Runnable r = new Runnable() {
            public void run() {
                try {
                    Servlet servlet = ServletContainer.this.getServlet(className);
                    if (servlet != null) {
                        servlet.service(form);
                    }
                } catch (Exception e) {
//                    QLog.e("mqq", 1, "", e);
                }
            }
        };
        boolean runNow = false;
        if (intent instanceof NewIntent) {
            runNow = ((NewIntent) intent).runNow;
        }
        if (runNow || Thread.currentThread() != Looper.getMainLooper().getThread()) {
            r.run();
        } else {
            this.mService.execute(r);
        }
    }

    Servlet getServlet(String className) {
        Servlet servlet = (Servlet) this.managedServlet.get(className);
        if (servlet == null) {
            synchronized (this.managedServlet) {
                servlet = (Servlet) this.managedServlet.get(className);
                if (servlet == null) {
                    Class<?> cls;
                    try {
                        cls = Class.forName(className);
                        servlet = (Servlet) cls.newInstance();
                        servlet.init(this.app, this);
                        servlet.onCreate();
                        this.managedServlet.put(className, servlet);
//                        QLog.d("mqq", 1, "newServlet = " + servlet);
                        if (servlet instanceof MSFServlet) {
                            String[] actions = ((MSFServlet) servlet).getPreferSSOCommands();
                            if (actions != null) {
                                for (String action : actions) {
                                    Set<String> set = (Set) this.actionMap.get(action);
                                    if (set == null) {
                                        set = new HashSet();
                                        this.actionMap.put(action, set);
                                    }
                                    set.add(className);
                                }
                            }
                        }
                    } catch (Throwable outerT) {
                        outerT.printStackTrace();
                        return null;
                    }
                }
            }
        }
        return servlet;
    }

    public void notifyMSFServlet(Class<? extends MSFServlet> cls, FromServiceMsg res) {
        MSFServlet sendServlet = null;
        if (cls != null) {
            sendServlet = (MSFServlet) getServlet(cls.getName());
            if (sendServlet != null) {
                sendServlet.onReceive(res);
            }
        }
        Set<String> set = (Set) this.actionMap.get(res.getServiceCmd());
        if (set != null) {
            for (String className : set) {
                MSFServlet servlet = (MSFServlet) getServlet(className);
                if (servlet != null && servlet != sendServlet) {
                    servlet.onReceive(res);
                } else if (!(res == null || res.getServiceCmd() == null || !res.getServiceCmd().equals("SharpSvr.s2c"))) {
                    MqqConnRateReport.getInstance().doReport(EventType.eMSFRecvInviteMsg, res.getWupBuffer(), 20);
                }
            }
        } else if (res != null && res.getServiceCmd() != null && res.getServiceCmd().equals("SharpSvr.s2c")) {
            MqqConnRateReport.getInstance().doReport(EventType.eMSFRecvInviteMsg, res.getWupBuffer(), 19);
        }
    }

    public void destroy() {
        this.mService.shutdown();
        for (Entry<String, Servlet> entry : this.managedServlet.entrySet()) {
            ((Servlet) entry.getValue()).onDestroy();
        }
        this.managedServlet.clear();
    }
}
