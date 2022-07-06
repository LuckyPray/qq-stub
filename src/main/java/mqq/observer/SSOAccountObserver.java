package mqq.observer;

import android.os.Bundle;

import mqq.app.Constants.Action;

public class SSOAccountObserver implements BusinessObserver, Action {
    public static final String TAG = "SSOAccountObserver";

    public void onReceive(int action, boolean isSuccess, Bundle data) {
        int code = data.getInt("code");
        String ssoAccount = data.getString("ssoAccount");
        int targetTicket = data.getInt("targetTicket", 4096);
        int ret = data.getInt("ret");
        byte[] wtTicketArr = data.getByteArray("wtTicket");
//        if (QLog.isColorLevel()) {
//            Object obj;
//            String str = TAG;
//            StringBuilder append = new StringBuilder().append("account:").append(ssoAccount).append(" action:").append(action).append(" code:").append(code).append(" isSuccess:").append(isSuccess).append(" ret:").append(ret).append(" wtTicketArr:");
//            if (wtTicketArr == null) {
//                obj = "null";
//            } else {
//                obj = Integer.valueOf(wtTicketArr.length);
//            }
//            QLog.d(str, 2, append.append(obj).toString());
//        }
        boolean result = false;
        if (ret == 0) {
            result = true;
        }
        switch (action) {
            case Action.ACTION_SSO_LOGIN_ACCOUNT /*1100*/:
            case 1101:
                if (wtTicketArr == null || wtTicketArr.length == 0) {
                    result = false;
                }
                if (result) {
                    if (action == Action.ACTION_SSO_LOGIN_ACCOUNT) {
                        onLoginSuccess(ssoAccount, wtTicketArr, targetTicket, data);
                        return;
                    } else if (action == 1101) {
                        onGetTicketNoPasswd(ssoAccount, wtTicketArr, targetTicket, data);
                        return;
                    } else {
                        return;
                    }
                } else if (code == 2006) {
                    onUserCancel(ssoAccount, action, data);
                    return;
                } else {
                    onFailed(ssoAccount, action, ret, data);
                    return;
                }
            case 1102:
                if (wtTicketArr == null || wtTicketArr.length == 0) {
                    result = false;
                }
                if (result) {
                    onGetA1WithA1(ssoAccount, ret, wtTicketArr, targetTicket, data);
                    return;
                } else if (code == 2006) {
                    onUserCancel(ssoAccount, action, data);
                    return;
                } else {
                    onFailed(ssoAccount, action, ret, data);
                    return;
                }
            default:
                return;
        }
    }

    public void onLoginSuccess(String ssoAccount, byte[] wtTicket, int targetTicket, Bundle data) {
    }

    public void onGetTicketNoPasswd(String ssoAccount, byte[] wtTicket, int targetTicket, Bundle data) {
    }

    public void onGetA1WithA1(String ssoAccount, int ret, byte[] wtTicket, int targetTicket, Bundle data) {
    }

    public void onUserCancel(String ssoAccount, int action, Bundle data) {
    }

    public void onFailed(String ssoAccount, int action, int ret, Bundle data) {
    }
}
