package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberHonorListResult.class */
public final class GroupMemberHonorListResult {
    public int cacheTs;
    public int joinTime;
    public ArrayList<HonorList> honorList = new ArrayList<>();
    public ArrayList<HonorInfo> honorInfos = new ArrayList<>();

    public int getCacheTs() {
        return this.cacheTs;
    }

    public ArrayList<HonorInfo> getHonorInfos() {
        return this.honorInfos;
    }

    public ArrayList<HonorList> getHonorList() {
        return this.honorList;
    }

    public int getJoinTime() {
        return this.joinTime;
    }

    public String toString() {
        return "GroupMemberHonorListResult{honorList=" + this.honorList + ",cacheTs=" + this.cacheTs + ",honorInfos=" + this.honorInfos + ",joinTime=" + this.joinTime + ",}";
    }
}
