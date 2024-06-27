package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchDiscussInfoItem.class */
public final class SearchDiscussInfoItem {
    public long discussCode;
    public String discussName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<SearchHitInfo> discussNameHits = new ArrayList<>();

    public long getDiscussCode() {
        return this.discussCode;
    }

    public String getDiscussName() {
        return this.discussName;
    }

    public ArrayList<SearchHitInfo> getDiscussNameHits() {
        return this.discussNameHits;
    }

    public String toString() {
        return "SearchDiscussInfoItem{discussCode=" + this.discussCode + ",discussName=" + this.discussName + ",discussNameHits=" + this.discussNameHits + ",}";
    }
}
