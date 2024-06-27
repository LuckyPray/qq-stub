package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotStoreDiscoveryRsp.class */
public final class GroupRobotStoreDiscoveryRsp {
    public int maxRobotNum;
    public ArrayList<RobotBase> addedRobots = new ArrayList<>();
    public ArrayList<GroupRobot> recommendRobots = new ArrayList<>();
    public ArrayList<CategoryRobot> categoryRobots = new ArrayList<>();

    public ArrayList<RobotBase> getAddedRobots() {
        return this.addedRobots;
    }

    public ArrayList<CategoryRobot> getCategoryRobots() {
        return this.categoryRobots;
    }

    public int getMaxRobotNum() {
        return this.maxRobotNum;
    }

    public ArrayList<GroupRobot> getRecommendRobots() {
        return this.recommendRobots;
    }

    public String toString() {
        return "GroupRobotStoreDiscoveryRsp{addedRobots=" + this.addedRobots + ",recommendRobots=" + this.recommendRobots + ",categoryRobots=" + this.categoryRobots + ",maxRobotNum=" + this.maxRobotNum + ",}";
    }
}
