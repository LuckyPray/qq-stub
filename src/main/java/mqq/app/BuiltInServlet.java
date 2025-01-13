package mqq.app;

import android.content.Intent;

import com.tencent.qphone.base.remote.FromServiceMsg;

import java.util.HashMap;

import mqq.app.Constants.Action;

public class BuiltInServlet extends MSFServlet implements Action {
    private boolean isRegist;

    BuiltInServlet() {
    }

    static boolean isQQUin(String uin) {
        try {
            long uinNum = Long.parseLong(uin);
            return uinNum > 9999 && uinNum < 4000000000L;
        } catch (Exception e) {
            return false;
        }
    }

    public void service(Intent request) {
        throw new RuntimeException("Stub!");
    }

    public void onSend(Intent request, Packet packet) {
        throw new RuntimeException("Stub!");
    }

    public void onReceive(Intent request, FromServiceMsg response) {
        throw new RuntimeException("Stub!");
    }

    public void report(String uin, boolean success, String eventName, long duration, long size, HashMap<String, String> params, boolean flush) {
        throw new RuntimeException("Stub!");
    }
}
