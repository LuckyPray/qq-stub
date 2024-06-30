package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetMediaListReq.class */
public final class NTGetMediaListReq {
    public long batchId;
    public int seq;
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();
    public String qunId = "";
    public String albumId = "";
    public String lloc = "";
    public String attachInfo = "";

    public String getAlbumId() {
        return this.albumId;
    }

    public String getAttachInfo() {
        return this.attachInfo;
    }

    public long getBatchId() {
        return this.batchId;
    }

    public String getLloc() {
        return this.lloc;
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

    public void setAlbumId(String str) {
        this.albumId = str;
    }

    public void setAttachInfo(String str) {
        this.attachInfo = str;
    }

    public void setBatchId(long j) {
        this.batchId = j;
    }

    public void setLloc(String str) {
        this.lloc = str;
    }

    public void setQunId(String str) {
        this.qunId = str;
    }

    public void setRequestTimeLine(RequestTimelineInfo requestTimelineInfo) {
        this.requestTimeLine = requestTimelineInfo;
    }

    public void setSeq(int i) {
        this.seq = i;
    }
}
