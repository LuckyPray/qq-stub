package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchContactResult.class */
public final class SearchContactResult {
    public boolean hasMore;
    public ArrayList<SearchContactItem> resultItems = new ArrayList<>();
    public int searchId;

    public boolean getHasMore() {
        return this.hasMore;
    }

    public ArrayList<SearchContactItem> getResultItems() {
        return this.resultItems;
    }

    public int getSearchId() {
        return this.searchId;
    }

    public String toString() {
        return "SearchContactResult{searchId=" + this.searchId + ",hasMore=" + this.hasMore + ",resultItems=" + this.resultItems + ",}";
    }
}
