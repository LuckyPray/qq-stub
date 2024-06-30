package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetQunCommentRsp.class */
public final class NTGetQunCommentRsp {
    public boolean hasmore;
    public int result;
    public int seq;
    public String errMs = "";
    public String traceId = "";
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();
    public StCommonExt ext = new StCommonExt();
    public StFeedCellComment cellComment = new StFeedCellComment();
    public String attachInfo = "";

    public String getAttachInfo() {
        return this.attachInfo;
    }

    public StFeedCellComment getCellComment() {
        return this.cellComment;
    }

    public String getErrMs() {
        return this.errMs;
    }

    public StCommonExt getExt() {
        return this.ext;
    }

    public boolean getHasmore() {
        return this.hasmore;
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
        return "NTGetQunCommentRsp{seq=" + this.seq + ",result=" + this.result + ",errMs=" + this.errMs + ",traceId=" + this.traceId + ",requestTimeLine=" + this.requestTimeLine + ",ext=" + this.ext + ",cellComment=" + this.cellComment + ",hasmore=" + this.hasmore + ",attachInfo=" + this.attachInfo + ",}";
    }
}
