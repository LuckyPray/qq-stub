package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RoamDatemsg.class */
public final class RoamDatemsg {
    public long clientSeq;
    public long msgSeq;
    public long msgTime;

    public RoamDatemsg() {
    }

    public long getClientSeq() {
        return this.clientSeq;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String toString() {
        return "RoamDatemsg{msgSeq=" + this.msgSeq + ",clientSeq=" + this.clientSeq + ",msgTime=" + this.msgTime + ",}";
    }

    public RoamDatemsg(long j, long j2, long j3) {
        this.msgSeq = j;
        this.clientSeq = j2;
        this.msgTime = j3;
    }
}
