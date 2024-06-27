package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchRspGroupInfo.class */
public final class SearchRspGroupInfo {
    public long groupCode;
    public int privilege;
    public GroupAllInfo searchGroupInfo;

    public SearchRspGroupInfo() {
        this.searchGroupInfo = new GroupAllInfo();
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getPrivilege() {
        return this.privilege;
    }

    public GroupAllInfo getSearchGroupInfo() {
        return this.searchGroupInfo;
    }

    public String toString() {
        return "SearchRspGroupInfo{groupCode=" + this.groupCode + ",searchGroupInfo=" + this.searchGroupInfo + ",privilege=" + this.privilege + ",}";
    }

    public SearchRspGroupInfo(long j, GroupAllInfo groupAllInfo, int i) {
        this.searchGroupInfo = new GroupAllInfo();
        this.groupCode = j;
        this.searchGroupInfo = groupAllInfo;
        this.privilege = i;
    }
}
