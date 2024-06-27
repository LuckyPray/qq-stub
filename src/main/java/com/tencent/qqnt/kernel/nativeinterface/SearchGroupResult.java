package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupResult.class */
public final class SearchGroupResult {
    public int errorode;
    public ArrayList<SearchRspGroupInfo> groupInfos;
    public boolean isEnd;
    public int nextPos;
    public String penetrate;

    public SearchGroupResult() {
        this.groupInfos = new ArrayList<>();
        this.penetrate = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getErrorode() {
        return this.errorode;
    }

    public ArrayList<SearchRspGroupInfo> getGroupInfos() {
        return this.groupInfos;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public int getNextPos() {
        return this.nextPos;
    }

    public String getPenetrate() {
        return this.penetrate;
    }

    public String toString() {
        return "SearchGroupResult{errorode=" + this.errorode + ",groupInfos=" + this.groupInfos + ",penetrate=" + this.penetrate + ",isEnd=" + this.isEnd + ",nextPos=" + this.nextPos + ",}";
    }

    public SearchGroupResult(int i, ArrayList<SearchRspGroupInfo> arrayList, String str, boolean z, int i2) {
        this.groupInfos = new ArrayList<>();
        this.penetrate = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.errorode = i;
        this.groupInfos = arrayList;
        this.penetrate = str;
        this.isEnd = z;
        this.nextPos = i2;
    }
}
