package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotRecommendCardsReq.class */
public final class RobotRecommendCardsReq {
    public boolean isLocal;
    public int pageNum;
    public boolean queryTab;
    public byte[] pagingCookie = new byte[0];
    public String dataVersion = "";
    public String tabId = "";

    public String getDataVersion() {
        return this.dataVersion;
    }

    public boolean getIsLocal() {
        return this.isLocal;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public byte[] getPagingCookie() {
        return this.pagingCookie;
    }

    public boolean getQueryTab() {
        return this.queryTab;
    }

    public String getTabId() {
        return this.tabId;
    }

    public String toString() {
        return "RobotRecommendCardsReq{pagingCookie=" + this.pagingCookie + ",dataVersion=" + this.dataVersion + ",tabId=" + this.tabId + ",pageNum=" + this.pageNum + ",queryTab=" + this.queryTab + ",isLocal=" + this.isLocal + ",}";
    }
}
