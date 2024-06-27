package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberCache.class */
public final class GroupMemberCache {
    public String specialTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public int titleId;

    public String getSpecialTitle() {
        return this.specialTitle;
    }

    public int getTitleId() {
        return this.titleId;
    }

    public String toString() {
        return "GroupMemberCache{specialTitle=" + this.specialTitle + ",titleId=" + this.titleId + ",}";
    }
}
