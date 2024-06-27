package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PublishGroupSchoolNoticeRsp.class */
public final class PublishGroupSchoolNoticeRsp {
    public int confirmedCount;
    public ArrayList<GroupSchoolNoticeIndex> notices = new ArrayList<>();
    public int total;

    public int getConfirmedCount() {
        return this.confirmedCount;
    }

    public ArrayList<GroupSchoolNoticeIndex> getNotices() {
        return this.notices;
    }

    public int getTotal() {
        return this.total;
    }

    public String toString() {
        return "PublishGroupSchoolNoticeRsp{notices=" + this.notices + ",total=" + this.total + ",confirmedCount=" + this.confirmedCount + ",}";
    }
}
