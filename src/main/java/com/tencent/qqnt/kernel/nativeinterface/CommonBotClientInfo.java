package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CommonBotClientInfo.class */
public final class CommonBotClientInfo {
    public int buildNum;
    public int platform;
    public String version;

    public CommonBotClientInfo() {
        this.version = "";
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
        return "CommonBotClientInfo{platform=" + this.platform + ",version=" + this.version + ",buildNum=" + this.buildNum + ",}";
    }

    public CommonBotClientInfo(int i, String str, int i2) {
        this.version = "";
        this.platform = i;
        this.version = str;
        this.buildNum = i2;
    }
}
