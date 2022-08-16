package mqq.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

@SuppressLint("MissingSuperCall")
public class BaseActivity extends Activity {

    protected static int sResumeCount = 0;
    private AppRuntime app;
    private boolean isResume;
    protected boolean mIsShadow;

    protected boolean isShadow() {
        return false;
    }

    protected void onCreate(Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    protected boolean isLatecyWaitRuntime() {
        return false;
    }

    protected void onCreateNoRuntime(Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }

    public AppRuntime waitAppRuntime() {
        throw new RuntimeException("Stub!");
    }

    void setAppRuntime(AppRuntime app2) {
        this.app = app2;
    }

    protected void onStart() {
        throw new RuntimeException("Stub!");
    }

    protected void onStop() {
        throw new RuntimeException("Stub!");
    }

    protected void onResume() {
        throw new RuntimeException("Stub!");
    }

    protected void onPause() {
        throw new RuntimeException("Stub!");
    }

    protected void onDestroy() {
        throw new RuntimeException("Stub!");
    }

    public final AppRuntime getAppRuntime() {
        return this.app;
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    protected void onAccountChanged() {
    }

    protected void onAccoutChangeFailed() {
    }

    protected void onLogout(Constants.LogoutReason reason) {
        throw new RuntimeException("Stub!");
    }

    public final void superFinish() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isResume() {
        return this.isResume;
    }
}
