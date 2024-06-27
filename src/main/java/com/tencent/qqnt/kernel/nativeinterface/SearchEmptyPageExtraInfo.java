package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchEmptyPageExtraInfo.class */
public final class SearchEmptyPageExtraInfo {
    public String text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public SearchEmptyPageRichText richText = new SearchEmptyPageRichText();
    public String title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public SearchEmptyPageRichText getRichText() {
        return this.richText;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "SearchEmptyPageExtraInfo{text=" + this.text + ",jumpUrl=" + this.jumpUrl + ",richText=" + this.richText + ",title=" + this.title + ",}";
    }
}
