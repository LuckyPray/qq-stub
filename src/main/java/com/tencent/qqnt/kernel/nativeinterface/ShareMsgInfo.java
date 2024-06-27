package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ShareMsgInfo.class */
public final class ShareMsgInfo {
    public long msgSeq;
    public long msgTime;

    public ShareMsgInfo() {
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String toString() {
        return "ShareMsgInfo{msgTime=" + this.msgTime + ",msgSeq=" + this.msgSeq + ",}";
    }

    public ShareMsgInfo(long j, long j2) {
        this.msgTime = j;
        this.msgSeq = j2;
    }
}
