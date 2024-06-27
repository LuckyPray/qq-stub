package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobot.class */
public final class GProGuildRobot {
    public long robotAppid;
    public long robotUin;
    public int status;

    public GProGuildRobot() {
    }

    public long getRobotAppid() {
        return this.robotAppid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "GProGuildRobot{robotUin=" + this.robotUin + ",robotAppid=" + this.robotAppid + ",status=" + this.status + ",}";
    }

    public GProGuildRobot(long j, long j2, int i) {
        this.robotUin = j;
        this.robotAppid = j2;
        this.status = i;
    }
}
