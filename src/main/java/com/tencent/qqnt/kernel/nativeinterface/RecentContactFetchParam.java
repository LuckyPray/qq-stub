package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentContactFetchParam.class */
public final class RecentContactFetchParam {
    public AnchorPointContactInfo anchorPointContact;
    public int count;
    public boolean fetchOld;
    public int listType;

    public RecentContactFetchParam() {
        this.anchorPointContact = new AnchorPointContactInfo();
    }

    public AnchorPointContactInfo getAnchorPointContact() {
        return this.anchorPointContact;
    }

    public int getCount() {
        return this.count;
    }

    public boolean getFetchOld() {
        return this.fetchOld;
    }

    public int getListType() {
        return this.listType;
    }

    public String toString() {
        return "RecentContactFetchParam{listType=" + this.listType + ",fetchOld=" + this.fetchOld + ",count=" + this.count + ",anchorPointContact=" + this.anchorPointContact + ",}";
    }

    public RecentContactFetchParam(int i, boolean z, int i2, AnchorPointContactInfo anchorPointContactInfo) {
        this.anchorPointContact = new AnchorPointContactInfo();
        this.listType = i;
        this.fetchOld = z;
        this.count = i2;
        this.anchorPointContact = anchorPointContactInfo;
    }
}
