package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InitQRConfig.class */
public final class InitQRConfig {
    public String appName;
    public int appid;
    public String deviceName;
    public String guid;
    public String version;

    public InitQRConfig() {
        this.appName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.version = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.deviceName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAppName() {
        return this.appName;
    }

    public int getAppid() {
        return this.appid;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getGuid() {
        return this.guid;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "InitQRConfig{appid=" + this.appid + ",appName=" + this.appName + ",version=" + this.version + ",deviceName=" + this.deviceName + ",guid=" + this.guid + ",}";
    }

    public InitQRConfig(int i, String str, String str2, String str3, String str4) {
        this.appName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.version = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.deviceName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.appid = i;
        this.appName = str;
        this.version = str2;
        this.deviceName = str3;
        this.guid = str4;
    }
}
