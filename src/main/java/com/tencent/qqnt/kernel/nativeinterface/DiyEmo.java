package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DiyEmo.class */
public final class DiyEmo {

    /* renamed from: id */
    public int f2id;
    public int type;
    public String word;

    public DiyEmo() {
        this.word = "";
    }

    public int getId() {
        return this.f2id;
    }

    public int getType() {
        return this.type;
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {
        return "DiyEmo{id=" + this.f2id + ",type=" + this.type + ",word=" + this.word + ",}";
    }

    public DiyEmo(int i, int i2, String str) {
        this.word = "";
        this.f2id = i;
        this.type = i2;
        this.word = str;
    }
}
