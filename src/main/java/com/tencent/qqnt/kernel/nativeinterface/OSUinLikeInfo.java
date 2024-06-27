package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSUinLikeInfo.class */
public final class OSUinLikeInfo {
    public ArrayList<OSLikeItem> likeItems;
    public String uid;
    public long uin;

    public OSUinLikeInfo() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.likeItems = new ArrayList<>();
    }

    public ArrayList<OSLikeItem> getLikeItems() {
        return this.likeItems;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "OSUinLikeInfo{uin=" + this.uin + ",uid=" + this.uid + ",likeItems=" + this.likeItems + ",}";
    }

    public OSUinLikeInfo(long j, String str, ArrayList<OSLikeItem> arrayList) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.likeItems = new ArrayList<>();
        this.uin = j;
        this.uid = str;
        this.likeItems = arrayList;
    }
}
