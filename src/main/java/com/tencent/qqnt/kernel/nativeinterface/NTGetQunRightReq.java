package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetQunRightReq.class */
public final class NTGetQunRightReq {
    public String qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();
    public int seq;

    public String getQunId() {
        return this.qunId;
    }

    public RequestTimelineInfo getRequestTimeLine() {
        return this.requestTimeLine;
    }

    public int getSeq() {
        return this.seq;
    }

    public String toString() {
        return "NTGetQunRightReq{seq=" + this.seq + ",qunId=" + this.qunId + ",requestTimeLine=" + this.requestTimeLine + ",}";
    }
}
