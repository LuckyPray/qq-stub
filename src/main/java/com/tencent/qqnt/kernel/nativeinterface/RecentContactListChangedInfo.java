package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentContactListChangedInfo.class */
public final class RecentContactListChangedInfo {
    public boolean atTheBottom;
    public boolean atTheTop;
    public long cacheLocation;
    public ArrayList<RecentContactInfo> changedList;
    public long firstContactPos;
    public int listType;
    public int notificationType;
    public ArrayList<Long> sortedContactList;
    public long unreadCnt;
    public long unreadFlag;

    public RecentContactListChangedInfo() {
        this.sortedContactList = new ArrayList<>();
        this.changedList = new ArrayList<>();
    }

    public boolean getAtTheBottom() {
        return this.atTheBottom;
    }

    public boolean getAtTheTop() {
        return this.atTheTop;
    }

    public long getCacheLocation() {
        return this.cacheLocation;
    }

    public ArrayList<RecentContactInfo> getChangedList() {
        return this.changedList;
    }

    public long getFirstContactPos() {
        return this.firstContactPos;
    }

    public int getListType() {
        return this.listType;
    }

    public int getNotificationType() {
        return this.notificationType;
    }

    public ArrayList<Long> getSortedContactList() {
        return this.sortedContactList;
    }

    public long getUnreadCnt() {
        return this.unreadCnt;
    }

    public long getUnreadFlag() {
        return this.unreadFlag;
    }

    public String toString() {
        return "RecentContactListChangedInfo{listType=" + this.listType + ",sortedContactList=" + this.sortedContactList + ",changedList=" + this.changedList + ",notificationType=" + this.notificationType + ",unreadCnt=" + this.unreadCnt + ",unreadFlag=" + this.unreadFlag + ",cacheLocation=" + this.cacheLocation + ",firstContactPos=" + this.firstContactPos + ",atTheTop=" + this.atTheTop + ",atTheBottom=" + this.atTheBottom + ",}";
    }

    public RecentContactListChangedInfo(int i, ArrayList<Long> arrayList, ArrayList<RecentContactInfo> arrayList2, int i2, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.sortedContactList = new ArrayList<>();
        this.changedList = new ArrayList<>();
        this.listType = i;
        this.sortedContactList = arrayList;
        this.changedList = arrayList2;
        this.notificationType = i2;
        this.unreadCnt = j;
        this.unreadFlag = j2;
        this.cacheLocation = j3;
        this.firstContactPos = j4;
        this.atTheTop = z;
        this.atTheBottom = z2;
    }
}
