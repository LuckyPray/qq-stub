package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchTitle.class */
public final class SearchTitle {
    public SearchText title = new SearchText();
    public SearchText subTitle = new SearchText();
    public SearchButton button = new SearchButton();
    public SearchIcon icon = new SearchIcon();

    public SearchButton getButton() {
        return this.button;
    }

    public SearchIcon getIcon() {
        return this.icon;
    }

    public SearchText getSubTitle() {
        return this.subTitle;
    }

    public SearchText getTitle() {
        return this.title;
    }

    public String toString() {
        return "SearchTitle{title=" + this.title + ",subTitle=" + this.subTitle + ",button=" + this.button + ",icon=" + this.icon + ",}";
    }
}
