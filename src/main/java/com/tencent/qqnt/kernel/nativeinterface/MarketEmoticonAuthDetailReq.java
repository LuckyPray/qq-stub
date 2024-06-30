package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MarketEmoticonAuthDetailReq.class */
public final class MarketEmoticonAuthDetailReq {
    public String eId;
    public int epId;
    public MarketEmoticonAuthDetailScene scene;

    public MarketEmoticonAuthDetailReq() {
        this.eId = "";
        this.scene = MarketEmoticonAuthDetailScene.values()[0];
    }

    public String getEId() {
        return this.eId;
    }

    public int getEpId() {
        return this.epId;
    }

    public MarketEmoticonAuthDetailScene getScene() {
        return this.scene;
    }

    public String toString() {
        return "MarketEmoticonAuthDetailReq{epId=" + this.epId + ",eId=" + this.eId + ",scene=" + this.scene + ",}";
    }

    public MarketEmoticonAuthDetailReq(int i, String str, MarketEmoticonAuthDetailScene marketEmoticonAuthDetailScene) {
        this.eId = "";
        this.scene = MarketEmoticonAuthDetailScene.values()[0];
        this.epId = i;
        this.eId = str;
        this.scene = marketEmoticonAuthDetailScene;
    }
}
