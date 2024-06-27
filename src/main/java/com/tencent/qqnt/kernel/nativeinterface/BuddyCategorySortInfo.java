package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BuddyCategorySortInfo.class */
public final class BuddyCategorySortInfo {
    public int categoryId;
    public String categroyName;

    public BuddyCategorySortInfo() {
        this.categroyName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategroyName() {
        return this.categroyName;
    }

    public String toString() {
        return "BuddyCategorySortInfo{categoryId=" + this.categoryId + ",categroyName=" + this.categroyName + ",}";
    }

    public BuddyCategorySortInfo(int i, String str) {
        this.categroyName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.categoryId = i;
        this.categroyName = str;
    }
}
