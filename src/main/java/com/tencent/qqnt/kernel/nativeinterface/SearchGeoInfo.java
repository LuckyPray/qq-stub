package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGeoInfo.class */
public final class SearchGeoInfo {
    public int cityId;
    public String province = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String city = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String district = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getCity() {
        return this.city;
    }

    public int getCityId() {
        return this.cityId;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvince() {
        return this.province;
    }

    public String toString() {
        return "SearchGeoInfo{province=" + this.province + ",city=" + this.city + ",district=" + this.district + ",cityId=" + this.cityId + ",}";
    }
}
