package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProQueryGlobalRobotSubscriptionRsp.class */
public final class GProQueryGlobalRobotSubscriptionRsp {
    public ArrayList<GProGlobalRobotSubscription> subscriptions;

    public GProQueryGlobalRobotSubscriptionRsp() {
        this.subscriptions = new ArrayList<>();
    }

    public ArrayList<GProGlobalRobotSubscription> getSubscriptions() {
        return this.subscriptions;
    }

    public String toString() {
        return "GProQueryGlobalRobotSubscriptionRsp{subscriptions=" + this.subscriptions + ",}";
    }

    public GProQueryGlobalRobotSubscriptionRsp(ArrayList<GProGlobalRobotSubscription> arrayList) {
        this.subscriptions = new ArrayList<>();
        this.subscriptions = arrayList;
    }
}
