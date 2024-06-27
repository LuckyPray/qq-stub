package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupStatisticInfo.class */
public final class GroupStatisticInfo {
    public ArrayList<GroupStatisticDetailInfo> detailInfo = new ArrayList<>();
    public long maxCount;

    public ArrayList<GroupStatisticDetailInfo> getDetailInfo() {
        return this.detailInfo;
    }

    public long getMaxCount() {
        return this.maxCount;
    }

    public String toString() {
        return "GroupStatisticInfo{maxCount=" + this.maxCount + ",detailInfo=" + this.detailInfo + ",}";
    }
}
