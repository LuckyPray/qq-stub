package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchFileAssistantFileResult.class */
public final class SearchFileAssistantFileResult {
    public boolean hasMore;
    public int resultId;
    public ArrayList<FileAssistantModel> resultItems;
    public int searchId;

    public SearchFileAssistantFileResult() {
        this.resultItems = new ArrayList<>();
    }

    public boolean getHasMore() {
        return this.hasMore;
    }

    public int getResultId() {
        return this.resultId;
    }

    public ArrayList<FileAssistantModel> getResultItems() {
        return this.resultItems;
    }

    public int getSearchId() {
        return this.searchId;
    }

    public String toString() {
        return "SearchFileAssistantFileResult{searchId=" + this.searchId + ",resultId=" + this.resultId + ",hasMore=" + this.hasMore + ",resultItems=" + this.resultItems + ",}";
    }

    public SearchFileAssistantFileResult(int i, int i2, boolean z, ArrayList<FileAssistantModel> arrayList) {
        this.resultItems = new ArrayList<>();
        this.searchId = i;
        this.resultId = i2;
        this.hasMore = z;
        this.resultItems = arrayList;
    }
}
