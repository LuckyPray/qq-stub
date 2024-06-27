package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProSetGuildRobotDirectMsgSettingReq.class */
public final class GProSetGuildRobotDirectMsgSettingReq {
    public long botTid;
    public long maxPushNum;
    public long userTid;

    public GProSetGuildRobotDirectMsgSettingReq() {
    }

    public long getBotTid() {
        return this.botTid;
    }

    public long getMaxPushNum() {
        return this.maxPushNum;
    }

    public long getUserTid() {
        return this.userTid;
    }

    public String toString() {
        return "GProSetGuildRobotDirectMsgSettingReq{botTid=" + this.botTid + ",userTid=" + this.userTid + ",maxPushNum=" + this.maxPushNum + ",}";
    }

    public GProSetGuildRobotDirectMsgSettingReq(long j, long j2, long j3) {
        this.botTid = j;
        this.userTid = j2;
        this.maxPushNum = j3;
    }
}
