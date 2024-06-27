package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotCardRecommendReq.class */
public final class GProGuildRobotCardRecommendReq {
    public long channelId;
    public long guildId;

    public GProGuildRobotCardRecommendReq() {
    }

    public long getChannelId() {
        return this.channelId;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public String toString() {
        return "GProGuildRobotCardRecommendReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",}";
    }

    public GProGuildRobotCardRecommendReq(long j, long j2) {
        this.guildId = j;
        this.channelId = j2;
    }
}
