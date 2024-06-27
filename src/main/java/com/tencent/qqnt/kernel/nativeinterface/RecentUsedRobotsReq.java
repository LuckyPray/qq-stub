package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentUsedRobotsReq.class */
public final class RecentUsedRobotsReq {
    public int num;
    public int offset;

    public int getNum() {
        return this.num;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setNum(int i) {
        this.num = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public String toString() {
        return "RecentUsedRobotsReq{offset=" + this.offset + ",num=" + this.num + ",}";
    }
}
