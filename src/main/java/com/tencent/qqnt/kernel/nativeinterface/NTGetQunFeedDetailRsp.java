package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetQunFeedDetailRsp.class */
public final class NTGetQunFeedDetailRsp {
    public boolean hasmore;
    public int result;
    public int seq;
    public String errMs = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();
    public StCommonExt extInfo = new StCommonExt();
    public ClientFeed feed = new ClientFeed();
    public String attachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String mediaAttach = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public QunRight right = new QunRight();

    public String getAttachInfo() {
        return this.attachInfo;
    }

    public String getErrMs() {
        return this.errMs;
    }

    public StCommonExt getExtInfo() {
        return this.extInfo;
    }

    public ClientFeed getFeed() {
        return this.feed;
    }

    public boolean getHasmore() {
        return this.hasmore;
    }

    public String getMediaAttach() {
        return this.mediaAttach;
    }

    public RequestTimelineInfo getRequestTimeLine() {
        return this.requestTimeLine;
    }

    public int getResult() {
        return this.result;
    }

    public QunRight getRight() {
        return this.right;
    }

    public int getSeq() {
        return this.seq;
    }

    public String getTraceId() {
        return this.traceId;
    }
}
