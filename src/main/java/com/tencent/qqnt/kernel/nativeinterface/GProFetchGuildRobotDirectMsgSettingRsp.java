package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProFetchGuildRobotDirectMsgSettingRsp.class */
public final class GProFetchGuildRobotDirectMsgSettingRsp {
    public long dailyPushMaxNum;

    public GProFetchGuildRobotDirectMsgSettingRsp() {
    }

    public long getDailyPushMaxNum() {
        return this.dailyPushMaxNum;
    }

    public String toString() {
        return "GProFetchGuildRobotDirectMsgSettingRsp{dailyPushMaxNum=" + this.dailyPushMaxNum + ",}";
    }

    public GProFetchGuildRobotDirectMsgSettingRsp(long j) {
        this.dailyPushMaxNum = j;
    }
}
