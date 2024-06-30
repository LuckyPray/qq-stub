package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PanelItemInfo.class */
public final class PanelItemInfo {
    public String name = "";
    public String icon = "";
    public String url = "";
    public String color = "";
    public String fontColor = "";
    public String borderColor = "";

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

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "PanelItemInfo{name=" + this.name + ",icon=" + this.icon + ",url=" + this.url + ",color=" + this.color + ",fontColor=" + this.fontColor + ",borderColor=" + this.borderColor + ",}";
    }
}
