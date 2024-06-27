package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProAudioLiveRobotStatusRsp.class */
public final class GProAudioLiveRobotStatusRsp {
    public long pollInterval;
    public ArrayList<GProAudioLiveRobotStatusRspInfo> rspInfos;

    public GProAudioLiveRobotStatusRsp() {
        this.rspInfos = new ArrayList<>();
    }

    public long getPollInterval() {
        return this.pollInterval;
    }

    public ArrayList<GProAudioLiveRobotStatusRspInfo> getRspInfos() {
        return this.rspInfos;
    }

    public String toString() {
        return "GProAudioLiveRobotStatusRsp{rspInfos=" + this.rspInfos + ",pollInterval=" + this.pollInterval + ",}";
    }

    public GProAudioLiveRobotStatusRsp(ArrayList<GProAudioLiveRobotStatusRspInfo> arrayList, long j) {
        this.rspInfos = new ArrayList<>();
        this.rspInfos = arrayList;
        this.pollInterval = j;
    }
}
