package mqq.app;

import com.tencent.qphone.base.remote.ToServiceMsg;

public class MainService {
    public static final String MSFPROCESSNAMETAG = ":MSF";
    public static final String QQPROCESSNAME = "com.tencent.mobileqq";
    private static final String TAG = MainService.class.getSimpleName();
    public static boolean isDebugVersion = false;
    public static boolean isGrayVersion = false;
    public static final String msfServiceName = "com.tencent.mobileqq.msf.service.MsfService";

    void sendMessageToMSF(ToServiceMsg request, MSFServlet servlet) {
        throw new RuntimeException("Stub!");
    }
}
