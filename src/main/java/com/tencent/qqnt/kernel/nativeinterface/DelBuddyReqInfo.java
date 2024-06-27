package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DelBuddyReqInfo.class */
public final class DelBuddyReqInfo implements IKernelModel {
    public ArrayList<DelBuddyReq> buddyReqs;
    public boolean isClearAll;

    public DelBuddyReqInfo() {
        this.buddyReqs = new ArrayList<>();
    }

    public ArrayList<DelBuddyReq> getBuddyReqs() {
        return this.buddyReqs;
    }

    public boolean getIsClearAll() {
        return this.isClearAll;
    }

    public void setBuddyReqs(ArrayList<DelBuddyReq> arrayList) {
        this.buddyReqs = arrayList;
    }

    public void setIsClearAll(boolean z) {
        this.isClearAll = z;
    }

    public String toString() {
        return "DelBuddyReqInfo{isClearAll=" + this.isClearAll + ",buddyReqs=" + this.buddyReqs + ",}";
    }

    public DelBuddyReqInfo(boolean z, ArrayList<DelBuddyReq> arrayList) {
        this.buddyReqs = new ArrayList<>();
        this.isClearAll = z;
        this.buddyReqs = arrayList;
    }
}
