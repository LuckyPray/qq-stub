package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RevealDoufuInfo.class */
public final class RevealDoufuInfo {
    public long bid;
    public String uid;
    public String uuid;

    public RevealDoufuInfo() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uuid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getBid() {
        return this.bid;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String toString() {
        return "RevealDoufuInfo{uid=" + this.uid + ",bid=" + this.bid + ",uuid=" + this.uuid + ",}";
    }

    public RevealDoufuInfo(String str, long j, String str2) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uuid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uid = str;
        this.bid = j;
        this.uuid = str2;
    }
}
