package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InitThirdPartySigConfig.class */
public final class InitThirdPartySigConfig {
    public String bid;
    public int clientip;
    public String commonPath = "";
    public String openidPath = "";
    public String clientVer = "";
    public String guid = "";
    public String platVer = "";
    public String hostName = "";
    public LoginPlatform platform = LoginPlatform.values()[0];
    public String deviceType = "";
    public String qua = "";

    public String getBid() {
        return this.bid;
    }

    public String getClientVer() {
        return this.clientVer;
    }

    public int getClientip() {
        return this.clientip;
    }

    public String getCommonPath() {
        return this.commonPath;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getGuid() {
        return this.guid;
    }

    public String getHostName() {
        return this.hostName;
    }

    public String getOpenidPath() {
        return this.openidPath;
    }

    public String getPlatVer() {
        return this.platVer;
    }

    public LoginPlatform getPlatform() {
        return this.platform;
    }

    public String getQua() {
        return this.qua;
    }

    public String toString() {
        return "InitThirdPartySigConfig{commonPath=" + this.commonPath + ",openidPath=" + this.openidPath + ",clientVer=" + this.clientVer + ",guid=" + this.guid + ",platVer=" + this.platVer + ",hostName=" + this.hostName + ",platform=" + this.platform + ",deviceType=" + this.deviceType + ",qua=" + this.qua + ",bid=" + this.bid + ",clientip=" + this.clientip + ",}";
    }
}
