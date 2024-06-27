package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSLikeExtInfo.class */
public final class OSLikeExtInfo {
    public int clickTimes;

    public OSLikeExtInfo() {
    }

    public int getClickTimes() {
        return this.clickTimes;
    }

    public String toString() {
        return "OSLikeExtInfo{clickTimes=" + this.clickTimes + ",}";
    }

    public OSLikeExtInfo(int i) {
        this.clickTimes = i;
    }
}
