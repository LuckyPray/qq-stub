package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchContactItem.class */
public final class SearchContactItem {
    public SearchBuddyItem buddyItem;
    public SearchGroupMemberItem groupMemberItem;
    public int type;

    public SearchBuddyItem getBuddyItem() {
        return this.buddyItem;
    }

    public SearchGroupMemberItem getGroupMemberItem() {
        return this.groupMemberItem;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "SearchContactItem{type=" + this.type + ",buddyItem=" + this.buddyItem + ",groupMemberItem=" + this.groupMemberItem + ",}";
    }
}
