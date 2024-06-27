package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchChannelConditonFilter.class */
public final class SearchChannelConditonFilter {
    public int contentType;
    public int rankType;

    public int getContentType() {
        return this.contentType;
    }

    public int getRankType() {
        return this.rankType;
    }

    public String toString() {
        return "SearchChannelConditonFilter{rankType=" + this.rankType + ",contentType=" + this.contentType + ",}";
    }
}
