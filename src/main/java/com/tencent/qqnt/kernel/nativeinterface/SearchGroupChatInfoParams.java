package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupChatInfoParams.class */
public final class SearchGroupChatInfoParams {
    public SearchGroupChatInfoBusinessType businessType;
    public ArrayList<String> filterMembersUid;
    public int pageLimit;
    public SearchGroupChatInfoSortType resultSortType;

    public SearchGroupChatInfoParams() {
        this.resultSortType = SearchGroupChatInfoSortType.values()[0];
        this.filterMembersUid = new ArrayList<>();
        this.businessType = SearchGroupChatInfoBusinessType.values()[0];
    }

    public SearchGroupChatInfoBusinessType getBusinessType() {
        return this.businessType;
    }

    public ArrayList<String> getFilterMembersUid() {
        return this.filterMembersUid;
    }

    public int getPageLimit() {
        return this.pageLimit;
    }

    public SearchGroupChatInfoSortType getResultSortType() {
        return this.resultSortType;
    }

    public String toString() {
        return "SearchGroupChatInfoParams{resultSortType=" + this.resultSortType + ",filterMembersUid=" + this.filterMembersUid + ",businessType=" + this.businessType + ",pageLimit=" + this.pageLimit + ",}";
    }

    public SearchGroupChatInfoParams(SearchGroupChatInfoSortType searchGroupChatInfoSortType, ArrayList<String> arrayList, SearchGroupChatInfoBusinessType searchGroupChatInfoBusinessType, int i) {
        this.resultSortType = SearchGroupChatInfoSortType.values()[0];
        this.filterMembersUid = new ArrayList<>();
        this.businessType = SearchGroupChatInfoBusinessType.values()[0];
        this.resultSortType = searchGroupChatInfoSortType;
        this.filterMembersUid = arrayList;
        this.businessType = searchGroupChatInfoBusinessType;
        this.pageLimit = i;
    }
}
