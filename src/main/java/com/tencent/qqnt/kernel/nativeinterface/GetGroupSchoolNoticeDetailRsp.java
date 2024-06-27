package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetGroupSchoolNoticeDetailRsp.class */
public final class GetGroupSchoolNoticeDetailRsp {
    public long authorUin;
    public long confirmTime;
    public long confirmUin;
    public GroupSchoolNoticeContent content = new GroupSchoolNoticeContent();
    public long publishTime;
    public int state;

    public long getAuthorUin() {
        return this.authorUin;
    }

    public long getConfirmTime() {
        return this.confirmTime;
    }

    public long getConfirmUin() {
        return this.confirmUin;
    }

    public GroupSchoolNoticeContent getContent() {
        return this.content;
    }

    public long getPublishTime() {
        return this.publishTime;
    }

    public int getState() {
        return this.state;
    }

    public String toString() {
        return "GetGroupSchoolNoticeDetailRsp{authorUin=" + this.authorUin + ",content=" + this.content + ",state=" + this.state + ",publishTime=" + this.publishTime + ",confirmUin=" + this.confirmUin + ",confirmTime=" + this.confirmTime + ",}";
    }
}
