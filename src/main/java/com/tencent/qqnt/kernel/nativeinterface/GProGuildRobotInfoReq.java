package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotInfoReq.class */
public final class GProGuildRobotInfoReq {
    public long channelId;
    public GProGuildRobotClientInfo clientInfo;
    public long featureScene;
    public int fetchScene;
    public long guildId;
    public long robotAppid;
    public long robotTid;
    public long robotUin;

    public GProGuildRobotInfoReq() {
        this.clientInfo = new GProGuildRobotClientInfo();
    }

    public long getChannelId() {
        return this.channelId;
    }

    public GProGuildRobotClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public long getFeatureScene() {
        return this.featureScene;
    }

    public int getFetchScene() {
        return this.fetchScene;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public long getRobotAppid() {
        return this.robotAppid;
    }

    public long getRobotTid() {
        return this.robotTid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "GProGuildRobotInfoReq{guildId=" + this.guildId + ",robotUin=" + this.robotUin + ",robotTid=" + this.robotTid + ",channelId=" + this.channelId + ",clientInfo=" + this.clientInfo + ",fetchScene=" + this.fetchScene + ",featureScene=" + this.featureScene + ",robotAppid=" + this.robotAppid + ",}";
    }

    public GProGuildRobotInfoReq(long j, long j2, long j3, long j4, GProGuildRobotClientInfo gProGuildRobotClientInfo, int i, long j5, long j6) {
        this.clientInfo = new GProGuildRobotClientInfo();
        this.guildId = j;
        this.robotUin = j2;
        this.robotTid = j3;
        this.channelId = j4;
        this.clientInfo = gProGuildRobotClientInfo;
        this.fetchScene = i;
        this.featureScene = j5;
        this.robotAppid = j6;
    }
}
