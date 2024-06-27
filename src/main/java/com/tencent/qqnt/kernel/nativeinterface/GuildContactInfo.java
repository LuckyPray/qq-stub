package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildContactInfo.class */
public final class GuildContactInfo {
    public int activityType;
    public long avatarSeq;
    public boolean channelHighLight;
    public String channelId;
    public String channelName;
    public int channelSubType;
    public int channelType;
    public String guildId;
    public String guildName;
    public boolean isEntered;
    public boolean isShowChannelName;
    public boolean isSticky;
    public long msgSeq;
    public long msgType;
    public UnreadCntInfo unreadCntInfo;

    public GuildContactInfo() {
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.unreadCntInfo = new UnreadCntInfo();
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getActivityType() {
        return this.activityType;
    }

    public long getAvatarSeq() {
        return this.avatarSeq;
    }

    public boolean getChannelHighLight() {
        return this.channelHighLight;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public int getChannelSubType() {
        return this.channelSubType;
    }

    public int getChannelType() {
        return this.channelType;
    }

    public String getGuildId() {
        return this.guildId;
    }

    public String getGuildName() {
        return this.guildName;
    }

    public boolean getIsEntered() {
        return this.isEntered;
    }

    public boolean getIsShowChannelName() {
        return this.isShowChannelName;
    }

    public boolean getIsSticky() {
        return this.isSticky;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgType() {
        return this.msgType;
    }

    public UnreadCntInfo getUnreadCntInfo() {
        return this.unreadCntInfo;
    }

    public String toString() {
        return "GuildContactInfo{guildId=" + this.guildId + ",channelId=" + this.channelId + ",unreadCntInfo=" + this.unreadCntInfo + ",guildName=" + this.guildName + ",channelName=" + this.channelName + ",channelType=" + this.channelType + ",channelSubType=" + this.channelSubType + ",activityType=" + this.activityType + ",channelHighLight=" + this.channelHighLight + ",avatarSeq=" + this.avatarSeq + ",msgType=" + this.msgType + ",msgSeq=" + this.msgSeq + ",isSticky=" + this.isSticky + ",isEntered=" + this.isEntered + ",isShowChannelName=" + this.isShowChannelName + ",}";
    }

    public GuildContactInfo(String str, String str2, UnreadCntInfo unreadCntInfo, String str3, String str4, int i, int i2, int i3, boolean z, long j, long j2, long j3, boolean z2, boolean z3, boolean z4) {
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.unreadCntInfo = new UnreadCntInfo();
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = str;
        this.channelId = str2;
        this.unreadCntInfo = unreadCntInfo;
        this.guildName = str3;
        this.channelName = str4;
        this.channelType = i;
        this.channelSubType = i2;
        this.activityType = i3;
        this.channelHighLight = z;
        this.avatarSeq = j;
        this.msgType = j2;
        this.msgSeq = j3;
        this.isSticky = z2;
        this.isEntered = z3;
        this.isShowChannelName = z4;
    }
}
