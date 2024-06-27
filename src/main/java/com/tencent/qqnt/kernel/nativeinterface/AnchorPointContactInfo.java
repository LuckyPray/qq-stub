package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AnchorPointContactInfo.class */
public final class AnchorPointContactInfo {
    public long contactId;
    public int pos;
    public long sortField;

    public AnchorPointContactInfo() {
    }

    public long getContactId() {
        return this.contactId;
    }

    public int getPos() {
        return this.pos;
    }

    public long getSortField() {
        return this.sortField;
    }

    public String toString() {
        return "AnchorPointContactInfo{contactId=" + this.contactId + ",sortField=" + this.sortField + ",pos=" + this.pos + ",}";
    }

    public AnchorPointContactInfo(long j, long j2, int i) {
        this.contactId = j;
        this.sortField = j2;
        this.pos = i;
    }
}
