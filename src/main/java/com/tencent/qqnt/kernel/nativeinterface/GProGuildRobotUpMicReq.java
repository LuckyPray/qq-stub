package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotUpMicReq.class */
public final class GProGuildRobotUpMicReq {
    public long channelId;
    public long guildId;
    public boolean needJoinPush;
    public long robotTinyid;
    public long robotUin;
    public ArrayList<Long> targetUsers;

    public GProGuildRobotUpMicReq() {
        this.targetUsers = new ArrayList<>();
    }

    public long getChannelId() {
        return this.channelId;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public boolean getNeedJoinPush() {
        return this.needJoinPush;
    }

    public long getRobotTinyid() {
        return this.robotTinyid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public ArrayList<Long> getTargetUsers() {
        return this.targetUsers;
    }

    public String toString() {
        return "GProGuildRobotUpMicReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",robotUin=" + this.robotUin + ",needJoinPush=" + this.needJoinPush + ",targetUsers=" + this.targetUsers + ",robotTinyid=" + this.robotTinyid + ",}";
    }

    public GProGuildRobotUpMicReq(long j, long j2, long j3, boolean z, ArrayList<Long> arrayList, long j4) {
        this.targetUsers = new ArrayList<>();
        this.guildId = j;
        this.channelId = j2;
        this.robotUin = j3;
        this.needJoinPush = z;
        this.targetUsers = arrayList;
        this.robotTinyid = j4;
    }
}
