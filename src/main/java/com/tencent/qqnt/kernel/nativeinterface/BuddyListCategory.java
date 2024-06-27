package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BuddyListCategory.class */
public final class BuddyListCategory {
    public ArrayList<String> buddyUids;
    public int categoryId;
    public int categorySortId;
    public int categroyMbCount;
    public String categroyName;
    public int onlineCount;

    public BuddyListCategory() {
        this.categroyName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.buddyUids = new ArrayList<>();
    }

    public ArrayList<String> getBuddyUids() {
        return this.buddyUids;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public int getCategorySortId() {
        return this.categorySortId;
    }

    public int getCategroyMbCount() {
        return this.categroyMbCount;
    }

    public String getCategroyName() {
        return this.categroyName;
    }

    public int getOnlineCount() {
        return this.onlineCount;
    }

    public String toString() {
        return "BuddyListCategory{categoryId=" + this.categoryId + ",categorySortId=" + this.categorySortId + ",categroyName=" + this.categroyName + ",categroyMbCount=" + this.categroyMbCount + ",onlineCount=" + this.onlineCount + ",buddyUids=" + this.buddyUids + ",}";
    }

    public BuddyListCategory(int i, int i2, String str, int i3, int i4, ArrayList<String> arrayList) {
        this.categroyName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.buddyUids = new ArrayList<>();
        this.categoryId = i;
        this.categorySortId = i2;
        this.categroyName = str;
        this.categroyMbCount = i3;
        this.onlineCount = i4;
        this.buddyUids = arrayList;
    }
}
