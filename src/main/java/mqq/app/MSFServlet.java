package mqq.app;

import android.content.Intent;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.ToServiceMsg;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class MSFServlet extends Servlet {
    public static final AtomicInteger appSeqFactory = new AtomicInteger();
    public static final String tag = "MSFServlet";
    private final Map<Integer, Intent> mIntents = new ConcurrentHashMap();

    public abstract void onReceive(Intent intent, FromServiceMsg fromServiceMsg);

    public abstract void onSend(Intent intent, Packet packet);

    public String[] getPreferSSOCommands() {
        return null;
    }

    Intent onReceive(FromServiceMsg res) {
        FromServiceMsg response = res;
        Intent intentReq = this.mIntents.remove(Integer.valueOf(response.getAppSeq()));
        onReceive(intentReq, response);
        return intentReq;
    }

    Intent removeRequest(int appSeq) {
        return this.mIntents.remove(Integer.valueOf(appSeq));
    }

    protected void onCreate() {
        super.onCreate();
    }

    public void service(Intent request) {
        Packet packet = new Packet(getAppRuntime().getAccount());
        onSend(request, packet);
        ToServiceMsg msg = packet.toMsg();
        if (msg != null) {
            sendToMSF(request, msg);
        }
    }

    protected void sendToMSF(Intent request, ToServiceMsg msg) {
        msg.setAppSeq(appSeqFactory.incrementAndGet());
        if (msg.isNeedCallback() && request != null) {
            this.mIntents.put(Integer.valueOf(msg.getAppSeq()), request);
        }
        getAppRuntime().getService().sendMessageToMSF(msg, this);
    }

    protected <T> T decodePacket(byte[] wupBuf, String wupRetName, T tmp) {
        return Packet.decodePacket(wupBuf, wupRetName, tmp);
    }
}
