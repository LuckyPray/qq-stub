package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchText.class */
public final class SearchText {
    public String text = "";
    public SearchJump jumpLink = new SearchJump();
    public SearchReportInfo reportInfo = new SearchReportInfo();
    public String color = "";

    public String getColor() {
        return this.color;
    }

    public SearchJump getJumpLink() {
        return this.jumpLink;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public String getText() {
        return this.text;
    }

    public String toString() {
        return "SearchText{text=" + this.text + ",jumpLink=" + this.jumpLink + ",reportInfo=" + this.reportInfo + ",color=" + this.color + ",}";
    }
}
