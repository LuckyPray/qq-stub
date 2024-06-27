package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchChatsKeywordsResult.class */
public final class SearchChatsKeywordsResult {
    public boolean hasMore;
    public ArrayList<SearchChatSummaryItem> resultItems = new ArrayList<>();
    public int searchId;

    public boolean getHasMore() {
        return this.hasMore;
    }

    public ArrayList<SearchChatSummaryItem> getResultItems() {
        return this.resultItems;
    }

    public int getSearchId() {
        return this.searchId;
    }

    public String toString() {
        return "SearchChatsKeywordsResult{searchId=" + this.searchId + ",hasMore=" + this.hasMore + ",resultItems=" + this.resultItems + ",}";
    }
}
