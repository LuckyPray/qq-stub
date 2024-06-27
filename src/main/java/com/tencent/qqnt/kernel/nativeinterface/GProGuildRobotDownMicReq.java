package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotDownMicReq.class */
public final class GProGuildRobotDownMicReq {
    public long channelId;
    public long guildId;
    public long robotTinyid;
    public long robotUin;

    public GProGuildRobotDownMicReq() {
    }

    public long getChannelId() {
        return this.channelId;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public long getRobotTinyid() {
        return this.robotTinyid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "GProGuildRobotDownMicReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",robotUin=" + this.robotUin + ",robotTinyid=" + this.robotTinyid + ",}";
    }

    public GProGuildRobotDownMicReq(long j, long j2, long j3, long j4) {
        this.guildId = j;
        this.channelId = j2;
        this.robotUin = j3;
        this.robotTinyid = j4;
    }
}
