package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProAudioLiveRobotStatusRspInfo.class */
public final class GProAudioLiveRobotStatusRspInfo {
    public long botId;
    public long botTrtcId;
    public long botUin;
    public long channelId;
    public int detailType;
    public String detailUrl;
    public String statusText;
    public int statusType;

    public GProAudioLiveRobotStatusRspInfo() {
        this.statusText = "";
        this.detailUrl = "";
    }

    public long getBotId() {
        return this.botId;
    }

    public long getBotTrtcId() {
        return this.botTrtcId;
    }

    public long getBotUin() {
        return this.botUin;
    }

    public long getChannelId() {
        return this.channelId;
    }

    public int getDetailType() {
        return this.detailType;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public String getStatusText() {
        return this.statusText;
    }

    public int getStatusType() {
        return this.statusType;
    }

    public String toString() {
        return "GProAudioLiveRobotStatusRspInfo{channelId=" + this.channelId + ",botId=" + this.botId + ",botUin=" + this.botUin + ",statusType=" + this.statusType + ",statusText=" + this.statusText + ",detailUrl=" + this.detailUrl + ",detailType=" + this.detailType + ",botTrtcId=" + this.botTrtcId + ",}";
    }

    public GProAudioLiveRobotStatusRspInfo(long j, long j2, long j3, int i, String str, String str2, int i2, long j4) {
        this.statusText = "";
        this.detailUrl = "";
        this.channelId = j;
        this.botId = j2;
        this.botUin = j3;
        this.statusType = i;
        this.statusText = str;
        this.detailUrl = str2;
        this.detailType = i2;
        this.botTrtcId = j4;
    }
}
