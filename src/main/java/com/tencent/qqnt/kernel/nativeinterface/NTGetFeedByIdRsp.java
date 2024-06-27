package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetFeedByIdRsp.class */
public final class NTGetFeedByIdRsp {
    public int result;
    public int seq;
    public String errMs = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String traceid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();
    public StCommonExt ext = new StCommonExt();
    public ClientFeed feed = new ClientFeed();

    public String getErrMs() {
        return this.errMs;
    }

    public StCommonExt getExt() {
        return this.ext;
    }

    public ClientFeed getFeed() {
        return this.feed;
    }

    public RequestTimelineInfo getRequestTimeLine() {
        return this.requestTimeLine;
    }

    public int getResult() {
        return this.result;
    }

    public int getSeq() {
        return this.seq;
    }

    public String getTraceid() {
        return this.traceid;
    }

    public String toString() {
        return "NTGetFeedByIdRsp{seq=" + this.seq + ",result=" + this.result + ",errMs=" + this.errMs + ",traceid=" + this.traceid + ",requestTimeLine=" + this.requestTimeLine + ",ext=" + this.ext + ",feed=" + this.feed + ",}";
    }
}
