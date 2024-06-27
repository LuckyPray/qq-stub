package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotRedPoint.class */
public final class GroupRobotRedPoint {
    public long endTs;
    public long robotUin;
    public int role;

    public GroupRobotRedPoint() {
    }

    public long getEndTs() {
        return this.endTs;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public int getRole() {
        return this.role;
    }

    public String toString() {
        return "GroupRobotRedPoint{robotUin=" + this.robotUin + ",endTs=" + this.endTs + ",role=" + this.role + ",}";
    }

    public GroupRobotRedPoint(long j, long j2, int i) {
        this.robotUin = j;
        this.endTs = j2;
        this.role = i;
    }
}
