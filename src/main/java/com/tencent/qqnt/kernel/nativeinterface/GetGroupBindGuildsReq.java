package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetGroupBindGuildsReq.class */
public final class GetGroupBindGuildsReq {
    public long groupCode;
    public int pageIndex;
    public int pageNum;

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public String toString() {
        return "GetGroupBindGuildsReq{groupCode=" + this.groupCode + ",pageIndex=" + this.pageIndex + ",pageNum=" + this.pageNum + ",}";
    }
}
