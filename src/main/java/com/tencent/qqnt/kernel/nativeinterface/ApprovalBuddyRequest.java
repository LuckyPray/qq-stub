package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ApprovalBuddyRequest.class */
public final class ApprovalBuddyRequest {
    public boolean accept;
    public String friendUid;
    public String refuseMsg;
    public long reqTime;

    public ApprovalBuddyRequest() {
        this.friendUid = "";
    }

    public boolean getAccept() {
        return this.accept;
    }

    public String getFriendUid() {
        return this.friendUid;
    }

    public String getRefuseMsg() {
        return this.refuseMsg;
    }

    public long getReqTime() {
        return this.reqTime;
    }

    public String toString() {
        return "ApprovalBuddyRequest{friendUid=" + this.friendUid + ",accept=" + this.accept + ",refuseMsg=" + this.refuseMsg + ",reqTime=" + this.reqTime + ",}";
    }

    public ApprovalBuddyRequest(String str, boolean z, String str2, long j) {
        this.friendUid = "";
        this.friendUid = str;
        this.accept = z;
        this.refuseMsg = str2;
        this.reqTime = j;
    }
}
