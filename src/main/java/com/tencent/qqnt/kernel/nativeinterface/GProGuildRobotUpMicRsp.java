package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotUpMicRsp.class */
public final class GProGuildRobotUpMicRsp {
    public long robotTrtcId;

    public GProGuildRobotUpMicRsp() {
    }

    public long getRobotTrtcId() {
        return this.robotTrtcId;
    }

    public String toString() {
        return "GProGuildRobotUpMicRsp{robotTrtcId=" + this.robotTrtcId + ",}";
    }

    public GProGuildRobotUpMicRsp(long j) {
        this.robotTrtcId = j;
    }
}
