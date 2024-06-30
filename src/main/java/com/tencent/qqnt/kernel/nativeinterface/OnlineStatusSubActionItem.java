package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OnlineStatusSubActionItem.class */
public final class OnlineStatusSubActionItem {
    public String normalBackground;
    public String normalBgColor;
    public String posterStatusTextColor;
    public String posterText;
    public String selectColor;
    public String tofuBackground;

    public OnlineStatusSubActionItem() {
        this.normalBackground = "";
        this.normalBgColor = "";
        this.tofuBackground = "";
        this.posterText = "";
        this.posterStatusTextColor = "";
        this.selectColor = "";
    }

    public String getNormalBackground() {
        return this.normalBackground;
    }

    public String getNormalBgColor() {
        return this.normalBgColor;
    }

    public String getPosterStatusTextColor() {
        return this.posterStatusTextColor;
    }

    public String getPosterText() {
        return this.posterText;
    }

    public String getSelectColor() {
        return this.selectColor;
    }

    public String getTofuBackground() {
        return this.tofuBackground;
    }

    public String toString() {
        return "OnlineStatusSubActionItem{normalBackground=" + this.normalBackground + ",normalBgColor=" + this.normalBgColor + ",tofuBackground=" + this.tofuBackground + ",posterText=" + this.posterText + ",posterStatusTextColor=" + this.posterStatusTextColor + ",selectColor=" + this.selectColor + ",}";
    }

    public OnlineStatusSubActionItem(String str, String str2, String str3, String str4, String str5, String str6) {
        this.normalBackground = "";
        this.normalBgColor = "";
        this.tofuBackground = "";
        this.posterText = "";
        this.posterStatusTextColor = "";
        this.selectColor = "";
        this.normalBackground = str;
        this.normalBgColor = str2;
        this.tofuBackground = str3;
        this.posterText = str4;
        this.posterStatusTextColor = str5;
        this.selectColor = str6;
    }
}
