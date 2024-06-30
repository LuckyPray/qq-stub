package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetGroupSchoolNoticeDetailReq.class */
public final class GetGroupSchoolNoticeDetailReq {
    public long groupCode;
    public boolean needRefresh;
    public String noticeId;

    public GetGroupSchoolNoticeDetailReq() {
        this.noticeId = "";
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public boolean getNeedRefresh() {
        return this.needRefresh;
    }

    public String getNoticeId() {
        return this.noticeId;
    }

    public String toString() {
        return "GetGroupSchoolNoticeDetailReq{noticeId=" + this.noticeId + ",groupCode=" + this.groupCode + ",needRefresh=" + this.needRefresh + ",}";
    }

    public GetGroupSchoolNoticeDetailReq(String str, long j, boolean z) {
        this.noticeId = "";
        this.noticeId = str;
        this.groupCode = j;
        this.needRefresh = z;
    }
}
