package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchMsgKeywordsResult.class */
public final class SearchMsgKeywordsResult implements IKernelModel {
    public boolean hasMore;
    public ArrayList<SearchMsgItem> resultItems;
    public int searchId;

    public SearchMsgKeywordsResult() {
        this.resultItems = new ArrayList<>();
    }

    public boolean getHasMore() {
        return this.hasMore;
    }

    public ArrayList<SearchMsgItem> getResultItems() {
        return this.resultItems;
    }

    public int getSearchId() {
        return this.searchId;
    }

    public String toString() {
        return "SearchMsgKeywordsResult{searchId=" + this.searchId + ",hasMore=" + this.hasMore + ",resultItems=" + this.resultItems + ",}";
    }

    public SearchMsgKeywordsResult(int i, boolean z, ArrayList<SearchMsgItem> arrayList) {
        this.resultItems = new ArrayList<>();
        this.searchId = i;
        this.hasMore = z;
        this.resultItems = arrayList;
    }
}
