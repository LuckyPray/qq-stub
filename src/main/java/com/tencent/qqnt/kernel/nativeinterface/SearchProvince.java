package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchProvince.class */
public final class SearchProvince {
    public int cityId;
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<SearchCity> citys = new ArrayList<>();

    public int getCityId() {
        return this.cityId;
    }

    public ArrayList<SearchCity> getCitys() {
        return this.citys;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "SearchProvince{name=" + this.name + ",citys=" + this.citys + ",cityId=" + this.cityId + ",}";
    }
}
