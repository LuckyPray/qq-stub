package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InviteInfo.class */
public final class InviteInfo {
    public String fromUid;
    public int inviteType;
    public long relationId;

    public InviteInfo() {
        this.fromUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFromUid() {
        return this.fromUid;
    }

    public int getInviteType() {
        return this.inviteType;
    }

    public long getRelationId() {
        return this.relationId;
    }

    public String toString() {
        return "InviteInfo{relationId=" + this.relationId + ",inviteType=" + this.inviteType + ",fromUid=" + this.fromUid + ",}";
    }

    public InviteInfo(long j, int i, String str) {
        this.fromUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.relationId = j;
        this.inviteType = i;
        this.fromUid = str;
    }
}
