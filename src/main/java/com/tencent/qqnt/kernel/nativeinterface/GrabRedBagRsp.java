package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GrabRedBagRsp.class */
public final class GrabRedBagRsp {
    public RecvdOrder recvdOrder;
    public int result;

    public GrabRedBagRsp() {
        this.recvdOrder = new RecvdOrder();
    }

    public RecvdOrder getRecvdOrder() {
        return this.recvdOrder;
    }

    public int getResult() {
        return this.result;
    }

    public String toString() {
        return "GrabRedBagRsp{result=" + this.result + ",recvdOrder=" + this.recvdOrder + ",}";
    }

    public GrabRedBagRsp(int i, RecvdOrder recvdOrder) {
        this.recvdOrder = new RecvdOrder();
        this.result = i;
        this.recvdOrder = recvdOrder;
    }
}
