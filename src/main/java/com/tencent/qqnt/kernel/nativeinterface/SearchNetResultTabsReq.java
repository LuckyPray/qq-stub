package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchNetResultTabsReq.class */
public final class SearchNetResultTabsReq {
    public int geoInfoVersion;
    public String version = "";
    public SearchDeviceInfo deviceInfo = new SearchDeviceInfo();
    public byte[] bytesExtension = new byte[0];

    public byte[] getBytesExtension() {
        return this.bytesExtension;
    }

    public SearchDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public int getGeoInfoVersion() {
        return this.geoInfoVersion;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "SearchNetResultTabsReq{version=" + this.version + ",deviceInfo=" + this.deviceInfo + ",geoInfoVersion=" + this.geoInfoVersion + ",bytesExtension=" + this.bytesExtension + ",}";
    }
}
