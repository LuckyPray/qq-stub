package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SendCommonRobotReq.class */
public final class SendCommonRobotReq {
    public long channelId;
    public long guildId;
    public long robotAppId;
    public int shareScene;
    public RobotShareTarget shareTarget = RobotShareTarget.values()[0];

    public long getChannelId() {
        return this.channelId;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public long getRobotAppId() {
        return this.robotAppId;
    }

    public int getShareScene() {
        return this.shareScene;
    }

    public RobotShareTarget getShareTarget() {
        return this.shareTarget;
    }

    public String toString() {
        return "SendCommonRobotReq{robotAppId=" + this.robotAppId + ",shareScene=" + this.shareScene + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",shareTarget=" + this.shareTarget + ",}";
    }
}
