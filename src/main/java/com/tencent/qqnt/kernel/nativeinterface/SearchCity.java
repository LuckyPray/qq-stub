package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchCity.class */
public final class SearchCity {
    public int cityId;
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<String> districts = new ArrayList<>();
    public ArrayList<SearchDistrict> districtsNewList = new ArrayList<>();

    public int getCityId() {
        return this.cityId;
    }

    public ArrayList<String> getDistricts() {
        return this.districts;
    }

    public ArrayList<SearchDistrict> getDistrictsNewList() {
        return this.districtsNewList;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "SearchCity{name=" + this.name + ",districts=" + this.districts + ",districtsNewList=" + this.districtsNewList + ",cityId=" + this.cityId + ",}";
    }
}
