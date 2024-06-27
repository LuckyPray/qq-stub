package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupBulletin.class */
public final class GroupBulletin {
    public ArrayList<BulletinFeedsRecord> feedsRecords = new ArrayList<>();
    public long groupCode;
    public int lastModifyTime;
    public int unreadNum;

    public ArrayList<BulletinFeedsRecord> getFeedsRecords() {
        return this.feedsRecords;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getLastModifyTime() {
        return this.lastModifyTime;
    }

    public int getUnreadNum() {
        return this.unreadNum;
    }

    public String toString() {
        return "GroupBulletin{groupCode=" + this.groupCode + ",feedsRecords=" + this.feedsRecords + ",lastModifyTime=" + this.lastModifyTime + ",unreadNum=" + this.unreadNum + ",}";
    }
}
