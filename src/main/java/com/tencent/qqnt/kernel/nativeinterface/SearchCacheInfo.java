package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchCacheInfo.class */
public final class SearchCacheInfo {
    public ArrayList<String> fields;

    /* renamed from: id */
    public String f34id;

    public SearchCacheInfo() {
        this.f34id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fields = new ArrayList<>();
    }

    public ArrayList<String> getFields() {
        return this.fields;
    }

    public String getId() {
        return this.f34id;
    }

    public String toString() {
        return "SearchCacheInfo{id=" + this.f34id + ",fields=" + this.fields + ",}";
    }

    public SearchCacheInfo(String str, ArrayList<String> arrayList) {
        this.f34id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fields = new ArrayList<>();
        this.f34id = str;
        this.fields = arrayList;
    }
}
