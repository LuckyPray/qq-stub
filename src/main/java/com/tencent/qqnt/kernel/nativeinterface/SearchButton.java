package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchButton.class */
public final class SearchButton {
    public int buttonType;
    public String title = "";
    public SearchJump jumpLink = new SearchJump();
    public SearchReportInfo reportInfo = new SearchReportInfo();

    public int getButtonType() {
        return this.buttonType;
    }

    public SearchJump getJumpLink() {
        return this.jumpLink;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "SearchButton{title=" + this.title + ",jumpLink=" + this.jumpLink + ",reportInfo=" + this.reportInfo + ",buttonType=" + this.buttonType + ",}";
    }
}
