package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotPermissionRsp.class */
public final class GProGuildRobotPermissionRsp {
    public ArrayList<GProGuildRobotAuthGetInfo> authGetInfos;
    public ArrayList<GProGuildRobotAuthClassInfo> classInfos;
    public int operatorRole;
    public int robotStatus;
    public int role;

    public GProGuildRobotPermissionRsp() {
        this.authGetInfos = new ArrayList<>();
        this.classInfos = new ArrayList<>();
    }

    public ArrayList<GProGuildRobotAuthGetInfo> getAuthGetInfos() {
        return this.authGetInfos;
    }

    public ArrayList<GProGuildRobotAuthClassInfo> getClassInfos() {
        return this.classInfos;
    }

    public int getOperatorRole() {
        return this.operatorRole;
    }

    public int getRobotStatus() {
        return this.robotStatus;
    }

    public int getRole() {
        return this.role;
    }

    public String toString() {
        return "GProGuildRobotPermissionRsp{role=" + this.role + ",authGetInfos=" + this.authGetInfos + ",operatorRole=" + this.operatorRole + ",classInfos=" + this.classInfos + ",robotStatus=" + this.robotStatus + ",}";
    }

    public GProGuildRobotPermissionRsp(int i, ArrayList<GProGuildRobotAuthGetInfo> arrayList, int i2, ArrayList<GProGuildRobotAuthClassInfo> arrayList2, int i3) {
        this.authGetInfos = new ArrayList<>();
        this.classInfos = new ArrayList<>();
        this.role = i;
        this.authGetInfos = arrayList;
        this.operatorRole = i2;
        this.classInfos = arrayList2;
        this.robotStatus = i3;
    }
}
