package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupStatisticDetailInfo.class */
public final class GroupStatisticDetailInfo {
    public int count;
    public String desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getCount() {
        return this.count;
    }

    public String getDesc() {
        return this.desc;
    }

    public String toString() {
        return "GroupStatisticDetailInfo{desc=" + this.desc + ",count=" + this.count + ",}";
    }
}
