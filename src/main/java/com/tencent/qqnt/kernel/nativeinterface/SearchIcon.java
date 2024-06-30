package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchIcon.class */
public final class SearchIcon {
    public int height;
    public int iconType;
    public long timestamp;
    public int uinType;
    public int width;
    public String iconLink = "";
    public SearchJump jumpLink = new SearchJump();
    public SearchText title = new SearchText();
    public SearchText subTitle = new SearchText();
    public SearchPictureDetail auth = new SearchPictureDetail();
    public SearchReportInfo reportInfo = new SearchReportInfo();
    public String uin = "";
    public String iconToken = "";
    public String iconColorToken = "";
    public String iconBgColor = "";
    public String visibleRangeIconLink = "";
    public String visibleRangeTitleText = "";

    public SearchPictureDetail getAuth() {
        return this.auth;
    }

    public int getHeight() {
        return this.height;
    }

    public String getIconBgColor() {
        return this.iconBgColor;
    }

    public String getIconColorToken() {
        return this.iconColorToken;
    }

    public String getIconLink() {
        return this.iconLink;
    }

    public String getIconToken() {
        return this.iconToken;
    }

    public int getIconType() {
        return this.iconType;
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

    public long getTimestamp() {
        return this.timestamp;
    }

    public SearchText getTitle() {
        return this.title;
    }

    public String getUin() {
        return this.uin;
    }

    public int getUinType() {
        return this.uinType;
    }

    public String getVisibleRangeIconLink() {
        return this.visibleRangeIconLink;
    }

    public String getVisibleRangeTitleText() {
        return this.visibleRangeTitleText;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "SearchIcon{iconLink=" + this.iconLink + ",jumpLink=" + this.jumpLink + ",title=" + this.title + ",subTitle=" + this.subTitle + ",timestamp=" + this.timestamp + ",auth=" + this.auth + ",reportInfo=" + this.reportInfo + ",iconType=" + this.iconType + ",width=" + this.width + ",height=" + this.height + ",uin=" + this.uin + ",uinType=" + this.uinType + ",iconToken=" + this.iconToken + ",iconColorToken=" + this.iconColorToken + ",iconBgColor=" + this.iconBgColor + ",visibleRangeIconLink=" + this.visibleRangeIconLink + ",visibleRangeTitleText=" + this.visibleRangeTitleText + ",}";
    }
}
