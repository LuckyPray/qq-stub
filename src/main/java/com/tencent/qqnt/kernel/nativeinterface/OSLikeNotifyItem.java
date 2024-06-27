package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSLikeNotifyItem.class */
public final class OSLikeNotifyItem {
    public int businessType;
    public ArrayList<OSLikeItem> likeItems;
    public int scene;
    public long time;
    public String uid;
    public long uin;

    public OSLikeNotifyItem() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.likeItems = new ArrayList<>();
    }

    public int getBusinessType() {
        return this.businessType;
    }

    public ArrayList<OSLikeItem> getLikeItems() {
        return this.likeItems;
    }

    public int getScene() {
        return this.scene;
    }

    public long getTime() {
        return this.time;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "OSLikeNotifyItem{businessType=" + this.businessType + ",uin=" + this.uin + ",uid=" + this.uid + ",time=" + this.time + ",likeItems=" + this.likeItems + ",scene=" + this.scene + ",}";
    }

    public OSLikeNotifyItem(int i, long j, String str, long j2, ArrayList<OSLikeItem> arrayList, int i2) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.likeItems = new ArrayList<>();
        this.businessType = i;
        this.uin = j;
        this.uid = str;
        this.time = j2;
        this.likeItems = arrayList;
        this.scene = i2;
    }
}
