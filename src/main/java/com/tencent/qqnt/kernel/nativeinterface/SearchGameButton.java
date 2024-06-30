package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGameButton.class */
public final class SearchGameButton {
    public String appId = "";
    public String channelId = "";
    public String pkgName = "";
    public String name = "";
    public String icon = "";
    public String url = "";
    public String appSize = "";
    public String businessChannel = "";
    public SearchReportInfo reportInfo = new SearchReportInfo();

    public String getAppId() {
        return this.appId;
    }

    public String getAppSize() {
        return this.appSize;
    }

    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "SearchGameButton{appId=" + this.appId + ",channelId=" + this.channelId + ",pkgName=" + this.pkgName + ",name=" + this.name + ",icon=" + this.icon + ",url=" + this.url + ",appSize=" + this.appSize + ",businessChannel=" + this.businessChannel + ",reportInfo=" + this.reportInfo + ",}";
    }
}
