package com.tencent.mobileqq.pb;

import java.io.IOException;

public final class PBUInt64Field extends PBPrimitiveField<Long> {
    public static final PBUInt64Field __repeatHelper__ = new PBUInt64Field(0, false);
    private long value = 0;

    public PBUInt64Field(long j, boolean z) {
        set(j, z);
    }

    public void clear(Object obj) {
        if (obj instanceof Long) {
            this.value = ((Long) obj).longValue();
        } else {
            this.value = 0;
        }
        setHasFlag(false);
    }

    public int computeSize(int i) {
        return has() ? CodedOutputStreamMicro.computeUInt64Size(i, this.value) : 0;
    }

    protected int computeSizeDirectly(int i, Long l) {
        return CodedOutputStreamMicro.computeUInt64Size(i, l.longValue());
    }

    protected void copyFrom(PBField<Long> pBField) {
        PBUInt64Field pBUInt64Field = (PBUInt64Field) pBField;
        set(pBUInt64Field.value, pBUInt64Field.has());
    }

    public long get() {
        return this.value;
    }

    public void readFrom(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        this.value = codedInputStreamMicro.readUInt64();
        setHasFlag(true);
    }

    protected Long readFromDirectly(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        return Long.valueOf(codedInputStreamMicro.readUInt64());
    }

    public void set(long j) {
        set(j, true);
    }

    public void set(long j, boolean z) {
        this.value = j;
        setHasFlag(z);
    }

    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro, int i) throws IOException {
        if (has()) {
            codedOutputStreamMicro.writeUInt64(i, this.value);
        }
    }

    protected void writeToDirectly(CodedOutputStreamMicro codedOutputStreamMicro, int i, Long l) throws IOException {
        codedOutputStreamMicro.writeUInt64(i, l.longValue());
    }
}
