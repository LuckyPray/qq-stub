package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupChatInfoResult.class */
public final class SearchGroupChatInfoResult {
    public boolean hasMore;
    public int resultId;
    public ArrayList<SearchGroupItem> resultItems = new ArrayList<>();
    public int searchId;

    public boolean getHasMore() {
        return this.hasMore;
    }

    public int getResultId() {
        return this.resultId;
    }

    public ArrayList<SearchGroupItem> getResultItems() {
        return this.resultItems;
    }

    public int getSearchId() {
        return this.searchId;
    }

    public String toString() {
        return "SearchGroupChatInfoResult{searchId=" + this.searchId + ",resultId=" + this.resultId + ",hasMore=" + this.hasMore + ",resultItems=" + this.resultItems + ",}";
    }
}
