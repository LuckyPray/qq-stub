package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotStoreCategoryListRsp.class */
public final class GroupRobotStoreCategoryListRsp {
    public boolean isEnd;
    public ArrayList<GroupRobot> robots = new ArrayList<>();
    public byte[] sessionInfo = new byte[0];

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public ArrayList<GroupRobot> getRobots() {
        return this.robots;
    }

    public byte[] getSessionInfo() {
        return this.sessionInfo;
    }

    public String toString() {
        return "GroupRobotStoreCategoryListRsp{robots=" + this.robots + ",sessionInfo=" + this.sessionInfo + ",isEnd=" + this.isEnd + ",}";
    }
}
