package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchEmptyPageRichText.class */
public final class SearchEmptyPageRichText {
    public ArrayList<SearchEmptyPageText> highlightTextList = new ArrayList<>();

    public ArrayList<SearchEmptyPageText> getHighlightTextList() {
        return this.highlightTextList;
    }

    public String toString() {
        return "SearchEmptyPageRichText{highlightTextList=" + this.highlightTextList + ",}";
    }
}
