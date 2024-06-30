package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupGeoInfo.class */
public final class GroupGeoInfo implements IKernelModel {
    public int CityId;
    public long Latitude;
    public long Longitude;
    public int SetTime;
    public long poiId;
    public String ownerUid = "";
    public String GeoContent = "";

    public int getCityId() {
        return this.CityId;
    }

    public String getGeoContent() {
        return this.GeoContent;
    }

    public long getLatitude() {
        return this.Latitude;
    }

    public long getLongitude() {
        return this.Longitude;
    }

    public String getOwnerUid() {
        return this.ownerUid;
    }

    public long getPoiId() {
        return this.poiId;
    }

    public int getSetTime() {
        return this.SetTime;
    }

    public void setCityId(int i) {
        this.CityId = i;
    }

    public void setGeoContent(String str) {
        this.GeoContent = str;
    }

    public void setLatitude(long j) {
        this.Latitude = j;
    }

    public void setLongitude(long j) {
        this.Longitude = j;
    }

    public void setOwnerUid(String str) {
        this.ownerUid = str;
    }

    public void setPoiId(long j) {
        this.poiId = j;
    }

    public void setSetTime(int i) {
        this.SetTime = i;
    }

    public String toString() {
        return "GroupGeoInfo{ownerUid=" + this.ownerUid + ",SetTime=" + this.SetTime + ",CityId=" + this.CityId + ",Longitude=" + this.Longitude + ",Latitude=" + this.Latitude + ",GeoContent=" + this.GeoContent + ",poiId=" + this.poiId + ",}";
    }
}
