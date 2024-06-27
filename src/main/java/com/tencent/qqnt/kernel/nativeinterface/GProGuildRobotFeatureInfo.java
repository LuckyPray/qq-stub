package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotFeatureInfo.class */
public final class GProGuildRobotFeatureInfo {
    public String availableRangeDesc;
    public String desc;

    /* renamed from: id */
    public int f9id;
    public String name;
    public int status;

    public GProGuildRobotFeatureInfo() {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.availableRangeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAvailableRangeDesc() {
        return this.availableRangeDesc;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getId() {
        return this.f9id;
    }

    public String getName() {
        return this.name;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "GProGuildRobotFeatureInfo{id=" + this.f9id + ",name=" + this.name + ",desc=" + this.desc + ",status=" + this.status + ",availableRangeDesc=" + this.availableRangeDesc + ",}";
    }

    public GProGuildRobotFeatureInfo(int i, String str, String str2, int i2, String str3) {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.availableRangeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f9id = i;
        this.name = str;
        this.desc = str2;
        this.status = i2;
        this.availableRangeDesc = str3;
    }
}
