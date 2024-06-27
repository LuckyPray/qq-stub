package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BuddyReqInfo.class */
public final class BuddyReqInfo implements IKernelModel {
    public ArrayList<BuddyReq> buddyReqs;
    public int unreadNums;

    public BuddyReqInfo() {
        this.buddyReqs = new ArrayList<>();
    }

    public ArrayList<BuddyReq> getBuddyReqs() {
        return this.buddyReqs;
    }

    public int getUnreadNums() {
        return this.unreadNums;
    }

    public void setBuddyReqs(ArrayList<BuddyReq> arrayList) {
        this.buddyReqs = arrayList;
    }

    public void setUnreadNums(int i) {
        this.unreadNums = i;
    }

    public String toString() {
        return "BuddyReqInfo{unreadNums=" + this.unreadNums + ",buddyReqs=" + this.buddyReqs + ",}";
    }

    public BuddyReqInfo(int i, ArrayList<BuddyReq> arrayList) {
        this.buddyReqs = new ArrayList<>();
        this.unreadNums = i;
        this.buddyReqs = arrayList;
    }
}
