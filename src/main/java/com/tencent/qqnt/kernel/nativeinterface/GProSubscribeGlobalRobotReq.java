package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProSubscribeGlobalRobotReq.class */
public final class GProSubscribeGlobalRobotReq {
    public long guildId;
    public boolean isSwitchOn;
    public String subscriptionId;

    public GProSubscribeGlobalRobotReq() {
        this.subscriptionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public boolean getIsSwitchOn() {
        return this.isSwitchOn;
    }

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public String toString() {
        return "GProSubscribeGlobalRobotReq{subscriptionId=" + this.subscriptionId + ",guildId=" + this.guildId + ",isSwitchOn=" + this.isSwitchOn + ",}";
    }

    public GProSubscribeGlobalRobotReq(String str, long j, boolean z) {
        this.subscriptionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.subscriptionId = str;
        this.guildId = j;
        this.isSwitchOn = z;
    }
}
