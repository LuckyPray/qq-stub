package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchEmptyPageText.class */
public final class SearchEmptyPageText {
    public String text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String jumpLink = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getJumpLink() {
        return this.jumpLink;
    }

    public String getText() {
        return this.text;
    }

    public String toString() {
        return "SearchEmptyPageText{text=" + this.text + ",jumpLink=" + this.jumpLink + ",}";
    }
}
