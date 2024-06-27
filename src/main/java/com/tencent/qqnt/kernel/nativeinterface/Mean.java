package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/Mean.class */
public final class Mean {
    public int flag;
    public String words;

    public Mean() {
        this.words = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getWords() {
        return this.words;
    }

    public String toString() {
        return "Mean{words=" + this.words + ",flag=" + this.flag + ",}";
    }

    public Mean(String str, int i) {
        this.words = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.words = str;
        this.flag = i;
    }
}
