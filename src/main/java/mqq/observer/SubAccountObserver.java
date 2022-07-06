package mqq.observer;

import android.os.Bundle;
import com.tencent.qphone.base.BaseConstants;
import mqq.app.Constants.Action;

public abstract class SubAccountObserver implements BusinessObserver, Action {
    protected void onGetKeyBack(String mainAccount, String subAccount, String key) {
    }

    public void onLoginSuccess(String mainAccount, String uin, String alias) {
    }

    protected void onLoginFailed(String mainAccount, String uin, String alias, String errorMsg) {
    }

    protected void onUserCancel(String mainAccount, String uin, String alias) {
    }

    protected void onLoginTimeout(String mainAccount, String uin, String alias) {
    }

    public void onReceive(int type, boolean isSuccess, Bundle data) {
        throw new RuntimeException("Stub!");
    }
}
