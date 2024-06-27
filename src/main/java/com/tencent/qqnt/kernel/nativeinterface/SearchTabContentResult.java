package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchTabContentResult.class */
public final class SearchTabContentResult {
    public SearchTabInfo tabInfo = new SearchTabInfo();
    public ArrayList<SearchTabContent> resultItems = new ArrayList<>();
    public SearchEmptyPageExtraInfo emptyPageExtraInfo = new SearchEmptyPageExtraInfo();
    public SearchFloatButton floatButton = new SearchFloatButton();

    public SearchEmptyPageExtraInfo getEmptyPageExtraInfo() {
        return this.emptyPageExtraInfo;
    }

    public SearchFloatButton getFloatButton() {
        return this.floatButton;
    }

    public ArrayList<SearchTabContent> getResultItems() {
        return this.resultItems;
    }

    public SearchTabInfo getTabInfo() {
        return this.tabInfo;
    }

    public String toString() {
        return "SearchTabContentResult{tabInfo=" + this.tabInfo + ",resultItems=" + this.resultItems + ",emptyPageExtraInfo=" + this.emptyPageExtraInfo + ",floatButton=" + this.floatButton + ",}";
    }
}
