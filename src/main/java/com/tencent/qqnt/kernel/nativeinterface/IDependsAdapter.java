package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IDependsAdapter.class */
public interface IDependsAdapter {
    BatteryStatus getBatteryStatus();

    ArrayList<ServerAddress> getBigDataIpList(boolean z, IpType ipType);

    BigDataTicket getBigDataTicket();

    String getConfigFromUI(UIConfig uIConfig);

    Long getGroupCode();

    ArrayList<ServerAddress> getIpDirectList(String str, IpType ipType);

    SessionTicket getLoginTicket();

    byte[] getQFixConfigReqBodyBytes();

    RegisterInfo getRegisterProxyOnlineReqParam();

    void onRegisterProxyOnlineResp(int i, String str, RegisterRes registerRes);

    void onSendNetRequest(long j, String str, String str2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, int i, int i2);

    void onSendOidbRequest(long j, int i, int i2, byte[] bArr, SendRequestParam sendRequestParam, String str, HashMap<String, String> hashMap);

    void onSendSSORequest(long j, String str, byte[] bArr, SendRequestParam sendRequestParam, String str2, HashMap<String, String> hashMap, int i);

    Integer registerABatchOfMSFPushCommands(ArrayList<String> arrayList);

    void registerMSFPushCmd(String str);
}
