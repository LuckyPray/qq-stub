package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskListReq.class */
public final class GroupSchoolTaskListReq {
    public long groupCode;
    public int pageSize;
    public long pageTime;

    public GroupSchoolTaskListReq() {
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public long getPageTime() {
        return this.pageTime;
    }

    public String toString() {
        return "GroupSchoolTaskListReq{groupCode=" + this.groupCode + ",pageTime=" + this.pageTime + ",pageSize=" + this.pageSize + ",}";
    }

    public GroupSchoolTaskListReq(long j, long j2, int i) {
        this.groupCode = j;
        this.pageTime = j2;
        this.pageSize = i;
    }
}
