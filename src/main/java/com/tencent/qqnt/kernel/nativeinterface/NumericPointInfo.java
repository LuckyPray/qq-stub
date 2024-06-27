package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NumericPointInfo.class */
public final class NumericPointInfo {
    public long num;
    public long readSeqNo;
    public long seqNo;

    public NumericPointInfo() {
    }

    public long getNum() {
        return this.num;
    }

    public long getReadSeqNo() {
        return this.readSeqNo;
    }

    public long getSeqNo() {
        return this.seqNo;
    }

    public String toString() {
        return "NumericPointInfo{num=" + this.num + ",seqNo=" + this.seqNo + ",readSeqNo=" + this.readSeqNo + ",}";
    }

    public NumericPointInfo(long j, long j2, long j3) {
        this.num = j;
        this.seqNo = j2;
        this.readSeqNo = j3;
    }
}
