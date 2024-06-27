package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StLBS.class */
public final class StLBS {
    public StGPS gps;
    public String location;

    public StLBS() {
        this.gps = new StGPS();
        this.location = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public StGPS getGps() {
        return this.gps;
    }

    public String getLocation() {
        return this.location;
    }

    public void setGps(StGPS stGPS) {
        this.gps = stGPS;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public StLBS(StGPS stGPS, String str) {
        this.gps = new StGPS();
        this.location = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gps = stGPS;
        this.location = str;
    }
}
