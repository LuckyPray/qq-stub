package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StQWebReq.class */
public final class StQWebReq {
    public long Seq;
    public String qua = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String deviceInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public byte[] busiBuff = new byte[0];
    public String traceid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public byte[] getBusiBuff() {
        return this.busiBuff;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public String getQua() {
        return this.qua;
    }

    public long getSeq() {
        return this.Seq;
    }

    public String getTraceid() {
        return this.traceid;
    }
}
