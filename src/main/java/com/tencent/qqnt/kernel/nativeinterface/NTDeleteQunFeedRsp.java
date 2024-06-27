package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTDeleteQunFeedRsp.class */
public final class NTDeleteQunFeedRsp {
    public int result;
    public int seq;
    public String errMs = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();
    public StCommonExt extInfo = new StCommonExt();

    public String getErrMs() {
        return this.errMs;
    }

    public StCommonExt getExtInfo() {
        return this.extInfo;
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

    public String getTraceId() {
        return this.traceId;
    }
}
