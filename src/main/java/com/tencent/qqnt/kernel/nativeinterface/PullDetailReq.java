package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PullDetailReq.class */
public final class PullDetailReq {
    public int limit;
    public int offset;
    public byte[] pcBody;
    public int recvType;
    public long recvUin;

    public PullDetailReq() {
        this.pcBody = new byte[0];
    }

    public int getLimit() {
        return this.limit;
    }

    public int getOffset() {
        return this.offset;
    }

    public byte[] getPcBody() {
        return this.pcBody;
    }

    public int getRecvType() {
        return this.recvType;
    }

    public long getRecvUin() {
        return this.recvUin;
    }

    public String toString() {
        return "PullDetailReq{pcBody=" + this.pcBody + ",recvUin=" + this.recvUin + ",recvType=" + this.recvType + ",offset=" + this.offset + ",limit=" + this.limit + ",}";
    }

    public PullDetailReq(byte[] bArr, long j, int i, int i2, int i3) {
        this.pcBody = new byte[0];
        this.pcBody = bArr;
        this.recvUin = j;
        this.recvType = i;
        this.offset = i2;
        this.limit = i3;
    }
}
