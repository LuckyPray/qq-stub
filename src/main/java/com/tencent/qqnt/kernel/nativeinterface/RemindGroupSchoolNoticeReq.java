package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RemindGroupSchoolNoticeReq.class */
public final class RemindGroupSchoolNoticeReq {
    public boolean filter;
    public long groupCode;
    public String noticeId;
    public ArrayList<Long> receivers;
    public int type;

    public RemindGroupSchoolNoticeReq() {
        this.noticeId = "";
        this.receivers = new ArrayList<>();
    }

    public boolean getFilter() {
        return this.filter;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getNoticeId() {
        return this.noticeId;
    }

    public ArrayList<Long> getReceivers() {
        return this.receivers;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "RemindGroupSchoolNoticeReq{noticeId=" + this.noticeId + ",groupCode=" + this.groupCode + ",receivers=" + this.receivers + ",filter=" + this.filter + ",type=" + this.type + ",}";
    }

    public RemindGroupSchoolNoticeReq(String str, long j, ArrayList<Long> arrayList, boolean z, int i) {
        this.noticeId = "";
        this.receivers = new ArrayList<>();
        this.noticeId = str;
        this.groupCode = j;
        this.receivers = arrayList;
        this.filter = z;
        this.type = i;
    }
}
