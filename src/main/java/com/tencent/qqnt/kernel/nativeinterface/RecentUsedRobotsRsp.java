package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentUsedRobotsRsp.class */
public final class RecentUsedRobotsRsp {
    public boolean isEnd;
    public int nextOffset;
    public ArrayList<GroupRobot> robots = new ArrayList<>();
    public int total;

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public int getNextOffset() {
        return this.nextOffset;
    }

    public ArrayList<GroupRobot> getRobots() {
        return this.robots;
    }

    public int getTotal() {
        return this.total;
    }

    public String toString() {
        return "RecentUsedRobotsRsp{robots=" + this.robots + ",nextOffset=" + this.nextOffset + ",isEnd=" + this.isEnd + ",total=" + this.total + ",}";
    }
}
