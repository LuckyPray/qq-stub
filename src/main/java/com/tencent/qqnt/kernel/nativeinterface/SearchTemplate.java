package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchTemplate.class */
public final class SearchTemplate {
    public SearchBanner banner;
    public SearchDoubleColumnList doubleColumnList;
    public SearchEmotionList emotionList;
    public SearchGroupExtension groupExtension;
    public SearchGroupFile groupFile;
    public SearchHeadTopic headTopic;
    public SearchHorizontalList horizontalList;
    public SearchNineBoxGrid nineBoxGrid;
    public SearchPlayletDetail playletDetail;
    public int templateId;
    public SearchTitle title;
    public SearchTopicHeader topicHeader;
    public SearchVerticalDetail verticalDetail;
    public SearchVerticalList verticalList;
    public String data = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public SearchLayOut layOut = new SearchLayOut();
    public SearchReportInfo reportInfo = new SearchReportInfo();
    public SearchJump jumpLink = new SearchJump();
    public byte[] pbData = new byte[0];

    public SearchBanner getBanner() {
        return this.banner;
    }

    public String getData() {
        return this.data;
    }

    public SearchDoubleColumnList getDoubleColumnList() {
        return this.doubleColumnList;
    }

    public SearchEmotionList getEmotionList() {
        return this.emotionList;
    }

    public SearchGroupExtension getGroupExtension() {
        return this.groupExtension;
    }

    public SearchGroupFile getGroupFile() {
        return this.groupFile;
    }

    public SearchHeadTopic getHeadTopic() {
        return this.headTopic;
    }

    public SearchHorizontalList getHorizontalList() {
        return this.horizontalList;
    }

    public SearchJump getJumpLink() {
        return this.jumpLink;
    }

    public SearchLayOut getLayOut() {
        return this.layOut;
    }

    public SearchNineBoxGrid getNineBoxGrid() {
        return this.nineBoxGrid;
    }

    public byte[] getPbData() {
        return this.pbData;
    }

    public SearchPlayletDetail getPlayletDetail() {
        return this.playletDetail;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public int getTemplateId() {
        return this.templateId;
    }

    public SearchTitle getTitle() {
        return this.title;
    }

    public SearchTopicHeader getTopicHeader() {
        return this.topicHeader;
    }

    public SearchVerticalDetail getVerticalDetail() {
        return this.verticalDetail;
    }

    public SearchVerticalList getVerticalList() {
        return this.verticalList;
    }

    public String toString() {
        return "SearchTemplate{templateId=" + this.templateId + ",data=" + this.data + ",layOut=" + this.layOut + ",reportInfo=" + this.reportInfo + ",jumpLink=" + this.jumpLink + ",pbData=" + this.pbData + ",headTopic=" + this.headTopic + ",horizontalList=" + this.horizontalList + ",verticalList=" + this.verticalList + ",banner=" + this.banner + ",nineBoxGrid=" + this.nineBoxGrid + ",title=" + this.title + ",groupFile=" + this.groupFile + ",doubleColumnList=" + this.doubleColumnList + ",verticalDetail=" + this.verticalDetail + ",playletDetail=" + this.playletDetail + ",groupExtension=" + this.groupExtension + ",emotionList=" + this.emotionList + ",topicHeader=" + this.topicHeader + ",}";
    }
}
