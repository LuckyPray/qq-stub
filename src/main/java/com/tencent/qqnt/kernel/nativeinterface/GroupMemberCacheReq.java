package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberCacheReq.class */
public final class GroupMemberCacheReq {
    public long groupCode;
    public String uid = "";
    public GroupMemberCache memberCache = new GroupMemberCache();
    public GroupMemberCacheFilter memberCacheFilter = new GroupMemberCacheFilter();

    public long getGroupCode() {
        return this.groupCode;
    }

    public GroupMemberCache getMemberCache() {
        return this.memberCache;
    }

    public GroupMemberCacheFilter getMemberCacheFilter() {
        return this.memberCacheFilter;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "GroupMemberCacheReq{groupCode=" + this.groupCode + ",uid=" + this.uid + ",memberCache=" + this.memberCache + ",memberCacheFilter=" + this.memberCacheFilter + ",}";
    }
}
