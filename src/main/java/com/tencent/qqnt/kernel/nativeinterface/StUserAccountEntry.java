package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StUserAccountEntry.class */
public final class StUserAccountEntry {
    public StUserAccountBaseMate account;
    public String uid;

    public StUserAccountEntry() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.account = new StUserAccountBaseMate();
    }

    public StUserAccountBaseMate getAccount() {
        return this.account;
    }

    public String getUid() {
        return this.uid;
    }

    public StUserAccountEntry(String str, StUserAccountBaseMate stUserAccountBaseMate) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.account = new StUserAccountBaseMate();
        this.uid = str;
        this.account = stUserAccountBaseMate;
    }
}
