package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetMediaListTailTabReq.class */
public final class NTGetMediaListTailTabReq {
    public String currentAlbumId;
    public String qunId;
    public RequestTimelineInfo requestTimeLine;
    public int seq;

    public NTGetMediaListTailTabReq() {
        this.requestTimeLine = new RequestTimelineInfo();
        this.qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.currentAlbumId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCurrentAlbumId() {
        return this.currentAlbumId;
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

    public String toString() {
        return "NTGetMediaListTailTabReq{seq=" + this.seq + ",requestTimeLine=" + this.requestTimeLine + ",qunId=" + this.qunId + ",currentAlbumId=" + this.currentAlbumId + ",}";
    }

    public NTGetMediaListTailTabReq(int i, RequestTimelineInfo requestTimelineInfo, String str, String str2) {
        this.requestTimeLine = new RequestTimelineInfo();
        this.qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.currentAlbumId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.seq = i;
        this.requestTimeLine = requestTimelineInfo;
        this.qunId = str;
        this.currentAlbumId = str2;
    }
}
