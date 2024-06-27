package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MemberID.class */
public final class MemberID {
    public String memberUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public long memberUin;

    public String getMemberUid() {
        return this.memberUid;
    }

    public long getMemberUin() {
        return this.memberUin;
    }

    public String toString() {
        return "MemberID{memberUin=" + this.memberUin + ",memberUid=" + this.memberUid + ",}";
    }
}
