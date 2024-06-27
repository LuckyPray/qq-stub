package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DeleteRecentContactInfo.class */
public final class DeleteRecentContactInfo {
    public RecentContactInfo deletedContact;
    public int listType;
    public RecentContactInfo nextContact;

    public DeleteRecentContactInfo() {
        this.deletedContact = new RecentContactInfo();
    }

    public RecentContactInfo getDeletedContact() {
        return this.deletedContact;
    }

    public int getListType() {
        return this.listType;
    }

    public RecentContactInfo getNextContact() {
        return this.nextContact;
    }

    public String toString() {
        return "DeleteRecentContactInfo{listType=" + this.listType + ",deletedContact=" + this.deletedContact + ",nextContact=" + this.nextContact + ",}";
    }

    public DeleteRecentContactInfo(int i, RecentContactInfo recentContactInfo, RecentContactInfo recentContactInfo2) {
        this.deletedContact = new RecentContactInfo();
        this.listType = i;
        this.deletedContact = recentContactInfo;
        this.nextContact = recentContactInfo2;
    }
}
