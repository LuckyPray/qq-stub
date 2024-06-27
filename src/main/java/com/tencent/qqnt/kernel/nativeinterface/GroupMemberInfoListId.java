package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberInfoListId.class */
public final class GroupMemberInfoListId {
    public int index;
    public String uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getIndex() {
        return this.index;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "GroupMemberInfoListId{uid=" + this.uid + ",index=" + this.index + ",}";
    }
}
