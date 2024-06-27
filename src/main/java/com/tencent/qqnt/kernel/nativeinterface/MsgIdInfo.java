package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MsgIdInfo.class */
public final class MsgIdInfo {
    public long msgId;
    public long msgSeq;
    public long msgTime;

    public MsgIdInfo() {
    }

    public long getMsgId() {
        return this.msgId;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String toString() {
        return "MsgIdInfo{msgId=" + this.msgId + ",msgSeq=" + this.msgSeq + ",msgTime=" + this.msgTime + ",}";
    }

    public MsgIdInfo(long j, long j2, long j3) {
        this.msgId = j;
        this.msgSeq = j2;
        this.msgTime = j3;
    }
}
