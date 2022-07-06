package mqq.observer;

import android.os.Bundle;

import mqq.app.Constants.Action;

public class SSOAccountObserver implements BusinessObserver, Action {
    public static final String TAG = "SSOAccountObserver";

    public void onReceive(int action, boolean isSuccess, Bundle data) {
        throw new RuntimeException("Stub!");
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
