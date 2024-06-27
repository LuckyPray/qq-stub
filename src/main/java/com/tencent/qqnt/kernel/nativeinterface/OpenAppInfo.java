package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OpenAppInfo.class */
public final class OpenAppInfo {
    public OpenAppType appType;
    public String comeFrom;
    public long openAppid;

    public OpenAppInfo() {
        this.appType = OpenAppType.values()[0];
        this.comeFrom = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public OpenAppType getAppType() {
        return this.appType;
    }

    public String getComeFrom() {
        return this.comeFrom;
    }

    public long getOpenAppid() {
        return this.openAppid;
    }

    public String toString() {
        return "OpenAppInfo{openAppid=" + this.openAppid + ",appType=" + this.appType + ",comeFrom=" + this.comeFrom + ",}";
    }

    public OpenAppInfo(long j, OpenAppType openAppType, String str) {
        this.appType = OpenAppType.values()[0];
        this.comeFrom = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.openAppid = j;
        this.appType = openAppType;
        this.comeFrom = str;
    }
}
