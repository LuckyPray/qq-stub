package mqq.app;

import android.content.Intent;
import android.os.Bundle;
import mqq.observer.BusinessObserver;

public abstract class Servlet {
    private ServletContainer container;
    private AppRuntime mAppRuntime;

    public abstract void service(Intent intent);

    protected void onCreate() {
    }

    protected void onDestroy() {
    }

    void init(AppRuntime runtime, ServletContainer container) {
        this.mAppRuntime = runtime;
        this.container = container;
    }

    ServletContainer getServletContainer() {
        return this.container;
    }

    public AppRuntime getAppRuntime() {
        return this.mAppRuntime;
    }

    public void notifyObserver(Intent request, int type, boolean isSuccess, Bundle data, Class<? extends BusinessObserver> filter) {
        if (request instanceof NewIntent) {
            BusinessObserver observer = ((NewIntent) request).getObserver();
            if (observer != null) {
                getAppRuntime().notifyObserver(observer, type, isSuccess, data);
            }
        }
        getAppRuntime().notifyObservers(filter, type, isSuccess, data);
    }
}
