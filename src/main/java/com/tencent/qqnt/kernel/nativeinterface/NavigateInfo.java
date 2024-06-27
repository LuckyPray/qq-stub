package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NavigateInfo.class */
public final class NavigateInfo {
    public long msgSeq;
    public NavigateType type;

    public NavigateInfo() {
        this.type = NavigateType.values()[0];
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public NavigateType getType() {
        return this.type;
    }

    public String toString() {
        return "NavigateInfo{msgSeq=" + this.msgSeq + ",type=" + this.type + ",}";
    }

    public NavigateInfo(long j, NavigateType navigateType) {
        this.type = NavigateType.values()[0];
        this.msgSeq = j;
        this.type = navigateType;
    }
}
