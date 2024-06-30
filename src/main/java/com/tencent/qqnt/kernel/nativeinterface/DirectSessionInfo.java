package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DirectSessionInfo.class */
public final class DirectSessionInfo {
    public String channelId;
    public String guildId;
    public boolean informationFull;
    public String memberName;
    public int memberType;
    public MsgAbstract msgAbstract;
    public long msgSeq;
    public long msgTime;
    public String nickName;
    public int notifyType;
    public int sendStatus;
    public long srcGuildId;
    public String srcGuildName;
    public long tinyId;

    public DirectSessionInfo() {
        this.guildId = "";
        this.channelId = "";
        this.msgAbstract = new MsgAbstract();
        this.srcGuildName = "";
        this.nickName = "";
        this.memberName = "";
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getGuildId() {
        return this.guildId;
    }

    public boolean getInformationFull() {
        return this.informationFull;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public int getMemberType() {
        return this.memberType;
    }

    public MsgAbstract getMsgAbstract() {
        return this.msgAbstract;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String getNickName() {
        return this.nickName;
    }

    public int getNotifyType() {
        return this.notifyType;
    }

    public int getSendStatus() {
        return this.sendStatus;
    }

    public long getSrcGuildId() {
        return this.srcGuildId;
    }

    public String getSrcGuildName() {
        return this.srcGuildName;
    }

    public long getTinyId() {
        return this.tinyId;
    }

    public String toString() {
        return "DirectSessionInfo{guildId=" + this.guildId + ",channelId=" + this.channelId + ",msgTime=" + this.msgTime + ",msgSeq=" + this.msgSeq + ",sendStatus=" + this.sendStatus + ",msgAbstract=" + this.msgAbstract + ",tinyId=" + this.tinyId + ",srcGuildId=" + this.srcGuildId + ",srcGuildName=" + this.srcGuildName + ",nickName=" + this.nickName + ",memberName=" + this.memberName + ",notifyType=" + this.notifyType + ",memberType=" + this.memberType + ",informationFull=" + this.informationFull + ",}";
    }

    public DirectSessionInfo(String str, String str2, long j, long j2, int i, MsgAbstract msgAbstract, long j3, long j4, String str3, String str4, String str5, int i2, int i3, boolean z) {
        this.guildId = "";
        this.channelId = "";
        this.msgAbstract = new MsgAbstract();
        this.srcGuildName = "";
        this.nickName = "";
        this.memberName = "";
        this.guildId = str;
        this.channelId = str2;
        this.msgTime = j;
        this.msgSeq = j2;
        this.sendStatus = i;
        this.msgAbstract = msgAbstract;
        this.tinyId = j3;
        this.srcGuildId = j4;
        this.srcGuildName = str3;
        this.nickName = str4;
        this.memberName = str5;
        this.notifyType = i2;
        this.memberType = i3;
        this.informationFull = z;
    }
}
