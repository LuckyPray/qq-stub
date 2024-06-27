package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InviteMemberInfo.class */
public final class InviteMemberInfo {
    public long groupCode;
    public String uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getNick() {
        return this.nick;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "InviteMemberInfo{uid=" + this.uid + ",nick=" + this.nick + ",groupCode=" + this.groupCode + ",}";
    }
}
