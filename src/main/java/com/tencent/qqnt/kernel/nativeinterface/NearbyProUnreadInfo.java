package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NearbyProUnreadInfo.class */
public final class NearbyProUnreadInfo {
    public long unreadCnt;

    public NearbyProUnreadInfo() {
    }

    public long getUnreadCnt() {
        return this.unreadCnt;
    }

    public String toString() {
        return "NearbyProUnreadInfo{unreadCnt=" + this.unreadCnt + ",}";
    }

    public NearbyProUnreadInfo(long j) {
        this.unreadCnt = j;
    }
}
