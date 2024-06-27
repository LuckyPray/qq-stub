package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ForWardMsgInVisitReq.class */
public final class ForWardMsgInVisitReq {
    public int chatType;
    public ArrayList<MsgElement> elems;
    public String guildId;
    public long msgId;
    public long msgRandom;
    public long msgSeq;
    public long msgTime;
    public int msgType;
    public String peerUid;
    public int sendStatus;
    public int sendType;
    public String senderUid;
    public int subMsgType;

    public ForWardMsgInVisitReq() {
        this.senderUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.elems = new ArrayList<>();
    }

    public int getChatType() {
        return this.chatType;
    }

    public ArrayList<MsgElement> getElems() {
        return this.elems;
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

    public int getMsgType() {
        return this.msgType;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public int getSendStatus() {
        return this.sendStatus;
    }

    public int getSendType() {
        return this.sendType;
    }

    public String getSenderUid() {
        return this.senderUid;
    }

    public int getSubMsgType() {
        return this.subMsgType;
    }

    public String toString() {
        return "ForWardMsgInVisitReq{chatType=" + this.chatType + ",msgType=" + this.msgType + ",subMsgType=" + this.subMsgType + ",sendType=" + this.sendType + ",msgId=" + this.msgId + ",msgRandom=" + this.msgRandom + ",msgSeq=" + this.msgSeq + ",msgTime=" + this.msgTime + ",sendStatus=" + this.sendStatus + ",senderUid=" + this.senderUid + ",peerUid=" + this.peerUid + ",guildId=" + this.guildId + ",elems=" + this.elems + ",}";
    }

    public ForWardMsgInVisitReq(int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, int i5, String str, String str2, String str3, ArrayList<MsgElement> arrayList) {
        this.senderUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.elems = new ArrayList<>();
        this.chatType = i;
        this.msgType = i2;
        this.subMsgType = i3;
        this.sendType = i4;
        this.msgId = j;
        this.msgRandom = j2;
        this.msgSeq = j3;
        this.msgTime = j4;
        this.sendStatus = i5;
        this.senderUid = str;
        this.peerUid = str2;
        this.guildId = str3;
        this.elems = arrayList;
    }
}
