package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StGPS.class */
public final class StGPS {
    public long alt;
    public long eType;
    public long lat;
    public long lon;

    public StGPS() {
    }

    public long getAlt() {
        return this.alt;
    }

    public long getEType() {
        return this.eType;
    }

    public long getLat() {
        return this.lat;
    }

    public long getLon() {
        return this.lon;
    }

    public void setAlt(long j) {
        this.alt = j;
    }

    public void setEType(long j) {
        this.eType = j;
    }

    public void setLat(long j) {
        this.lat = j;
    }

    public void setLon(long j) {
        this.lon = j;
    }

    public StGPS(long j, long j2, long j3, long j4) {
        this.lat = j;
        this.lon = j2;
        this.eType = j3;
        this.alt = j4;
    }
}
