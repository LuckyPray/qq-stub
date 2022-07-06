package com.tencent.mobileqq.pb;

import java.io.IOException;

public final class PBEnumField extends PBPrimitiveField<Integer> {
    public static final PBEnumField __repeatHelper__ = new PBEnumField(0, false);
    private int value = 0;

    public PBEnumField(int i, boolean z) {
        set(i, z);
    }

    public void clear(Object obj) {
        if (obj instanceof Integer) {
            this.value = ((Integer) obj).intValue();
        } else {
            this.value = 0;
        }
        setHasFlag(false);
    }

    public int computeSize(int i) {
        return has() ? CodedOutputStreamMicro.computeEnumSize(i, this.value) : 0;
    }

    protected int computeSizeDirectly(int i, Integer num) {
        return CodedOutputStreamMicro.computeEnumSize(i, num.intValue());
    }

    protected void copyFrom(PBField<Integer> pBField) {
        PBEnumField pBEnumField = (PBEnumField) pBField;
        set(pBEnumField.value, pBEnumField.has());
    }

    public int get() {
        return this.value;
    }

    public void readFrom(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        this.value = codedInputStreamMicro.readEnum();
        setHasFlag(true);
    }

    protected Integer readFromDirectly(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        return Integer.valueOf(codedInputStreamMicro.readEnum());
    }

    public void set(int i) {
        set(i, true);
    }

    public void set(int i, boolean z) {
        this.value = i;
        setHasFlag(z);
    }

    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro, int i) throws IOException {
        if (has()) {
            codedOutputStreamMicro.writeEnum(i, this.value);
        }
    }

    protected void writeToDirectly(CodedOutputStreamMicro codedOutputStreamMicro, int i, Integer num) throws IOException {
        codedOutputStreamMicro.writeEnum(i, num.intValue());
    }
}
