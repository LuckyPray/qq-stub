package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupFileResult.class */
public final class SearchGroupFileResult {
    public boolean isEnd;
    public ArrayList<SearchGroupFileItem> item;
    public int ownerMatchCount;
    public int reqId;
    public GroupFileCommonResult result;
    public String syncCookie;
    public int totalMatchCount;

    public SearchGroupFileResult() {
        this.result = new GroupFileCommonResult();
        this.syncCookie = "";
        this.item = new ArrayList<>();
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public ArrayList<SearchGroupFileItem> getItem() {
        return this.item;
    }

    public int getOwnerMatchCount() {
        return this.ownerMatchCount;
    }

    public int getReqId() {
        return this.reqId;
    }

    public GroupFileCommonResult getResult() {
        return this.result;
    }

    public String getSyncCookie() {
        return this.syncCookie;
    }

    public int getTotalMatchCount() {
        return this.totalMatchCount;
    }

    public String toString() {
        return "SearchGroupFileResult{result=" + this.result + ",syncCookie=" + this.syncCookie + ",totalMatchCount=" + this.totalMatchCount + ",ownerMatchCount=" + this.ownerMatchCount + ",isEnd=" + this.isEnd + ",reqId=" + this.reqId + ",item=" + this.item + ",}";
    }

    public SearchGroupFileResult(GroupFileCommonResult groupFileCommonResult, String str, int i, int i2, boolean z, int i3, ArrayList<SearchGroupFileItem> arrayList) {
        this.result = new GroupFileCommonResult();
        this.syncCookie = "";
        this.item = new ArrayList<>();
        this.result = groupFileCommonResult;
        this.syncCookie = str;
        this.totalMatchCount = i;
        this.ownerMatchCount = i2;
        this.isEnd = z;
        this.reqId = i3;
        this.item = arrayList;
    }
}
