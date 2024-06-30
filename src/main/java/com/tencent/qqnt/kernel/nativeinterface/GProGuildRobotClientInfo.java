package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotClientInfo.class */
public final class GProGuildRobotClientInfo {
    public int buildNum;
    public int platform;
    public String version;

    public GProGuildRobotClientInfo() {
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
        return "GProGuildRobotClientInfo{platform=" + this.platform + ",version=" + this.version + ",buildNum=" + this.buildNum + ",}";
    }

    public GProGuildRobotClientInfo(int i, String str, int i2) {
        this.version = "";
        this.platform = i;
        this.version = str;
        this.buildNum = i2;
    }
}
