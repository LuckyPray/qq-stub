package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NearbyProClientInfo.class */
public final class NearbyProClientInfo {
    public String device;
    public int platform;
    public String qqVer;

    public NearbyProClientInfo() {
        this.qqVer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.device = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getDevice() {
        return this.device;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getQqVer() {
        return this.qqVer;
    }

    public String toString() {
        return "NearbyProClientInfo{qqVer=" + this.qqVer + ",device=" + this.device + ",platform=" + this.platform + ",}";
    }

    public NearbyProClientInfo(String str, String str2, int i) {
        this.qqVer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.device = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.qqVer = str;
        this.device = str2;
        this.platform = i;
    }
}
