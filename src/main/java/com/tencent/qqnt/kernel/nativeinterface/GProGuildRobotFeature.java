package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotFeature.class */
public final class GProGuildRobotFeature {

    /* renamed from: id */
    public int f8id;
    public String name;

    public GProGuildRobotFeature() {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getId() {
        return this.f8id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "GProGuildRobotFeature{id=" + this.f8id + ",name=" + this.name + ",}";
    }

    public GProGuildRobotFeature(int i, String str) {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f8id = i;
        this.name = str;
    }
}
