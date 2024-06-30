package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotAuthGetInfo.class */
public final class GProGuildRobotAuthGetInfo {
    public String className;
    public String desc;
    public int flag;

    /* renamed from: id */
    public int f6id;
    public String method;
    public String name;
    public int needAdmin;
    public String title;

    public GProGuildRobotAuthGetInfo() {
        this.title = "";
        this.desc = "";
        this.className = "";
        this.name = "";
        this.method = "";
    }

    public String getClassName() {
        return this.className;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getId() {
        return this.f6id;
    }

    public String getMethod() {
        return this.method;
    }

    public String getName() {
        return this.name;
    }

    public int getNeedAdmin() {
        return this.needAdmin;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "GProGuildRobotAuthGetInfo{id=" + this.f6id + ",title=" + this.title + ",flag=" + this.flag + ",needAdmin=" + this.needAdmin + ",desc=" + this.desc + ",className=" + this.className + ",name=" + this.name + ",method=" + this.method + ",}";
    }

    public GProGuildRobotAuthGetInfo(int i, String str, int i2, int i3, String str2, String str3, String str4, String str5) {
        this.title = "";
        this.desc = "";
        this.className = "";
        this.name = "";
        this.method = "";
        this.f6id = i;
        this.title = str;
        this.flag = i2;
        this.needAdmin = i3;
        this.desc = str2;
        this.className = str3;
        this.name = str4;
        this.method = str5;
    }
}
