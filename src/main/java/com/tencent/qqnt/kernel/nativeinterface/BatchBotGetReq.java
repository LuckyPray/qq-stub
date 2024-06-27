package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BatchBotGetReq.class */
public final class BatchBotGetReq {
    public boolean fullFetch;
    public int num;
    public int page;
    public ArrayList<Long> uins = new ArrayList<>();
    public CommonBotClientInfo clientInfo = new CommonBotClientInfo();
    public ArrayList<Long> tinyids = new ArrayList<>();
    public CommonBotScene scene = CommonBotScene.values()[0];
    public CommonBotFilter filter = CommonBotFilter.values()[0];
    public String bkn = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getBkn() {
        return this.bkn;
    }

    public CommonBotClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public CommonBotFilter getFilter() {
        return this.filter;
    }

    public boolean getFullFetch() {
        return this.fullFetch;
    }

    public int getNum() {
        return this.num;
    }

    public int getPage() {
        return this.page;
    }

    public CommonBotScene getScene() {
        return this.scene;
    }

    public ArrayList<Long> getTinyids() {
        return this.tinyids;
    }

    public ArrayList<Long> getUins() {
        return this.uins;
    }

    public void setBkn(String str) {
        this.bkn = str;
    }

    public void setClientInfo(CommonBotClientInfo commonBotClientInfo) {
        this.clientInfo = commonBotClientInfo;
    }

    public void setFilter(CommonBotFilter commonBotFilter) {
        this.filter = commonBotFilter;
    }

    public void setFullFetch(boolean z) {
        this.fullFetch = z;
    }

    public void setNum(int i) {
        this.num = i;
    }

    public void setPage(int i) {
        this.page = i;
    }

    public void setScene(CommonBotScene commonBotScene) {
        this.scene = commonBotScene;
    }

    public void setTinyids(ArrayList<Long> arrayList) {
        this.tinyids = arrayList;
    }

    public void setUins(ArrayList<Long> arrayList) {
        this.uins = arrayList;
    }

    public String toString() {
        return "BatchBotGetReq{uins=" + this.uins + ",num=" + this.num + ",clientInfo=" + this.clientInfo + ",tinyids=" + this.tinyids + ",page=" + this.page + ",fullFetch=" + this.fullFetch + ",scene=" + this.scene + ",filter=" + this.filter + ",bkn=" + this.bkn + ",}";
    }
}
