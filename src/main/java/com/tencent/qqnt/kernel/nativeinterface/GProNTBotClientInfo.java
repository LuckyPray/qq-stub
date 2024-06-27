package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProNTBotClientInfo.class */
public final class GProNTBotClientInfo {
    public int buildNum;
    public int platform;
    public String version;

    public GProNTBotClientInfo() {
        this.version = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getBuildNum() {
        return this.buildNum;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "GProNTBotClientInfo{platform=" + this.platform + ",version=" + this.version + ",buildNum=" + this.buildNum + ",}";
    }

    public GProNTBotClientInfo(int i, String str, int i2) {
        this.version = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.platform = i;
        this.version = str;
        this.buildNum = i2;
    }
}
