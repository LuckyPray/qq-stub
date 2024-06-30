package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolNoticeStatisticsReq.class */
public final class GroupSchoolNoticeStatisticsReq {
    public long groupCode;
    public String noticeId;
    public int page;
    public int pageSize;
    public int type;

    public GroupSchoolNoticeStatisticsReq() {
        this.noticeId = "";
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getNoticeId() {
        return this.noticeId;
    }

    public int getPage() {
        return this.page;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "GroupSchoolNoticeStatisticsReq{noticeId=" + this.noticeId + ",groupCode=" + this.groupCode + ",type=" + this.type + ",page=" + this.page + ",pageSize=" + this.pageSize + ",}";
    }

    public GroupSchoolNoticeStatisticsReq(String str, long j, int i, int i2, int i3) {
        this.noticeId = "";
        this.noticeId = str;
        this.groupCode = j;
        this.type = i;
        this.page = i2;
        this.pageSize = i3;
    }
}
