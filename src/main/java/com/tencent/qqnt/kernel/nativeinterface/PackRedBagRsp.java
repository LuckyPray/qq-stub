package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PackRedBagRsp.class */
public final class PackRedBagRsp {
    public byte[] index;
    public int invalidTime;
    public byte[] qrCode;

    public PackRedBagRsp() {
        this.qrCode = new byte[0];
        this.index = new byte[0];
    }

    public byte[] getIndex() {
        return this.index;
    }

    public int getInvalidTime() {
        return this.invalidTime;
    }

    public byte[] getQrCode() {
        return this.qrCode;
    }

    public String toString() {
        return "PackRedBagRsp{qrCode=" + this.qrCode + ",invalidTime=" + this.invalidTime + ",index=" + this.index + ",}";
    }

    public PackRedBagRsp(byte[] bArr, int i, byte[] bArr2) {
        this.qrCode = new byte[0];
        this.index = new byte[0];
        this.qrCode = bArr;
        this.invalidTime = i;
        this.index = bArr2;
    }
}
