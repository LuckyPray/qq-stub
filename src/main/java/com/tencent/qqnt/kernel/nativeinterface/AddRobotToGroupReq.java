package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AddRobotToGroupReq.class */
public final class AddRobotToGroupReq {
    public long groupId;
    public long robotUin;

    public AddRobotToGroupReq() {
    }

    public long getGroupId() {
        return this.groupId;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "AddRobotToGroupReq{groupId=" + this.groupId + ",robotUin=" + this.robotUin + ",}";
    }

    public AddRobotToGroupReq(long j, long j2) {
        this.groupId = j;
        this.robotUin = j2;
    }
}
