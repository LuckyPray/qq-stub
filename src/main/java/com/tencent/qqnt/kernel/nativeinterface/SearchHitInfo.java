package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchHitInfo.class */
public final class SearchHitInfo {
    public int end;
    public int start;

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public String toString() {
        return "SearchHitInfo{start=" + this.start + ",end=" + this.end + ",}";
    }
}
