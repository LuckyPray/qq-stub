package com.tencent.mobileqq.pb;

import java.io.IOException;

public final class PBBoolField extends PBPrimitiveField<Boolean> {
    public static final PBBoolField __repeatHelper__ = new PBBoolField(false, false);
    private boolean value = false;

    public PBBoolField(boolean z, boolean z2) {
        set(z, z2);
    }

    public void clear(Object obj) {
        if (obj instanceof Boolean) {
            this.value = ((Boolean) obj).booleanValue();
        } else {
            this.value = false;
        }
        setHasFlag(false);
    }

    public int computeSize(int i) {
        return has() ? CodedOutputStreamMicro.computeBoolSize(i, this.value) : 0;
    }

    protected int computeSizeDirectly(int i, Boolean bool) {
        return CodedOutputStreamMicro.computeBoolSize(i, bool.booleanValue());
    }

    protected void copyFrom(PBField<Boolean> pBField) {
        PBBoolField pBBoolField = (PBBoolField) pBField;
        set(pBBoolField.value, pBBoolField.has());
    }

    public boolean get() {
        return this.value;
    }

    public void readFrom(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        this.value = codedInputStreamMicro.readBool();
        setHasFlag(true);
    }

    protected Boolean readFromDirectly(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        return Boolean.valueOf(codedInputStreamMicro.readBool());
    }

    public void set(boolean z) {
        set(z, true);
    }

    public void set(boolean z, boolean z2) {
        this.value = z;
        setHasFlag(z2);
    }

    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro, int i) throws IOException {
        if (has()) {
            codedOutputStreamMicro.writeBool(i, this.value);
        }
    }

    protected void writeToDirectly(CodedOutputStreamMicro codedOutputStreamMicro, int i, Boolean bool) throws IOException {
        codedOutputStreamMicro.writeBool(i, bool.booleanValue());
    }
}
