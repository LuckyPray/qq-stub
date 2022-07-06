package mqq.observer;

import java.util.HashMap;

public interface HttpVerifyHandler {
    void cancelVerifyCode(String str, HashMap hashMap);

    void refreVerifyCode(String str, HashMap hashMap);

    void submitVerifyCode(String str, HashMap hashMap, String str2);
}
