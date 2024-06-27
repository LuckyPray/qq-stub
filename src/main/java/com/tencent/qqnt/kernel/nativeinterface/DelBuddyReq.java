package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DelBuddyReq.class */
public final class DelBuddyReq implements IKernelModel {
    public String friendUid;
    public boolean isDecide;
    public boolean isInitiator;
    public long reqTime;
    public int reqType;

    public DelBuddyReq() {
        this.friendUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFriendUid() {
        return this.friendUid;
    }

    public boolean getIsDecide() {
        return this.isDecide;
    }

    public boolean getIsInitiator() {
        return this.isInitiator;
    }

    public long getReqTime() {
        return this.reqTime;
    }

    public int getReqType() {
        return this.reqType;
    }

    public void setFriendUid(String str) {
        this.friendUid = str;
    }

    public void setIsDecide(boolean z) {
        this.isDecide = z;
    }

    public void setIsInitiator(boolean z) {
        this.isInitiator = z;
    }

    public void setReqTime(long j) {
        this.reqTime = j;
    }

    public void setReqType(int i) {
        this.reqType = i;
    }

    public String toString() {
        return "DelBuddyReq{isDecide=" + this.isDecide + ",isInitiator=" + this.isInitiator + ",friendUid=" + this.friendUid + ",reqType=" + this.reqType + ",reqTime=" + this.reqTime + ",}";
    }

    public DelBuddyReq(boolean z, boolean z2, String str, int i, long j) {
        this.friendUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.isDecide = z;
        this.isInitiator = z2;
        this.friendUid = str;
        this.reqType = i;
        this.reqTime = j;
    }
}
