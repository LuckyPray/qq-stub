package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetAlbumInfoReq.class */
public final class NTGetAlbumInfoReq {
    public String albumId;
    public String qunId;
    public RequestTimelineInfo requestTimeLine;
    public int seq;

    public NTGetAlbumInfoReq() {
        this.requestTimeLine = new RequestTimelineInfo();
        this.qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.albumId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAlbumId() {
        return this.albumId;
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
        return "NTGetAlbumInfoReq{seq=" + this.seq + ",requestTimeLine=" + this.requestTimeLine + ",qunId=" + this.qunId + ",albumId=" + this.albumId + ",}";
    }

    public NTGetAlbumInfoReq(int i, RequestTimelineInfo requestTimelineInfo, String str, String str2) {
        this.requestTimeLine = new RequestTimelineInfo();
        this.qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.albumId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.seq = i;
        this.requestTimeLine = requestTimelineInfo;
        this.qunId = str;
        this.albumId = str2;
    }
}
