package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetQunFeedDetailReq.class */
public final class NTGetQunFeedDetailReq {
    public int commentCount;
    public int seq;
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();
    public StCommonExt extInfo = new StCommonExt();
    public String qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String attachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String albumId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String batchId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String lloc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getAlbumId() {
        return this.albumId;
    }

    public String getAttachInfo() {
        return this.attachInfo;
    }

    public String getBatchId() {
        return this.batchId;
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public StCommonExt getExtInfo() {
        return this.extInfo;
    }

    public String getFeedId() {
        return this.feedId;
    }

    public String getLloc() {
        return this.lloc;
    }

    public String getQunId() {
        return this.qunId;
    }

    public RequestTimelineInfo getRequestTimeLine() {
        return this.requestTimeLine;
    }

    public int getSeq() {
        return this.seq;
    }

    public void setAlbumId(String str) {
        this.albumId = str;
    }

    public void setAttachInfo(String str) {
        this.attachInfo = str;
    }

    public void setBatchId(String str) {
        this.batchId = str;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setExtInfo(StCommonExt stCommonExt) {
        this.extInfo = stCommonExt;
    }

    public void setFeedId(String str) {
        this.feedId = str;
    }

    public void setLloc(String str) {
        this.lloc = str;
    }

    public void setQunId(String str) {
        this.qunId = str;
    }

    public void setRequestTimeLine(RequestTimelineInfo requestTimelineInfo) {
        this.requestTimeLine = requestTimelineInfo;
    }

    public void setSeq(int i) {
        this.seq = i;
    }
}
