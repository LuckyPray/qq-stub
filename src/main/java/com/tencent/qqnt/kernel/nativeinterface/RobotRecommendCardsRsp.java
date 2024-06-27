package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotRecommendCardsRsp.class */
public final class RobotRecommendCardsRsp {
    public boolean haveNextPage;
    public boolean isRefresh;
    public byte[] pagingCookie = new byte[0];
    public String dataVersion = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public RobotTabInfo tabInfo = new RobotTabInfo();
    public ArrayList<RobotTabInfo> tabs = new ArrayList<>();
    public ArrayList<RobotRecommendCard> cards = new ArrayList<>();

    public ArrayList<RobotRecommendCard> getCards() {
        return this.cards;
    }

    public String getDataVersion() {
        return this.dataVersion;
    }

    public boolean getHaveNextPage() {
        return this.haveNextPage;
    }

    public boolean getIsRefresh() {
        return this.isRefresh;
    }

    public byte[] getPagingCookie() {
        return this.pagingCookie;
    }

    public RobotTabInfo getTabInfo() {
        return this.tabInfo;
    }

    public ArrayList<RobotTabInfo> getTabs() {
        return this.tabs;
    }

    public String toString() {
        return "RobotRecommendCardsRsp{pagingCookie=" + this.pagingCookie + ",haveNextPage=" + this.haveNextPage + ",dataVersion=" + this.dataVersion + ",tabInfo=" + this.tabInfo + ",isRefresh=" + this.isRefresh + ",tabs=" + this.tabs + ",cards=" + this.cards + ",}";
    }
}
