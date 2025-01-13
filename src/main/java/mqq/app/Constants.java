package mqq.app;

public interface Constants {
    String FILE_INSTANCE_STATE = "savedInstanceState";
    String OPEN_SDK = "com.tencent.mobileqq:openSdk";

    interface Action {
        int ACTION_APP_GUARD = 2200;
        int ACTION_CHANGE_TOKEN = 1032;
        int ACTION_DELETE_ACCOUNT = 1007;
        int ACTION_GET_ALTER_TICKETS = 2124;
        int ACTION_GET_KEY = 1030;
        int ACTION_GET_PLUGIN_CONFIG = 1018;
        int ACTION_GET_RICH_MEDIA_SERVER_LIST = 1011;
        int ACTION_GET_TICKET_NO_PASSWD = 1101;
        int ACTION_LOGIN = 1001;
        int ACTION_NET_EXCEPTION_EVENT = 1042;
        int ACTION_NOTIFY_REFRESH_WEBVIEW_TICKET = 2123;
        int ACTION_QUERY_SMS_STATE = 1022;
        int ACTION_REGISTNEWACCOUNT_COMMITMOBILE = 1003;
        int ACTION_REGISTNEWACCOUNT_COMMITSMS = 1004;
        int ACTION_REGISTNEWACCOUNT_QUERYMOBILE = 1041;
        int ACTION_REGISTNEWACCOUNT_REFETCH_SMS = 1020;
        int ACTION_REGISTNEWACCOUNT_SEND_PASSWORD = 1005;
        int ACTION_REGIST_COMMAND_PUSH = 1040;
        int ACTION_REGIST_MESSAGE_PUSH = 1002;
        int ACTION_REGIST_MESSAGE_PUSH_PROXY = 1025;
        int ACTION_REPORT = 1012;
        int ACTION_SEND_WIRELESS_MEIBAOREQ = 1044;
        int ACTION_SEND_WIRELESS_PSWREQ = 1043;
        int ACTION_SSO_GET_A1_WITH_A1 = 1102;
        int ACTION_SSO_LOGIN_ACCOUNT = 1100;
        int ACTION_SUBACCOUNT_GETKEY = 1037;
        int ACTION_SUBACCOUNT_LOGIN = 1035;
        int ACTION_UNREGIST_MESSAGE_PUSH_PROXY = 1026;
        int ACTION_UNREGIST_PROXY = 1028;
        int ACTION_VERITYCODE_CLOSE = 1024;
        int ACTION_VERITYCODE_RECV = 1023;
        int ACTION_WTLOGIN_AskDevLockSms = 2109;
        int ACTION_WTLOGIN_CheckDevLockSms = 2110;
        int ACTION_WTLOGIN_CheckDevLockStatus = 2108;
        int ACTION_WTLOGIN_CheckPictureAndGetSt = 2102;
        int ACTION_WTLOGIN_CheckSMSAndGetSt = 2113;
        int ACTION_WTLOGIN_CheckSMSAndGetStExt = 2114;
        int ACTION_WTLOGIN_CheckSMSVerifyLoginAccount = 2118;
        int ACTION_WTLOGIN_CloseCode = 2105;
        int ACTION_WTLOGIN_CloseDevLock = 2111;
        int ACTION_WTLOGIN_Exception = 2107;
        int ACTION_WTLOGIN_GetA1WithA1 = 2106;
        int ACTION_WTLOGIN_GetStViaSMSVerifyLogin = 2121;
        int ACTION_WTLOGIN_GetStWithPasswd = 2100;
        int ACTION_WTLOGIN_GetStWithoutPasswd = 2101;
        int ACTION_WTLOGIN_GetSubaccountStViaSMSVerifyLogin = 2122;
        int ACTION_WTLOGIN_RefreshPictureData = 2103;
        int ACTION_WTLOGIN_RefreshSMSData = 2112;
        int ACTION_WTLOGIN_RefreshSMSVerifyLoginCode = 2119;
        int ACTION_WTLOGIN_RegGetSMSVerifyLoginAccount = 2117;
        int ACTION_WTLOGIN_VerifyCode = 2104;
        int ACTION_WTLOGIN_VerifySMSVerifyLoginCode = 2120;
        int ACTION_WTLOGIN_setRegDevLockFlag = 2125;
    }

    enum Key {
        nickname,
        _logintime,
        SvcRegister_timeStamp,
        currentAccount
    }

    enum LogoutReason {
        user,
        expired,
        gray,
        kicked,
        tips,
        suspend,
        forceLogout,
        switchAccount,
        secKicked
    }

    enum PropertiesKey {
        uinDisplayName,
        nickName;

        public String toString() {
            return name();
        }
    }
}
