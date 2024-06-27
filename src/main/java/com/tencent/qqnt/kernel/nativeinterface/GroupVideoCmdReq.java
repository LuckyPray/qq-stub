package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupVideoCmdReq.class */
public final class GroupVideoCmdReq {
    public int cmdType;
    public byte[] pbBuf;

    public GroupVideoCmdReq() {
        this.pbBuf = new byte[0];
    }

    public int getCmdType() {
        return this.cmdType;
    }

    public byte[] getPbBuf() {
        return this.pbBuf;
    }

    public String toString() {
        return "GroupVideoCmdReq{cmdType=" + this.cmdType + ",pbBuf=" + this.pbBuf + ",}";
    }

    public GroupVideoCmdReq(int i, byte[] bArr) {
        this.pbBuf = new byte[0];
        this.cmdType = i;
        this.pbBuf = bArr;
    }
}
