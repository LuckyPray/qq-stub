package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetGroupSchoolNoticeListReq.class */
public final class GetGroupSchoolNoticeListReq {
    public long groupCode;
    public int pageSize;
    public long publishTime;
    public int type;

    public GetGroupSchoolNoticeListReq() {
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public long getPublishTime() {
        return this.publishTime;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "GetGroupSchoolNoticeListReq{type=" + this.type + ",groupCode=" + this.groupCode + ",publishTime=" + this.publishTime + ",pageSize=" + this.pageSize + ",}";
    }

    public GetGroupSchoolNoticeListReq(int i, long j, long j2, int i2) {
        this.type = i;
        this.groupCode = j;
        this.publishTime = j2;
        this.pageSize = i2;
    }
}
