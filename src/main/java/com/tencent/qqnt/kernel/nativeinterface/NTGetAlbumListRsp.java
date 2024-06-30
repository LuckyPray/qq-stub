package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetAlbumListRsp.class */
public final class NTGetAlbumListRsp {
    public boolean hasMore;
    public boolean isFromCache;
    public int result;
    public int seq;
    public String errMs = "";
    public String traceId = "";
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();
    public ArrayList<AlbumInfo> albumList = new ArrayList<>();
    public String attachInfo = "";
    public QunRight right = new QunRight();
    public StBanner banner = new StBanner();

    public ArrayList<AlbumInfo> getAlbumList() {
        return this.albumList;
    }

    public String getAttachInfo() {
        return this.attachInfo;
    }

    public StBanner getBanner() {
        return this.banner;
    }

    public String getErrMs() {
        return this.errMs;
    }

    public boolean getHasMore() {
        return this.hasMore;
    }

    public boolean getIsFromCache() {
        return this.isFromCache;
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

    public String getTraceId() {
        return this.traceId;
    }
}
