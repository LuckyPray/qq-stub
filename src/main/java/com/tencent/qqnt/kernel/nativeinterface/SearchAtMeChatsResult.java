package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchAtMeChatsResult.class */
public final class SearchAtMeChatsResult {
    public boolean hasMore;
    public ArrayList<SearchAtMeChatItem> resultItems;
    public int searchId;

    public SearchAtMeChatsResult() {
        this.resultItems = new ArrayList<>();
    }

    public boolean getHasMore() {
        return this.hasMore;
    }

    public ArrayList<SearchAtMeChatItem> getResultItems() {
        return this.resultItems;
    }

    public int getSearchId() {
        return this.searchId;
    }

    public String toString() {
        return "SearchAtMeChatsResult{searchId=" + this.searchId + ",hasMore=" + this.hasMore + ",resultItems=" + this.resultItems + ",}";
    }

    public SearchAtMeChatsResult(int i, boolean z, ArrayList<SearchAtMeChatItem> arrayList) {
        this.resultItems = new ArrayList<>();
        this.searchId = i;
        this.hasMore = z;
        this.resultItems = arrayList;
    }
}
