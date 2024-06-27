package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchBanner.class */
public final class SearchBanner {
    public SearchIcon background = new SearchIcon();
    public SearchIcon icon = new SearchIcon();
    public SearchText title = new SearchText();
    public SearchText subTitle = new SearchText();
    public SearchButton button = new SearchButton();
    public ArrayList<SearchText> textLinkList = new ArrayList<>();

    public SearchIcon getBackground() {
        return this.background;
    }

    public SearchButton getButton() {
        return this.button;
    }

    public SearchIcon getIcon() {
        return this.icon;
    }

    public SearchText getSubTitle() {
        return this.subTitle;
    }

    public ArrayList<SearchText> getTextLinkList() {
        return this.textLinkList;
    }

    public SearchText getTitle() {
        return this.title;
    }

    public String toString() {
        return "SearchBanner{background=" + this.background + ",icon=" + this.icon + ",title=" + this.title + ",subTitle=" + this.subTitle + ",button=" + this.button + ",textLinkList=" + this.textLinkList + ",}";
    }
}
