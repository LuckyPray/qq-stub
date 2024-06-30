package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProQueryGlobalRobotSubscriptionReq.class */
public final class GProQueryGlobalRobotSubscriptionReq {
    public long guildId;
    public String subscriptionId;

    public GProQueryGlobalRobotSubscriptionReq() {
        this.subscriptionId = "";
    }

    public long getGuildId() {
        return this.guildId;
    }

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public String toString() {
        return "GProQueryGlobalRobotSubscriptionReq{subscriptionId=" + this.subscriptionId + ",guildId=" + this.guildId + ",}";
    }

    public GProQueryGlobalRobotSubscriptionReq(String str, long j) {
        this.subscriptionId = "";
        this.subscriptionId = str;
        this.guildId = j;
    }
}
