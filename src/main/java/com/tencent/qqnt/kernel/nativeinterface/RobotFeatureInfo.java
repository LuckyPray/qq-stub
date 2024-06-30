package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotFeatureInfo.class */
public final class RobotFeatureInfo {
    public int cid;
    public int status;
    public String name = "";
    public String desc = "";
    public String availableRangeDesc = "";

    public String getAvailableRangeDesc() {
        return this.availableRangeDesc;
    }

    public int getCid() {
        return this.cid;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getName() {
        return this.name;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "RobotFeatureInfo{cid=" + this.cid + ",name=" + this.name + ",desc=" + this.desc + ",status=" + this.status + ",availableRangeDesc=" + this.availableRangeDesc + ",}";
    }
}
