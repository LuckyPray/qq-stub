package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchHorizontalList.class */
public final class SearchHorizontalList {
    public int listType;
    public SearchText title = new SearchText();
    public SearchButton button = new SearchButton();
    public ArrayList<SearchListDetail> listList = new ArrayList<>();

    public SearchButton getButton() {
        return this.button;
    }

    public ArrayList<SearchListDetail> getListList() {
        return this.listList;
    }

    public int getListType() {
        return this.listType;
    }

    public SearchText getTitle() {
        return this.title;
    }

    public String toString() {
        return "SearchHorizontalList{listType=" + this.listType + ",title=" + this.title + ",button=" + this.button + ",listList=" + this.listList + ",}";
    }
}
