package mqq.observer;

import android.os.Bundle;
import java.util.HashMap;
import mqq.app.AppRuntime.Status;
import mqq.app.Constants.Action;
import oicq.wlogin_sdk.tools.ErrMsg;

public abstract class AccountObserver implements BusinessObserver, Action {
    public void onVerifyPasswd(String uin, boolean isSucc, String errorMsg, int errorCode, int ret, String notice, byte[] image) {
    }

    public void onVerifyPasswdImage(String uin, boolean isSucc, String errorMsg, int errorCode, String userAccount, byte[] userInput, int ret, ErrMsg lastError, byte[] image) {
    }

    public void onVerifyPasswdRefreshImage(String uin, boolean isSucc, String errorMsg, int errorCode, String userAccount, int ret, ErrMsg lastError, byte[] image) {
    }

    protected void onlineStatusChanged(boolean isSuccess, Status currentStatus, boolean isChanged, long timeStamp, boolean isLargeChanged) {
    }

    public void onLoginSuccess(String uin, String alias) {
    }

    protected void onLoginFailed(String alias, String errorMsg, String errorUrl, int ret, byte[] lhsig) {
    }

    protected void onUserCancel(String alias) {
    }

    protected void onLoginTimeout(String alias) {
    }

    public void onRegQueryAccountResp(boolean isSuccess, int code, byte[] strPromptInfo) {
    }

    public void onRegisterCommitMobileResp(boolean isSuccess, int code, byte[] strPromptInfo, byte[] mobile, String inviteCode) {
    }

    public void onRegisterQuerySmsStatResp(boolean isSuccess, int code, byte[] strPromptInfo, int next_chk_time, int total_time_over, String uin, String nick, String faceUrl, String errmsg) {
    }

    public void onRegisterSendResendSmsreqResp(boolean isSuccess, int code, byte[] strPromptInfo, int next_chk_time, int total_time_over) {
    }

    public void onRegisterCommitSmsCodeResp(boolean isSuccess, int code, String uin, String nick, String faceUrl, byte[] strPromptInfo) {
    }

    public void onRegisterCommitPassResp(boolean isSuccess, int code, String uin, byte[] contactSig, byte[] strPromptInfo) {
    }

    public void onRegisterCommitPassRespWithLhSig(boolean isSuccess, int code, String uin, byte[] contactSig, byte[] strPromptInfo, byte[] lhsig) {
    }

    public void onCheckQuickRegisterAccount(boolean isSuccess, int code, byte[] strPromptInfo) {
    }

    public void onGetQuickRegisterAccount(boolean isSuccess, int code, String uin, String phoneNum, byte[] strPromptInfo) {
    }

    public void onDeleteAccount(boolean isSuccess) {
    }

    public void onUpdateSTwxWeb(String STwxWeb) {
    }

    public void onUpdateSKey(String skey, String error) {
    }

    public void onChangeToken(boolean isSuccess, HashMap<String, Object> hashMap) {
    }

    public void onExchangeUin(String alias, String uin, String errorMsg) {
    }

    public void onGetKeyResp(String keys) {
    }

    public void onRefreshDA2(boolean succ, String uin, String da2) {
    }

    public void onRegisterCmdCallback(boolean isSuccess) {
    }

    public void onReceive(int type, boolean isSuccess, Bundle data) {
        throw new RuntimeException("Stub!");
    }
}
