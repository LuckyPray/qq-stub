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
        switch (type) {
            case Action.ACTION_SUBACCOUNT_LOGIN /*1035*/:
                int logincode = data.getInt("code");
                String alias = data.getString("alias");
                String subaccountUin = data.getString("uin");
                String submainaccount = data.getString("submainaccount");
//                QLog.d("mqq", 2, "SubAccountObserver onReceive ACTION_SUBACCOUNT_LOGIN  isSuccess = " + isSuccess);
                if (isSuccess) {
                    onLoginSuccess(submainaccount, subaccountUin, alias);
                    return;
                } else if (logincode == 1002 || logincode == BaseConstants.CODE_APPTIMEOUT) {
                    onLoginTimeout(submainaccount, subaccountUin, alias);
                    return;
                } else if (logincode == 2006) {
                    onUserCancel(submainaccount, subaccountUin, alias);
                    return;
                } else {
                    onLoginFailed(submainaccount, subaccountUin, alias, data.getString("error"));
                    return;
                }
            case Action.ACTION_SUBACCOUNT_GETKEY /*1037*/:
                String getUinGetKey = data.getString("uin");
                String errorGetKey = data.getString("error");
                int codeGetKey = data.getInt("code");
                onGetKeyBack(data.getString("mainaccount"), getUinGetKey, data.getString("subaccountA2"));
                return;
            default:
                return;
        }
    }
}
