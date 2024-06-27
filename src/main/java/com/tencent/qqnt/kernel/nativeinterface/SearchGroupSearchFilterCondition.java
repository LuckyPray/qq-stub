package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupSearchFilterCondition.class */
public final class SearchGroupSearchFilterCondition {
    public int geoInfoVersion;
    public ArrayList<String> tags = new ArrayList<>();
    public ArrayList<SearchProvince> geoInfoList = new ArrayList<>();
    public ArrayList<SearchGroupContentRankType> groupContentRankTypeList = new ArrayList<>();

    public ArrayList<SearchProvince> getGeoInfoList() {
        return this.geoInfoList;
    }

    public int getGeoInfoVersion() {
        return this.geoInfoVersion;
    }

    public ArrayList<SearchGroupContentRankType> getGroupContentRankTypeList() {
        return this.groupContentRankTypeList;
    }

    public ArrayList<String> getTags() {
        return this.tags;
    }

    public String toString() {
        return "SearchGroupSearchFilterCondition{tags=" + this.tags + ",geoInfoList=" + this.geoInfoList + ",groupContentRankTypeList=" + this.groupContentRankTypeList + ",geoInfoVersion=" + this.geoInfoVersion + ",}";
    }
}
