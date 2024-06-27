package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchRichText.class */
public final class SearchRichText {
    public ArrayList<SearchText> highlightTextList = new ArrayList<>();

    public ArrayList<SearchText> getHighlightTextList() {
        return this.highlightTextList;
    }

    public String toString() {
        return "SearchRichText{highlightTextList=" + this.highlightTextList + ",}";
    }
}
