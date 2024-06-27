package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetAllAlbumListReq.class */
public final class NTGetAllAlbumListReq {
    public String attachInfo;
    public RequestTimelineInfo requestTimeLine;
    public int seq;

    public NTGetAllAlbumListReq() {
        this.requestTimeLine = new RequestTimelineInfo();
        this.attachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAttachInfo() {
        return this.attachInfo;
    }

    public RequestTimelineInfo getRequestTimeLine() {
        return this.requestTimeLine;
    }

    public int getSeq() {
        return this.seq;
    }

    public String toString() {
        return "NTGetAllAlbumListReq{seq=" + this.seq + ",requestTimeLine=" + this.requestTimeLine + ",attachInfo=" + this.attachInfo + ",}";
    }

    public NTGetAllAlbumListReq(int i, RequestTimelineInfo requestTimelineInfo, String str) {
        this.requestTimeLine = new RequestTimelineInfo();
        this.attachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.seq = i;
        this.requestTimeLine = requestTimelineInfo;
        this.attachInfo = str;
    }
}
