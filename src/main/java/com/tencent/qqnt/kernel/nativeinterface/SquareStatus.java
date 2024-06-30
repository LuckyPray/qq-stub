package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SquareStatus.class */
public final class SquareStatus {
    public String bigIcon;
    public String icon;

    /* renamed from: id */
    public int f43id;
    public String title;
    public String type;

    public SquareStatus() {
        this.title = "";
        this.type = "";
        this.icon = "";
        this.bigIcon = "";
    }

    public String getBigIcon() {
        return this.bigIcon;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getId() {
        return this.f43id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "SquareStatus{id=" + this.f43id + ",title=" + this.title + ",type=" + this.type + ",icon=" + this.icon + ",bigIcon=" + this.bigIcon + ",}";
    }

    public SquareStatus(int i, String str, String str2, String str3, String str4) {
        this.title = "";
        this.type = "";
        this.icon = "";
        this.bigIcon = "";
        this.f43id = i;
        this.title = str;
        this.type = str2;
        this.icon = str3;
        this.bigIcon = str4;
    }
}
