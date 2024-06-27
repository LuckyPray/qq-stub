package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTGetQunFeedsRsp.class */
public final class NTGetQunFeedsRsp {
    public boolean hasMore;
    public boolean isFromCache;
    public int result;
    public int seq;
    public int unreadFeedsNum;
    public String errMs = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public RequestTimelineInfo requestTimeLine = new RequestTimelineInfo();
    public StCommonExt extInfo = new StCommonExt();
    public ArrayList<ClientFeed> feeds = new ArrayList<>();
    public String attachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public StBanner banner = new StBanner();

    public String getAttachInfo() {
        return this.attachInfo;
    }

    public StBanner getBanner() {
        return this.banner;
    }

    public String getErrMs() {
        return this.errMs;
    }

    public StCommonExt getExtInfo() {
        return this.extInfo;
    }

    public ArrayList<ClientFeed> getFeeds() {
        return this.feeds;
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

    public int getSeq() {
        return this.seq;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public int getUnreadFeedsNum() {
        return this.unreadFeedsNum;
    }
}
