package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StFeedCellSummary.class */
public final class StFeedCellSummary {
    public boolean hasMore;
    public ArrayList<StRichMsg> summary = new ArrayList<>();

    public boolean getHasMore() {
        return this.hasMore;
    }

    public ArrayList<StRichMsg> getSummary() {
        return this.summary;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setSummary(ArrayList<StRichMsg> arrayList) {
        this.summary = arrayList;
    }
}
