package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ExtendBusinessAttr.class */
public final class ExtendBusinessAttr {
    public byte[] buffer;
    public ExtendBusinessType type;

    public ExtendBusinessAttr() {
        this.type = ExtendBusinessType.values()[0];
        this.buffer = new byte[0];
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public ExtendBusinessType getType() {
        return this.type;
    }

    public String toString() {
        return "ExtendBusinessAttr{type=" + this.type + ",buffer=" + this.buffer + ",}";
    }

    public ExtendBusinessAttr(ExtendBusinessType extendBusinessType, byte[] bArr) {
        this.type = ExtendBusinessType.values()[0];
        this.buffer = new byte[0];
        this.type = extendBusinessType;
        this.buffer = bArr;
    }
}
