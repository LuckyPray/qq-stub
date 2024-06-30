package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchDistrict.class */
public final class SearchDistrict {
    public int cityId;
    public String name = "";

    public int getCityId() {
        return this.cityId;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "SearchDistrict{name=" + this.name + ",cityId=" + this.cityId + ",}";
    }
}
