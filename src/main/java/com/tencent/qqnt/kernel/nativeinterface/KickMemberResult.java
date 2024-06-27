package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/KickMemberResult.class */
public final class KickMemberResult {
    public int result;
    public String uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getResult() {
        return this.result;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "KickMemberResult{uid=" + this.uid + ",result=" + this.result + ",}";
    }
}
