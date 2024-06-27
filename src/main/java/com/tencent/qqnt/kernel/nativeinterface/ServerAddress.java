package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ServerAddress.class */
public final class ServerAddress {

    /* renamed from: ip */
    public String f40ip;
    public int port;

    public ServerAddress() {
        this.f40ip = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getIp() {
        return this.f40ip;
    }

    public int getPort() {
        return this.port;
    }

    public String toString() {
        return "ServerAddress{ip=" + this.f40ip + ",port=" + this.port + ",}";
    }

    public ServerAddress(String str, int i) {
        this.f40ip = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f40ip = str;
        this.port = i;
    }
}
