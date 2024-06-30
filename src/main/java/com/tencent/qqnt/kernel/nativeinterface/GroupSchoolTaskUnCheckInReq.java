package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskUnCheckInReq.class */
public final class GroupSchoolTaskUnCheckInReq {
    public long date;
    public long groupCode;
    public int pageIndex;
    public int pageSize;
    public String taskId;

    public GroupSchoolTaskUnCheckInReq() {
        this.taskId = "";
    }

    public long getDate() {
        return this.date;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String toString() {
        return "GroupSchoolTaskUnCheckInReq{groupCode=" + this.groupCode + ",taskId=" + this.taskId + ",date=" + this.date + ",pageIndex=" + this.pageIndex + ",pageSize=" + this.pageSize + ",}";
    }

    public GroupSchoolTaskUnCheckInReq(long j, String str, long j2, int i, int i2) {
        this.taskId = "";
        this.groupCode = j;
        this.taskId = str;
        this.date = j2;
        this.pageIndex = i;
        this.pageSize = i2;
    }
}
