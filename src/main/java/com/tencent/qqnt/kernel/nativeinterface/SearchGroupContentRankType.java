package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupContentRankType.class */
public final class SearchGroupContentRankType {
    public int rankTypeId;
    public String rankTypeText = "";

    public int getRankTypeId() {
        return this.rankTypeId;
    }

    public String getRankTypeText() {
        return this.rankTypeText;
    }

    public String toString() {
        return "SearchGroupContentRankType{rankTypeId=" + this.rankTypeId + ",rankTypeText=" + this.rankTypeText + ",}";
    }
}
