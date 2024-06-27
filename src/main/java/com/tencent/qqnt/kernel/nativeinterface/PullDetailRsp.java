package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PullDetailRsp.class */
public final class PullDetailRsp {
    public ArrayList<RecvdOrder> recvdOrderList;
    public SendOrder sendOrder;

    public PullDetailRsp() {
        this.sendOrder = new SendOrder();
        this.recvdOrderList = new ArrayList<>();
    }

    public ArrayList<RecvdOrder> getRecvdOrderList() {
        return this.recvdOrderList;
    }

    public SendOrder getSendOrder() {
        return this.sendOrder;
    }

    public String toString() {
        return "PullDetailRsp{sendOrder=" + this.sendOrder + ",recvdOrderList=" + this.recvdOrderList + ",}";
    }

    public PullDetailRsp(SendOrder sendOrder, ArrayList<RecvdOrder> arrayList) {
        this.sendOrder = new SendOrder();
        this.recvdOrderList = new ArrayList<>();
        this.sendOrder = sendOrder;
        this.recvdOrderList = arrayList;
    }
}
