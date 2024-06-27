package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchNineBoxContent.class */
public final class SearchNineBoxContent {
    public int type;
    public SearchPictureDetail picture = new SearchPictureDetail();
    public SearchVideo video = new SearchVideo();
    public SearchReportInfo reportInfo = new SearchReportInfo();

    public SearchPictureDetail getPicture() {
        return this.picture;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public int getType() {
        return this.type;
    }

    public SearchVideo getVideo() {
        return this.video;
    }

    public String toString() {
        return "SearchNineBoxContent{type=" + this.type + ",picture=" + this.picture + ",video=" + this.video + ",reportInfo=" + this.reportInfo + ",}";
    }
}
