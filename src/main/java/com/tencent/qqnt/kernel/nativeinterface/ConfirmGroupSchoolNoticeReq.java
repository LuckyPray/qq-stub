package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ConfirmGroupSchoolNoticeReq.class */
public final class ConfirmGroupSchoolNoticeReq {
    public long groupCode;
    public String noticeId;

    public ConfirmGroupSchoolNoticeReq() {
        this.noticeId = "";
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getNoticeId() {
        return this.noticeId;
    }

    public String toString() {
        return "ConfirmGroupSchoolNoticeReq{noticeId=" + this.noticeId + ",groupCode=" + this.groupCode + ",}";
    }

    public ConfirmGroupSchoolNoticeReq(String str, long j) {
        this.noticeId = "";
        this.noticeId = str;
        this.groupCode = j;
    }
}
