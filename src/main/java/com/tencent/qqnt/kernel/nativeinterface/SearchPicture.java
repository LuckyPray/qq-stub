package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchPicture.class */
public final class SearchPicture {
    public int height;
    public int width;
    public String picLink = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public SearchJump jumpLink = new SearchJump();
    public SearchReportInfo reportInfo = new SearchReportInfo();

    public int getHeight() {
        return this.height;
    }

    public SearchJump getJumpLink() {
        return this.jumpLink;
    }

    public String getPicLink() {
        return this.picLink;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "SearchPicture{picLink=" + this.picLink + ",jumpLink=" + this.jumpLink + ",height=" + this.height + ",width=" + this.width + ",reportInfo=" + this.reportInfo + ",}";
    }
}
