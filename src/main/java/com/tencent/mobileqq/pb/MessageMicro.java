package com.tencent.mobileqq.pb;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;

public abstract class MessageMicro<T extends MessageMicro<T>> extends PBPrimitiveField<T> {
    private FieldMap _fields = null;
    private int cachedSize = -1;

    public static final class FieldMap {
        private Object[] defaultValues;
        private Field[] fields;
        private int[] tags;

        FieldMap(int[] iArr, String[] strArr, Object[] objArr, Class<?> cls) {
            this.tags = iArr;
            this.defaultValues = objArr;
            this.fields = new Field[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                try {
                    this.fields[i] = cls.getField(strArr[i]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        void clear(MessageMicro<?> messageMicro) throws IllegalArgumentException, IllegalAccessException {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.tags.length) {
                    ((PBField) this.fields[i2].get(messageMicro)).clear(this.defaultValues[i2]);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        <U extends MessageMicro<U>> void copyFields(U u, U u2) throws IllegalArgumentException, IllegalAccessException {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.tags.length) {
                    Field field = this.fields[i2];
                    ((PBField) field.get(u)).copyFrom((PBField) field.get(u2));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        Field get(int i) {
            int binarySearch = Arrays.binarySearch(this.tags, i);
            return binarySearch < 0 ? null : this.fields[binarySearch];
        }

        int getSerializedSize(MessageMicro<?> messageMicro) throws IllegalArgumentException, IllegalAccessException {
            int i = 0;
            for (int i2 = 0; i2 < this.tags.length; i2++) {
                i += ((PBField) this.fields[i2].get(messageMicro)).computeSize(WireFormatMicro.getTagFieldNumber(this.tags[i2]));
            }
            return i;
        }

        public boolean readFieldFrom(CodedInputStreamMicro codedInputStreamMicro, int i, MessageMicro<?> messageMicro) throws IOException, IllegalArgumentException, IllegalAccessException, InstantiationException {
            int binarySearch = Arrays.binarySearch(this.tags, i);
            if (binarySearch < 0) {
                return false;
            }
            ((PBField) this.fields[binarySearch].get(messageMicro)).readFrom(codedInputStreamMicro);
            return true;
        }

        void writeTo(CodedOutputStreamMicro codedOutputStreamMicro, MessageMicro<?> messageMicro) throws IllegalArgumentException, IllegalAccessException, IOException {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.tags.length) {
                    ((PBField) this.fields[i2].get(messageMicro)).writeTo(codedOutputStreamMicro, WireFormatMicro.getTagFieldNumber(this.tags[i2]));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private final FieldMap getFieldMap() {
        if (this._fields == null) {
            try {
                Field declaredField = getClass().getDeclaredField("__fieldMap__");
                declaredField.setAccessible(true);
                this._fields = (FieldMap) declaredField.get(this);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (SecurityException e2) {
                e2.printStackTrace();
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            }
        }
        return this._fields;
    }

    protected static FieldMap initFieldMap(int[] iArr, String[] strArr, Object[] objArr, Class<?> cls) {
        return new FieldMap(iArr, strArr, objArr, cls);
    }

    public static void main(String[] strArr) throws Exception {
    }

    public static final <T extends MessageMicro<T>> T mergeFrom(T t, byte[] bArr) throws InvalidProtocolBufferMicroException {
        return t.mergeFrom(bArr);
    }

    public static final byte[] toByteArray(MessageMicro<?> messageMicro) {
        return messageMicro.toByteArray();
    }

    public void clear(Object obj) {
        try {
            getFieldMap().clear(this);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        setHasFlag(false);
    }

    public int computeSize(int i) {
        return has() ? CodedOutputStreamMicro.computeMessageSize(i, this) : 0;
    }

    protected int computeSizeDirectly(int i, T t) {
        return CodedOutputStreamMicro.computeMessageSize(i, t);
    }

    protected void copyFrom(PBField<T> pBField) {
        try {
            getFieldMap().copyFields((T) this, (T) pBField);
            setHasFlag(((MessageMicro) pBField).has());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    public T get() {
        return (T) this;
    }

    public final int getCachedSize() {
        return getSerializedSize();
    }

    public final int getSerializedSize() {
        int i = -1;
        try {
            i = getFieldMap().getSerializedSize(this);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        this.cachedSize = i;
        return i;
    }

    public final T mergeFrom(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        FieldMap fieldMap = getFieldMap();
        setHasFlag(true);
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            try {
                if (!fieldMap.readFieldFrom(codedInputStreamMicro, readTag, this) && (readTag == 0 || !parseUnknownField(codedInputStreamMicro, readTag))) {
                    return (T) this;
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InstantiationException e3) {
                e3.printStackTrace();
            }
        }
    }

    public final T mergeFrom(byte[] bArr) throws InvalidProtocolBufferMicroException {
        return mergeFrom(bArr, 0, bArr.length);
    }

    public final T mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferMicroException {
        try {
            CodedInputStreamMicro newInstance = CodedInputStreamMicro.newInstance(bArr, i, i2);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return (T) this;
        } catch (InvalidProtocolBufferMicroException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    protected boolean parseUnknownField(CodedInputStreamMicro codedInputStreamMicro, int i) throws IOException {
        return codedInputStreamMicro.skipField(i);
    }

    public void readFrom(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        codedInputStreamMicro.readMessage(this);
    }

    protected T readFromDirectly(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        try {
            MessageMicro messageMicro = (MessageMicro) getClass().newInstance();
            codedInputStreamMicro.readMessage(messageMicro);
            return (T) messageMicro;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public void set(T t) {
        set(t, true);
    }

    public void set(T t, boolean z) {
        copyFrom(t);
        setHasFlag(z);
        this.cachedSize = -1;
    }

    public final void toByteArray(byte[] bArr, int i, int i2) {
        try {
            CodedOutputStreamMicro newInstance = CodedOutputStreamMicro.newInstance(bArr, i, i2);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[getSerializedSize()];
        toByteArray(bArr, 0, bArr.length);
        return bArr;
    }

    public final void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) throws IOException {
        try {
            getFieldMap().writeTo(codedOutputStreamMicro, this);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro, int i) throws IOException {
        if (has()) {
            codedOutputStreamMicro.writeMessage(i, this);
        }
    }

    protected void writeToDirectly(CodedOutputStreamMicro codedOutputStreamMicro, int i, T t) throws IOException {
        codedOutputStreamMicro.writeMessage(i, t);
    }
}
