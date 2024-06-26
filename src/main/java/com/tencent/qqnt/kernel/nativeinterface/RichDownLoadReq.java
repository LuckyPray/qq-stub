package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RichDownLoadReq.class */
public final class RichDownLoadReq {
    public int chatType;
    public int downloadType;
    public MsgElement elem;
    public String guildId;
    public long msgId;
    public long msgRandom;
    public long msgSeq;
    public long msgTime;
    public String peerUid;
    public String senderUid;
    public int thumbSize;
    public Integer useHttps;

    public RichDownLoadReq() {
        this.senderUid = "";
        this.peerUid = "";
        this.guildId = "";
        this.elem = new MsgElement();
    }

    public int getChatType() {
        return this.chatType;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public MsgElement getElem() {
        return this.elem;
    }

    public String getGuildId() {
        return this.guildId;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public long getMsgRandom() {
        return this.msgRandom;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public String getSenderUid() {
        return this.senderUid;
    }

    public int getThumbSize() {
        return this.thumbSize;
    }

    public Integer getUseHttps() {
        return this.useHttps;
    }

    public String toString() {
        return "RichDownLoadReq{downloadType=" + this.downloadType + ",thumbSize=" + this.thumbSize + ",msgId=" + this.msgId + ",msgRandom=" + this.msgRandom + ",msgSeq=" + this.msgSeq + ",msgTime=" + this.msgTime + ",chatType=" + this.chatType + ",senderUid=" + this.senderUid + ",peerUid=" + this.peerUid + ",guildId=" + this.guildId + ",elem=" + this.elem + ",useHttps=" + this.useHttps + ",}";
    }

    public RichDownLoadReq(int i, int i2, long j, long j2, long j3, long j4, int i3, String str, String str2, String str3, MsgElement msgElement, Integer num) {
        this.senderUid = "";
        this.peerUid = "";
        this.guildId = "";
        this.elem = new MsgElement();
        this.downloadType = i;
        this.thumbSize = i2;
        this.msgId = j;
        this.msgRandom = j2;
        this.msgSeq = j3;
        this.msgTime = j4;
        this.chatType = i3;
        this.senderUid = str;
        this.peerUid = str2;
        this.guildId = str3;
        this.elem = msgElement;
        this.useHttps = num;
    }
}
