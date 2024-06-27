package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NTReportViewQunFeedReq.class */
public final class NTReportViewQunFeedReq {
    public ArrayList<String> feedsCommcountKey;
    public String qunId;
    public RequestTimelineInfo requestTimeLine;
    public int seq;

    public NTReportViewQunFeedReq() {
        this.requestTimeLine = new RequestTimelineInfo();
        this.qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedsCommcountKey = new ArrayList<>();
    }

    public ArrayList<String> getFeedsCommcountKey() {
        return this.feedsCommcountKey;
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
        return "NTReportViewQunFeedReq{seq=" + this.seq + ",requestTimeLine=" + this.requestTimeLine + ",qunId=" + this.qunId + ",feedsCommcountKey=" + this.feedsCommcountKey + ",}";
    }

    public NTReportViewQunFeedReq(int i, RequestTimelineInfo requestTimelineInfo, String str, ArrayList<String> arrayList) {
        this.requestTimeLine = new RequestTimelineInfo();
        this.qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedsCommcountKey = new ArrayList<>();
        this.seq = i;
        this.requestTimeLine = requestTimelineInfo;
        this.qunId = str;
        this.feedsCommcountKey = arrayList;
    }
}
