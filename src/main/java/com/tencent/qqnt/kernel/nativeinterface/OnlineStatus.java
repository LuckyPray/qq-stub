package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OnlineStatus.class */
public final class OnlineStatus {
    public String bigIcon;
    public String icon;

    /* renamed from: id */
    public int f29id;
    public String md5;
    public String normalBackground;
    public String normalBgColor;
    public String posterStatusTextColor;
    public String posterText;
    public String resUrl;
    public String selectColor;
    public ArrayList<OnlineStatusSubActionItem> subActionItems;
    public String title;
    public String tofuBackground;
    public String type;

    public OnlineStatus() {
        this.title = "";
        this.type = "";
        this.icon = "";
        this.bigIcon = "";
        this.resUrl = "";
        this.md5 = "";
        this.normalBackground = "";
        this.normalBgColor = "";
        this.tofuBackground = "";
        this.posterText = "";
        this.posterStatusTextColor = "";
        this.selectColor = "";
        this.subActionItems = new ArrayList<>();
    }

    public String getBigIcon() {
        return this.bigIcon;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getId() {
        return this.f29id;
    }

    public String getMd5() {
        return this.md5;
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

    public String getResUrl() {
        return this.resUrl;
    }

    public String getSelectColor() {
        return this.selectColor;
    }

    public ArrayList<OnlineStatusSubActionItem> getSubActionItems() {
        return this.subActionItems;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTofuBackground() {
        return this.tofuBackground;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "OnlineStatus{id=" + this.f29id + ",title=" + this.title + ",type=" + this.type + ",icon=" + this.icon + ",bigIcon=" + this.bigIcon + ",resUrl=" + this.resUrl + ",md5=" + this.md5 + ",normalBackground=" + this.normalBackground + ",normalBgColor=" + this.normalBgColor + ",tofuBackground=" + this.tofuBackground + ",posterText=" + this.posterText + ",posterStatusTextColor=" + this.posterStatusTextColor + ",selectColor=" + this.selectColor + ",subActionItems=" + this.subActionItems + ",}";
    }

    public OnlineStatus(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList<OnlineStatusSubActionItem> arrayList) {
        this.title = "";
        this.type = "";
        this.icon = "";
        this.bigIcon = "";
        this.resUrl = "";
        this.md5 = "";
        this.normalBackground = "";
        this.normalBgColor = "";
        this.tofuBackground = "";
        this.posterText = "";
        this.posterStatusTextColor = "";
        this.selectColor = "";
        this.subActionItems = new ArrayList<>();
        this.f29id = i;
        this.title = str;
        this.type = str2;
        this.icon = str3;
        this.bigIcon = str4;
        this.resUrl = str5;
        this.md5 = str6;
        this.normalBackground = str7;
        this.normalBgColor = str8;
        this.tofuBackground = str9;
        this.posterText = str10;
        this.posterStatusTextColor = str11;
        this.selectColor = str12;
        this.subActionItems = arrayList;
    }
}
