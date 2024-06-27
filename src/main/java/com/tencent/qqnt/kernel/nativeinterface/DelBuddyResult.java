package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DelBuddyResult.class */
public final class DelBuddyResult {
    public String friendUid;
    public long resultCode;
    public String resultMsg;

    public DelBuddyResult() {
        this.friendUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.resultMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFriendUid() {
        return this.friendUid;
    }

    public long getResultCode() {
        return this.resultCode;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public String toString() {
        return "DelBuddyResult{friendUid=" + this.friendUid + ",resultCode=" + this.resultCode + ",resultMsg=" + this.resultMsg + ",}";
    }

    public DelBuddyResult(String str, long j, String str2) {
        this.friendUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.resultMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.friendUid = str;
        this.resultCode = j;
        this.resultMsg = str2;
    }
}
