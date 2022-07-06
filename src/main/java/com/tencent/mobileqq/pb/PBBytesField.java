package com.tencent.mobileqq.pb;

import java.io.IOException;

public final class PBBytesField extends PBPrimitiveField<ByteStringMicro> {
    public static final PBBytesField __repeatHelper__ = new PBBytesField(ByteStringMicro.EMPTY, false);
    private ByteStringMicro value = ByteStringMicro.EMPTY;

    public PBBytesField(ByteStringMicro byteStringMicro, boolean z) {
        set(byteStringMicro, z);
    }

    public void clear(Object obj) {
        if (obj instanceof ByteStringMicro) {
            this.value = (ByteStringMicro) obj;
        } else {
            this.value = ByteStringMicro.EMPTY;
        }
        setHasFlag(false);
    }

    public int computeSize(int i) {
        return has() ? CodedOutputStreamMicro.computeBytesSize(i, this.value) : 0;
    }

    protected int computeSizeDirectly(int i, ByteStringMicro byteStringMicro) {
        return CodedOutputStreamMicro.computeBytesSize(i, byteStringMicro);
    }

    protected void copyFrom(PBField<ByteStringMicro> pBField) {
        PBBytesField pBBytesField = (PBBytesField) pBField;
        set(pBBytesField.value, pBBytesField.has());
    }

    public ByteStringMicro get() {
        return this.value;
    }

    public void readFrom(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        this.value = codedInputStreamMicro.readBytes();
        setHasFlag(true);
    }

    protected ByteStringMicro readFromDirectly(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        return codedInputStreamMicro.readBytes();
    }

    public void set(ByteStringMicro byteStringMicro) {
        set(byteStringMicro, true);
    }

    public void set(ByteStringMicro byteStringMicro, boolean z) {
        this.value = byteStringMicro;
        setHasFlag(z);
    }

    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro, int i) throws IOException {
        if (has()) {
            codedOutputStreamMicro.writeBytes(i, this.value);
        }
    }

    protected void writeToDirectly(CodedOutputStreamMicro codedOutputStreamMicro, int i, ByteStringMicro byteStringMicro) throws IOException {
        codedOutputStreamMicro.writeBytes(i, byteStringMicro);
    }
}
