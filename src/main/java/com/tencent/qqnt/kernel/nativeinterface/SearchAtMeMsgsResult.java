package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchAtMeMsgsResult.class */
public final class SearchAtMeMsgsResult {
    public boolean hasMore;
    public ArrayList<SearchAtMeMsgsItem> resultItems;
    public int searchId;
    public String selfGroupCardName;

    public SearchAtMeMsgsResult() {
        this.selfGroupCardName = "";
        this.resultItems = new ArrayList<>();
    }

    public boolean getHasMore() {
        return this.hasMore;
    }

    public ArrayList<SearchAtMeMsgsItem> getResultItems() {
        return this.resultItems;
    }

    public int getSearchId() {
        return this.searchId;
    }

    public String getSelfGroupCardName() {
        return this.selfGroupCardName;
    }

    public String toString() {
        return "SearchAtMeMsgsResult{searchId=" + this.searchId + ",hasMore=" + this.hasMore + ",selfGroupCardName=" + this.selfGroupCardName + ",resultItems=" + this.resultItems + ",}";
    }

    public SearchAtMeMsgsResult(int i, boolean z, String str, ArrayList<SearchAtMeMsgsItem> arrayList) {
        this.selfGroupCardName = "";
        this.resultItems = new ArrayList<>();
        this.searchId = i;
        this.hasMore = z;
        this.selfGroupCardName = str;
        this.resultItems = arrayList;
    }
}
