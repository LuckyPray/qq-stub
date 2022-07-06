package com.tencent.mobileqq.pb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class PBRepeatField<T> extends PBField<List<T>> {
    private final PBField<T> helper;
    private List<T> value = Collections.emptyList();

    public PBRepeatField(PBField<T> pBField) {
        this.helper = pBField;
    }

    public void add(T t) {
        get().add(t);
    }

    public void addAll(Collection<T> collection) {
        get().addAll(collection);
    }

    public void clear(Object obj) {
        this.value = Collections.emptyList();
    }

    public int computeSize(int i) {
        return computeSizeDirectly(i, this.value);
    }

    protected int computeSizeDirectly(int i, List<T> list) {
        int i2 = 0;
        Iterator it = list.iterator();
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return i3;
            }
            i2 = this.helper.computeSizeDirectly(i, (T) it.next()) + i3;
        }
    }

    protected void copyFrom(PBField<List<T>> pBField) {
        PBRepeatField pBRepeatField = (PBRepeatField) pBField;
        if (pBRepeatField.isEmpty()) {
            this.value = Collections.emptyList();
            return;
        }
        List list = get();
        list.clear();
        list.addAll(pBRepeatField.value);
    }

    public T get(int i) {
        return this.value.get(i);
    }

    public List<T> get() {
        if (this.value == Collections.emptyList()) {
            this.value = new ArrayList();
        }
        return this.value;
    }

    public boolean has() {
        return !isEmpty();
    }

    public boolean isEmpty() {
        return this.value.isEmpty();
    }

    public void readFrom(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        add(this.helper.readFromDirectly(codedInputStreamMicro));
    }

    protected List<T> readFromDirectly(CodedInputStreamMicro codedInputStreamMicro) throws IOException {
        throw new RuntimeException("PBRepeatField not support readFromDirectly method.");
    }

    public void remove(int i) {
        get().remove(i);
    }

    public void set(int i, T t) {
        this.value.set(i, t);
    }

    public void set(List<T> list) {
        this.value = list;
    }

    public int size() {
        return this.value.size();
    }

    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro, int i) throws IOException {
        writeToDirectly(codedOutputStreamMicro, i, this.value);
    }

    protected void writeToDirectly(CodedOutputStreamMicro codedOutputStreamMicro, int i, List<T> list) throws IOException {
        for (T writeToDirectly : list) {
            this.helper.writeToDirectly(codedOutputStreamMicro, i, writeToDirectly);
        }
    }
}
