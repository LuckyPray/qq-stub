package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotPermissionReq.class */
public final class GProGuildRobotPermissionReq {
    public long guildId;
    public long robotUin;

    public GProGuildRobotPermissionReq() {
    }

    public long getGuildId() {
        return this.guildId;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "GProGuildRobotPermissionReq{guildId=" + this.guildId + ",robotUin=" + this.robotUin + ",}";
    }

    public GProGuildRobotPermissionReq(long j, long j2) {
        this.guildId = j;
        this.robotUin = j2;
    }
}
