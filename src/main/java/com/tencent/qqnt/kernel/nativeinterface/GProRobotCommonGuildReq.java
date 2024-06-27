package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProRobotCommonGuildReq.class */
public final class GProRobotCommonGuildReq {
    public int fetchType;
    public int num;
    public long robotAppid;
    public long robotTinyid;
    public long robotUin;
    public ArrayList<Long> robotsAppidList;
    public ArrayList<Long> robotsUinList;
    public int start;

    public GProRobotCommonGuildReq() {
        this.robotsUinList = new ArrayList<>();
        this.robotsAppidList = new ArrayList<>();
    }

    public int getFetchType() {
        return this.fetchType;
    }

    public int getNum() {
        return this.num;
    }

    public long getRobotAppid() {
        return this.robotAppid;
    }

    public long getRobotTinyid() {
        return this.robotTinyid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public ArrayList<Long> getRobotsAppidList() {
        return this.robotsAppidList;
    }

    public ArrayList<Long> getRobotsUinList() {
        return this.robotsUinList;
    }

    public int getStart() {
        return this.start;
    }

    public String toString() {
        return "GProRobotCommonGuildReq{robotUin=" + this.robotUin + ",start=" + this.start + ",num=" + this.num + ",robotTinyid=" + this.robotTinyid + ",fetchType=" + this.fetchType + ",robotAppid=" + this.robotAppid + ",robotsUinList=" + this.robotsUinList + ",robotsAppidList=" + this.robotsAppidList + ",}";
    }

    public GProRobotCommonGuildReq(long j, int i, int i2, long j2, int i3, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        this.robotsUinList = new ArrayList<>();
        this.robotsAppidList = new ArrayList<>();
        this.robotUin = j;
        this.start = i;
        this.num = i2;
        this.robotTinyid = j2;
        this.fetchType = i3;
        this.robotAppid = j3;
        this.robotsUinList = arrayList;
        this.robotsAppidList = arrayList2;
    }
}
