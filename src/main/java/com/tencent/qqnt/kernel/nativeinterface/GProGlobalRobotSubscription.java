package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGlobalRobotSubscription.class */
public final class GProGlobalRobotSubscription {
    public long guildId;
    public long subscribeTime;
    public String subscriptionId;

    public GProGlobalRobotSubscription() {
        this.subscriptionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public long getSubscribeTime() {
        return this.subscribeTime;
    }

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public String toString() {
        return "GProGlobalRobotSubscription{subscriptionId=" + this.subscriptionId + ",guildId=" + this.guildId + ",subscribeTime=" + this.subscribeTime + ",}";
    }

    public GProGlobalRobotSubscription(String str, long j, long j2) {
        this.subscriptionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.subscriptionId = str;
        this.guildId = j;
        this.subscribeTime = j2;
    }
}
