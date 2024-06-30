package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BuddyCategory.class */
public final class BuddyCategory implements IKernelModel {
    public ArrayList<UserSimpleInfo> buddyList;
    public int categoryId;
    public int categorySortId;
    public int categroyMbCount;
    public String categroyName;

    public BuddyCategory() {
        this.categroyName = "";
        this.buddyList = new ArrayList<>();
    }

    public ArrayList<UserSimpleInfo> getBuddyList() {
        return this.buddyList;
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

    public void setBuddyList(ArrayList<UserSimpleInfo> arrayList) {
        this.buddyList = arrayList;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setCategorySortId(int i) {
        this.categorySortId = i;
    }

    public void setCategroyMbCount(int i) {
        this.categroyMbCount = i;
    }

    public void setCategroyName(String str) {
        this.categroyName = str;
    }

    public String toString() {
        return "BuddyCategory{categoryId=" + this.categoryId + ",categorySortId=" + this.categorySortId + ",categroyName=" + this.categroyName + ",categroyMbCount=" + this.categroyMbCount + ",buddyList=" + this.buddyList + ",}";
    }

    public BuddyCategory(int i, int i2, String str, int i3, ArrayList<UserSimpleInfo> arrayList) {
        this.categroyName = "";
        this.buddyList = new ArrayList<>();
        this.categoryId = i;
        this.categorySortId = i2;
        this.categroyName = str;
        this.categroyMbCount = i3;
        this.buddyList = arrayList;
    }
}
