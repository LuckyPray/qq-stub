package mqq.util;

import android.os.Environment;

public class MqqConnRateReport {
    public static final int ERR_MSF_RECV_APPPROCESSMANAGER_APPPROCESSINFO_ISNULL = 8;
    public static final int ERR_MSF_RECV_APPPROCESSMANAGER_HALF_CLOSE = 10;
    public static final int ERR_MSF_RECV_APPPROCESSMANAGER_NEEDBOOT_TIMEOUT = 14;
    public static final int ERR_MSF_RECV_APPPROCESSMANAGER_PROCESSNAME_ISEMPTY = 7;
    public static final int ERR_MSF_RECV_APPPROCESSMANAGER_PROCESS_ISDIED = 9;
    public static final int ERR_MSF_RECV_APPPROCESSMANAGER_RECVRESPONSE_DEAD_OBJECT = 11;
    public static final int ERR_MSF_RECV_APPPROCESSMANAGER_RECVRESPONSE_EXCEPTION = 12;
    public static final int ERR_MSF_RECV_APPPROCESSMANAGER_SENDTIME = 13;
    public static final int ERR_MSF_RECV_FROMSERVICEMSG_NOTSUCCESS = 3;
    public static final int ERR_MSF_RECV_HANDLECMDPUSH_APPPUSH_ISNULL = 6;
    public static final int ERR_MSF_RECV_HANDLECMDPUSH_CMDNOT_FIND = 5;
    public static final int ERR_MSF_RECV_HANDLECMDPUSH_UIN_NOTEQUAL = 4;
    public static final int ERR_MSF_RECV_MSFRESPUTIL_PUSHHANDLER_ISNULL = 18;
    public static final int ERR_MSF_RECV_MSFSERVICEPROXY_ISPUSHCONFIG = 17;
    public static final int ERR_MSF_RECV_MSFSERVICEPROXY_NOTCONNECT_MSF = 16;
    public static final int ERR_MSF_RECV_MSFSERVICEPROXY_TOKENEXPIRED = 15;
    public static final int ERR_MSF_RECV_REASON1 = 1;
    public static final int ERR_MSF_RECV_SERVLETCONTAINER_SERVLET_ISNULL_OR_EQUALSEND = 20;
    public static final int ERR_MSF_RECV_SERVLETCONTAINER_SET_ISNULL = 19;
    public static final int ERR_MSF_RECV_TOSERVICEMSG_NOTNULL = 2;
    public static final int ERR_MSF_SEND_VIDEOACK_REASON1 = 100;
    public static final int ERR_NONE = 0;
    public static final String TAG = "MqqConnRateReport";
    static MqqConnRateReport g_Instance;
    static String msfReportLogPath = "";

    public enum EventType {
        eNone,
        eMSFRecvInviteMsg,
        eMSFTransferInviteMsg,
        eVideoServletCreate,
        eVideoAddMsg,
        eVideoMSFReceiverProcess,
        eVideoRecvInviteMsg,
        eVideoSendACK,
        eMSFSendVideoACK
    }

    public static MqqConnRateReport getInstance() {
        if (g_Instance == null) {
            g_Instance = new MqqConnRateReport();
            msfReportLogPath = Environment.getExternalStorageDirectory().getPath() + "/tencent/audio/";
        }
        return g_Instance;
    }

    public void doReport(EventType r13, byte[] r14, int r15) {
        throw new RuntimeException("Stub!");}
}
