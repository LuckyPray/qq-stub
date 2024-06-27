package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecvdOrder.class */
public final class RecvdOrder {
    public long amount;
    public int createTime;
    public String recvName;
    public long recvUin;
    public String uid;

    public RecvdOrder() {
        this.recvName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getAmount() {
        return this.amount;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public String getRecvName() {
        return this.recvName;
    }

    public long getRecvUin() {
        return this.recvUin;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "RecvdOrder{recvUin=" + this.recvUin + ",recvName=" + this.recvName + ",amount=" + this.amount + ",createTime=" + this.createTime + ",uid=" + this.uid + ",}";
    }

    public RecvdOrder(long j, String str, long j2, int i, String str2) {
        this.recvName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recvUin = j;
        this.recvName = str;
        this.amount = j2;
        this.createTime = i;
        this.uid = str2;
    }
}
