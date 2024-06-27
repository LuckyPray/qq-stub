package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UnreadCnt.class */
public final class UnreadCnt {
    public int cnt;
    public int type;

    public UnreadCnt() {
    }

    public int getCnt() {
        return this.cnt;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "UnreadCnt{type=" + this.type + ",cnt=" + this.cnt + ",}";
    }

    public UnreadCnt(int i, int i2) {
        this.type = i;
        this.cnt = i2;
    }
}
