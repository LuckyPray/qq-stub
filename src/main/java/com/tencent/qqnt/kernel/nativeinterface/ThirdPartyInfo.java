package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ThirdPartyInfo.class */
public final class ThirdPartyInfo {
    public String appId;
    public String iconUrl;
    public String jumpUrl;
    public String name;

    public ThirdPartyInfo() {
        this.appId = "";
        this.iconUrl = "";
        this.name = "";
        this.jumpUrl = "";
    }

    public String getAppId() {
        return this.appId;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "ThirdPartyInfo{appId=" + this.appId + ",iconUrl=" + this.iconUrl + ",name=" + this.name + ",jumpUrl=" + this.jumpUrl + ",}";
    }

    public ThirdPartyInfo(String str, String str2, String str3, String str4) {
        this.appId = "";
        this.iconUrl = "";
        this.name = "";
        this.jumpUrl = "";
        this.appId = str;
        this.iconUrl = str2;
        this.name = str3;
        this.jumpUrl = str4;
    }
}
