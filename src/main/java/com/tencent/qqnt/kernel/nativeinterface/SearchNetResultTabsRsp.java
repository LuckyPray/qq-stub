package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchNetResultTabsRsp.class */
public final class SearchNetResultTabsRsp {
    public int resultCode;
    public int searchHistoryCount;
    public String errorMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<SearchTabInfo> tabs = new ArrayList<>();
    public SearchGroupSearchFilterCondition groupFilterCondition = new SearchGroupSearchFilterCondition();

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SearchGroupSearchFilterCondition getGroupFilterCondition() {
        return this.groupFilterCondition;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public int getSearchHistoryCount() {
        return this.searchHistoryCount;
    }

    public ArrayList<SearchTabInfo> getTabs() {
        return this.tabs;
    }

    public String toString() {
        return "SearchNetResultTabsRsp{resultCode=" + this.resultCode + ",errorMsg=" + this.errorMsg + ",tabs=" + this.tabs + ",groupFilterCondition=" + this.groupFilterCondition + ",searchHistoryCount=" + this.searchHistoryCount + ",}";
    }
}
