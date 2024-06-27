package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AtInfo.class */
public final class AtInfo {
    public int atType;
    public long msgSeq;

    public AtInfo() {
    }

    public int getAtType() {
        return this.atType;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public String toString() {
        return "AtInfo{atType=" + this.atType + ",msgSeq=" + this.msgSeq + ",}";
    }

    public AtInfo(int i, long j) {
        this.atType = i;
        this.msgSeq = j;
    }
}
