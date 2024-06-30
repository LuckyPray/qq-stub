package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchFloatButton.class */
public final class SearchFloatButton {
    public String title = "";
    public String jumpUrl = "";
    public SearchFloatButtonIcon icon = new SearchFloatButtonIcon();
    public SearchReportInfo reportInfo = new SearchReportInfo();

    public SearchFloatButtonIcon getIcon() {
        return this.icon;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "SearchFloatButton{title=" + this.title + ",jumpUrl=" + this.jumpUrl + ",icon=" + this.icon + ",reportInfo=" + this.reportInfo + ",}";
    }
}
