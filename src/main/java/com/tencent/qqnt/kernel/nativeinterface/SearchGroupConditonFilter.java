package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupConditonFilter.class */
public final class SearchGroupConditonFilter {
    public int groupRankType;
    public ArrayList<String> tags = new ArrayList<>();
    public SearchGeoInfo geoInfo = new SearchGeoInfo();

    public SearchGeoInfo getGeoInfo() {
        return this.geoInfo;
    }

    public int getGroupRankType() {
        return this.groupRankType;
    }

    public ArrayList<String> getTags() {
        return this.tags;
    }

    public String toString() {
        return "SearchGroupConditonFilter{groupRankType=" + this.groupRankType + ",tags=" + this.tags + ",geoInfo=" + this.geoInfo + ",}";
    }
}
