package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTReportViewQunFeedRsp.class */
public final class NTReportViewQunFeedRsp {
    public int result;
    public int seq;
    public String errMs = "";
    public String traceId = "";
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();

    public String getErrMs() {
        return this.errMs;
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

    public String toString() {
        return "NTReportViewQunFeedRsp{seq=" + this.seq + ",result=" + this.result + ",errMs=" + this.errMs + ",traceId=" + this.traceId + ",requestTimeLine=" + this.requestTimeLine + ",}";
    }
}
