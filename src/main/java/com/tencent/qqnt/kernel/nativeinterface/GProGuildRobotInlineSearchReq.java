package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotInlineSearchReq.class */
public final class GProGuildRobotInlineSearchReq {
    public long botTinyid;
    public long channelId;
    public long guildId;
    public String keyword;

    public GProGuildRobotInlineSearchReq() {
        this.keyword = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getBotTinyid() {
        return this.botTinyid;
    }

    public long getChannelId() {
        return this.channelId;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String toString() {
        return "GProGuildRobotInlineSearchReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",botTinyid=" + this.botTinyid + ",keyword=" + this.keyword + ",}";
    }

    public GProGuildRobotInlineSearchReq(long j, long j2, long j3, String str) {
        this.keyword = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = j;
        this.channelId = j2;
        this.botTinyid = j3;
        this.keyword = str;
    }
}
