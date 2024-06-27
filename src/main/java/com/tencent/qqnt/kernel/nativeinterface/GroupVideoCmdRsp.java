package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupVideoCmdRsp.class */
public final class GroupVideoCmdRsp {
    public byte[] pbBuf;

    public GroupVideoCmdRsp() {
        this.pbBuf = new byte[0];
    }

    public byte[] getPbBuf() {
        return this.pbBuf;
    }

    public String toString() {
        return "GroupVideoCmdRsp{pbBuf=" + this.pbBuf + ",}";
    }

    public GroupVideoCmdRsp(byte[] bArr) {
        this.pbBuf = new byte[0];
        this.pbBuf = bArr;
    }
}
