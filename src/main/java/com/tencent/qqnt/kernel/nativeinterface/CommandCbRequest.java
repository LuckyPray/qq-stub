package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CommandCbRequest.class */
public final class CommandCbRequest {
    public long botAppId;
    public long botUin;
    public long c2cUin;
    public String callbackData;
    public long channelId;
    public int chatType;
    public int dmFlag;
    public String featureId;
    public long groupId;
    public long guildId;

    public CommandCbRequest() {
        this.featureId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.callbackData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getBotAppId() {
        return this.botAppId;
    }

    public long getBotUin() {
        return this.botUin;
    }

    public long getC2cUin() {
        return this.c2cUin;
    }

    public String getCallbackData() {
        return this.callbackData;
    }

    public long getChannelId() {
        return this.channelId;
    }

    public int getChatType() {
        return this.chatType;
    }

    public int getDmFlag() {
        return this.dmFlag;
    }

    public String getFeatureId() {
        return this.featureId;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public String toString() {
        return "CommandCbRequest{guildId=" + this.guildId + ",channelId=" + this.channelId + ",botAppId=" + this.botAppId + ",botUin=" + this.botUin + ",featureId=" + this.featureId + ",callbackData=" + this.callbackData + ",dmFlag=" + this.dmFlag + ",groupId=" + this.groupId + ",c2cUin=" + this.c2cUin + ",chatType=" + this.chatType + ",}";
    }

    public CommandCbRequest(long j, long j2, long j3, long j4, String str, String str2, int i, long j5, long j6, int i2) {
        this.featureId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.callbackData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = j;
        this.channelId = j2;
        this.botAppId = j3;
        this.botUin = j4;
        this.featureId = str;
        this.callbackData = str2;
        this.dmFlag = i;
        this.groupId = j5;
        this.c2cUin = j6;
        this.chatType = i2;
    }
}
