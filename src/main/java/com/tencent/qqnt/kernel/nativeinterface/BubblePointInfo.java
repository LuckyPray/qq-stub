package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BubblePointInfo.class */
public final class BubblePointInfo {
    public long readSeqNo;
    public byte[] schema;
    public long seqNo;
    public byte[] text;

    public BubblePointInfo() {
        this.text = new byte[0];
        this.schema = new byte[0];
    }

    public long getReadSeqNo() {
        return this.readSeqNo;
    }

    public byte[] getSchema() {
        return this.schema;
    }

    public long getSeqNo() {
        return this.seqNo;
    }

    public byte[] getText() {
        return this.text;
    }

    public String toString() {
        return "BubblePointInfo{seqNo=" + this.seqNo + ",readSeqNo=" + this.readSeqNo + ",text=" + this.text + ",schema=" + this.schema + ",}";
    }

    public BubblePointInfo(long j, long j2, byte[] bArr, byte[] bArr2) {
        this.text = new byte[0];
        this.schema = new byte[0];
        this.seqNo = j;
        this.readSeqNo = j2;
        this.text = bArr;
        this.schema = bArr2;
    }
}