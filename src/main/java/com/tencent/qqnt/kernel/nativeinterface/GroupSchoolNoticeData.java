package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolNoticeData.class */
public final class GroupSchoolNoticeData {
    public long authorUin;
    public int confirmedCount;
    public GroupSchoolNoticeContent content;
    public boolean isConfirm;
    public String noticeId;
    public long publishTime;
    public int state;
    public int total;

    public GroupSchoolNoticeData() {
        this.noticeId = "";
        this.content = new GroupSchoolNoticeContent();
    }

    public long getAuthorUin() {
        return this.authorUin;
    }

    public int getConfirmedCount() {
        return this.confirmedCount;
    }

    public GroupSchoolNoticeContent getContent() {
        return this.content;
    }

    public boolean getIsConfirm() {
        return this.isConfirm;
    }

    public String getNoticeId() {
        return this.noticeId;
    }

    public long getPublishTime() {
        return this.publishTime;
    }

    public int getState() {
        return this.state;
    }

    public int getTotal() {
        return this.total;
    }

    public String toString() {
        return "GroupSchoolNoticeData{noticeId=" + this.noticeId + ",authorUin=" + this.authorUin + ",content=" + this.content + ",state=" + this.state + ",publishTime=" + this.publishTime + ",isConfirm=" + this.isConfirm + ",total=" + this.total + ",confirmedCount=" + this.confirmedCount + ",}";
    }

    public GroupSchoolNoticeData(String str, long j, GroupSchoolNoticeContent groupSchoolNoticeContent, int i, long j2, boolean z, int i2, int i3) {
        this.noticeId = "";
        this.content = new GroupSchoolNoticeContent();
        this.noticeId = str;
        this.authorUin = j;
        this.content = groupSchoolNoticeContent;
        this.state = i;
        this.publishTime = j2;
        this.isConfirm = z;
        this.total = i2;
        this.confirmedCount = i3;
    }
}
