package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchBuddyChatInfoResult.class */
public final class SearchBuddyChatInfoResult {
    public boolean hasMore;
    public ArrayList<SearchBuddyItem> resultItems = new ArrayList<>();
    public int searchId;

    public boolean getHasMore() {
        return this.hasMore;
    }

    public ArrayList<SearchBuddyItem> getResultItems() {
        return this.resultItems;
    }

    public int getSearchId() {
        return this.searchId;
    }

    public String toString() {
        return "SearchBuddyChatInfoResult{searchId=" + this.searchId + ",hasMore=" + this.hasMore + ",resultItems=" + this.resultItems + ",}";
    }
}
