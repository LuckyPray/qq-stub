package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSAggregationCellModel.class */
public final class OSAggregationCellModel {
    public String nick;
    public long setTime;
    public String uid;
    public long uin;

    public OSAggregationCellModel() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getNick() {
        return this.nick;
    }

    public long getSetTime() {
        return this.setTime;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "OSAggregationCellModel{uin=" + this.uin + ",uid=" + this.uid + ",nick=" + this.nick + ",setTime=" + this.setTime + ",}";
    }

    public OSAggregationCellModel(long j, String str, String str2, long j2) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uin = j;
        this.uid = str;
        this.nick = str2;
        this.setTime = j2;
    }
}
