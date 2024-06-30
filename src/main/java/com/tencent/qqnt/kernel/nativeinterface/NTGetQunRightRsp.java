package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetQunRightRsp.class */
public final class NTGetQunRightRsp {
    public boolean normalUpload;
    public int result;
    public int seq;
    public String errMs = "";
    public QunRight right = new QunRight();
    public String traceid = "";
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();

    public String getErrMs() {
        return this.errMs;
    }

    public boolean getNormalUpload() {
        return this.normalUpload;
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

    public String getTraceid() {
        return this.traceid;
    }

    public String toString() {
        return "NTGetQunRightRsp{seq=" + this.seq + ",result=" + this.result + ",errMs=" + this.errMs + ",right=" + this.right + ",normalUpload=" + this.normalUpload + ",traceid=" + this.traceid + ",requestTimeLine=" + this.requestTimeLine + ",}";
    }
}
