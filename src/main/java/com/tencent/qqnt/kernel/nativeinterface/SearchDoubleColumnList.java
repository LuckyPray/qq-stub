package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchDoubleColumnList.class */
public final class SearchDoubleColumnList {
    public SearchText title = new SearchText();
    public SearchText subTitle = new SearchText();
    public SearchButton button = new SearchButton();
    public ArrayList<SearchListDetail> listList = new ArrayList<>();

    public SearchButton getButton() {
        return this.button;
    }

    public ArrayList<SearchListDetail> getListList() {
        return this.listList;
    }

    public SearchText getSubTitle() {
        return this.subTitle;
    }

    public SearchText getTitle() {
        return this.title;
    }

    public String toString() {
        return "SearchDoubleColumnList{title=" + this.title + ",subTitle=" + this.subTitle + ",button=" + this.button + ",listList=" + this.listList + ",}";
    }
}
