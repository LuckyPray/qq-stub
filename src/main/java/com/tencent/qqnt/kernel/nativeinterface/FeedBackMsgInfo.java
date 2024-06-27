package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FeedBackMsgInfo.class */
public final class FeedBackMsgInfo {
    public long clientSeq;
    public long msgId;
    public long msgRandom;
    public long msgSeq;

    public FeedBackMsgInfo() {
    }

    public long getClientSeq() {
        return this.clientSeq;
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

    public String toString() {
        return "FeedBackMsgInfo{msgId=" + this.msgId + ",msgRandom=" + this.msgRandom + ",msgSeq=" + this.msgSeq + ",clientSeq=" + this.clientSeq + ",}";
    }

    public FeedBackMsgInfo(long j, long j2, long j3, long j4) {
        this.msgId = j;
        this.msgRandom = j2;
        this.msgSeq = j3;
        this.clientSeq = j4;
    }
}
