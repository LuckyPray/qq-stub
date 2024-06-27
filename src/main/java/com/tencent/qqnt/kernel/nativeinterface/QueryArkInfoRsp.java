package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QueryArkInfoRsp.class */
public final class QueryArkInfoRsp {
    public ArrayList<ArkInfo> arkInfos;
    public boolean isLastPage;

    public QueryArkInfoRsp() {
        this.arkInfos = new ArrayList<>();
    }

    public ArrayList<ArkInfo> getArkInfos() {
        return this.arkInfos;
    }

    public boolean getIsLastPage() {
        return this.isLastPage;
    }

    public String toString() {
        return "QueryArkInfoRsp{isLastPage=" + this.isLastPage + ",arkInfos=" + this.arkInfos + ",}";
    }

    public QueryArkInfoRsp(boolean z, ArrayList<ArkInfo> arrayList) {
        this.arkInfos = new ArrayList<>();
        this.isLastPage = z;
        this.arkInfos = arrayList;
    }
}
