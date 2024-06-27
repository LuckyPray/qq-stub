package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchListDetail.class */
public final class SearchListDetail {
    public SearchIcon icon = new SearchIcon();
    public SearchText title = new SearchText();
    public SearchText subTitle = new SearchText();
    public SearchButton button = new SearchButton();
    public SearchJump jumpLink = new SearchJump();
    public SearchReportInfo reportInfo = new SearchReportInfo();

    public SearchButton getButton() {
        return this.button;
    }

    public SearchIcon getIcon() {
        return this.icon;
    }

    public SearchJump getJumpLink() {
        return this.jumpLink;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public SearchText getSubTitle() {
        return this.subTitle;
    }

    public SearchText getTitle() {
        return this.title;
    }

    public String toString() {
        return "SearchListDetail{icon=" + this.icon + ",title=" + this.title + ",subTitle=" + this.subTitle + ",button=" + this.button + ",jumpLink=" + this.jumpLink + ",reportInfo=" + this.reportInfo + ",}";
    }
}
