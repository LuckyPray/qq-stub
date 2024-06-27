package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RemoveRobotFromGroupReq.class */
public final class RemoveRobotFromGroupReq {
    public long groupId;
    public long robotUin;

    public RemoveRobotFromGroupReq() {
    }

    public long getGroupId() {
        return this.groupId;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "RemoveRobotFromGroupReq{groupId=" + this.groupId + ",robotUin=" + this.robotUin + ",}";
    }

    public RemoveRobotFromGroupReq(long j, long j2) {
        this.groupId = j;
        this.robotUin = j2;
    }
}
