package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotAuthSetInfo.class */
public final class GProGuildRobotAuthSetInfo {
    public int flag;

    /* renamed from: id */
    public int f7id;

    public GProGuildRobotAuthSetInfo() {
    }

    public int getFlag() {
        return this.flag;
    }

    public int getId() {
        return this.f7id;
    }

    public String toString() {
        return "GProGuildRobotAuthSetInfo{id=" + this.f7id + ",flag=" + this.flag + ",}";
    }

    public GProGuildRobotAuthSetInfo(int i, int i2) {
        this.f7id = i;
        this.flag = i2;
    }
}
