package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DelBuddyInfo.class */
public final class DelBuddyInfo {
    public String friendUid;
    public boolean tempBlock;
    public boolean tempBothDel;

    public DelBuddyInfo() {
        this.friendUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFriendUid() {
        return this.friendUid;
    }

    public boolean getTempBlock() {
        return this.tempBlock;
    }

    public boolean getTempBothDel() {
        return this.tempBothDel;
    }

    public String toString() {
        return "DelBuddyInfo{friendUid=" + this.friendUid + ",tempBlock=" + this.tempBlock + ",tempBothDel=" + this.tempBothDel + ",}";
    }

    public DelBuddyInfo(String str, boolean z, boolean z2) {
        this.friendUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.friendUid = str;
        this.tempBlock = z;
        this.tempBothDel = z2;
    }
}
