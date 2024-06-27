package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProAudioLiveRobotStatusReq.class */
public final class GProAudioLiveRobotStatusReq {
    public ArrayList<Long> botIds;
    public long channelId;
    public long guildId;

    public GProAudioLiveRobotStatusReq() {
        this.botIds = new ArrayList<>();
    }

    public ArrayList<Long> getBotIds() {
        return this.botIds;
    }

    public long getChannelId() {
        return this.channelId;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public String toString() {
        return "GProAudioLiveRobotStatusReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",botIds=" + this.botIds + ",}";
    }

    public GProAudioLiveRobotStatusReq(long j, long j2, ArrayList<Long> arrayList) {
        this.botIds = new ArrayList<>();
        this.guildId = j;
        this.channelId = j2;
        this.botIds = arrayList;
    }
}
