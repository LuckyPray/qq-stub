package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProFetchGuildRobotDirectMsgSettingReq.class */
public final class GProFetchGuildRobotDirectMsgSettingReq {
    public long botTid;
    public long userTid;

    public GProFetchGuildRobotDirectMsgSettingReq() {
    }

    public long getBotTid() {
        return this.botTid;
    }

    public long getUserTid() {
        return this.userTid;
    }

    public String toString() {
        return "GProFetchGuildRobotDirectMsgSettingReq{botTid=" + this.botTid + ",userTid=" + this.userTid + ",}";
    }

    public GProFetchGuildRobotDirectMsgSettingReq(long j, long j2) {
        this.botTid = j;
        this.userTid = j2;
    }
}
