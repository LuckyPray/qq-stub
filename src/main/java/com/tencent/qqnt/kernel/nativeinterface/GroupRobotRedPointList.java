package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotRedPointList.class */
public final class GroupRobotRedPointList {
    public long cacheTime;
    public ArrayList<GroupRobotRedPoint> redpointList;
    public int role;

    public GroupRobotRedPointList() {
        this.redpointList = new ArrayList<>();
    }

    public long getCacheTime() {
        return this.cacheTime;
    }

    public ArrayList<GroupRobotRedPoint> getRedpointList() {
        return this.redpointList;
    }

    public int getRole() {
        return this.role;
    }

    public String toString() {
        return "GroupRobotRedPointList{redpointList=" + this.redpointList + ",cacheTime=" + this.cacheTime + ",role=" + this.role + ",}";
    }

    public GroupRobotRedPointList(ArrayList<GroupRobotRedPoint> arrayList, long j, int i) {
        this.redpointList = new ArrayList<>();
        this.redpointList = arrayList;
        this.cacheTime = j;
        this.role = i;
    }
}
