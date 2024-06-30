package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotPanelListItemInfo.class */
public final class GProGuildRobotPanelListItemInfo {
    public String borderColor;
    public String color;
    public String fontColor;
    public String icon;
    public String title;
    public String url;

    public GProGuildRobotPanelListItemInfo() {
        this.title = "";
        this.icon = "";
        this.url = "";
        this.color = "";
        this.fontColor = "";
        this.borderColor = "";
    }

    public String getBorderColor() {
        return this.borderColor;
    }

    public String getColor() {
        return this.color;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "GProGuildRobotPanelListItemInfo{title=" + this.title + ",icon=" + this.icon + ",url=" + this.url + ",color=" + this.color + ",fontColor=" + this.fontColor + ",borderColor=" + this.borderColor + ",}";
    }

    public GProGuildRobotPanelListItemInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.title = "";
        this.icon = "";
        this.url = "";
        this.color = "";
        this.fontColor = "";
        this.borderColor = "";
        this.title = str;
        this.icon = str2;
        this.url = str3;
        this.color = str4;
        this.fontColor = str5;
        this.borderColor = str6;
    }
}
