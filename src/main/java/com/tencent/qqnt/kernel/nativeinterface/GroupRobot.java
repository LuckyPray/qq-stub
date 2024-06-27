package com.tencent.qqnt.kernel.nativeinterface;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobot.class */
public final class GroupRobot implements Serializable {
    public RobotBase baseInfo;
    public boolean isAdded;
    public ArrayList<String> labels;
    long serialVersionUID;

    public GroupRobot() {
        this.serialVersionUID = 1L;
        this.baseInfo = new RobotBase();
        this.labels = new ArrayList<>();
    }

    public RobotBase getBaseInfo() {
        return this.baseInfo;
    }

    public boolean getIsAdded() {
        return this.isAdded;
    }

    public ArrayList<String> getLabels() {
        return this.labels;
    }

    public void setBaseInfo(RobotBase robotBase) {
        this.baseInfo = robotBase;
    }

    public void setIsAdded(boolean z) {
        this.isAdded = z;
    }

    public void setLabels(ArrayList<String> arrayList) {
        this.labels = arrayList;
    }

    public String toString() {
        return "GroupRobot{baseInfo=" + this.baseInfo + ",isAdded=" + this.isAdded + ",labels=" + this.labels + ",}";
    }

    public GroupRobot(RobotBase robotBase, boolean z, ArrayList<String> arrayList) {
        this.serialVersionUID = 1L;
        this.baseInfo = new RobotBase();
        this.labels = new ArrayList<>();
        this.baseInfo = robotBase;
        this.isAdded = z;
        this.labels = arrayList;
    }
}
