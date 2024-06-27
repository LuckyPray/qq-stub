package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotSetPermissionReq.class */
public final class GProGuildRobotSetPermissionReq {
    public ArrayList<GProGuildRobotAuthSetInfo> authSetInfos;
    public long guildId;
    public long robotUin;
    public int role;
    public int setType;

    public GProGuildRobotSetPermissionReq() {
        this.authSetInfos = new ArrayList<>();
    }

    public ArrayList<GProGuildRobotAuthSetInfo> getAuthSetInfos() {
        return this.authSetInfos;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public int getRole() {
        return this.role;
    }

    public int getSetType() {
        return this.setType;
    }

    public String toString() {
        return "GProGuildRobotSetPermissionReq{guildId=" + this.guildId + ",robotUin=" + this.robotUin + ",role=" + this.role + ",authSetInfos=" + this.authSetInfos + ",setType=" + this.setType + ",}";
    }

    public GProGuildRobotSetPermissionReq(long j, long j2, int i, ArrayList<GProGuildRobotAuthSetInfo> arrayList, int i2) {
        this.authSetInfos = new ArrayList<>();
        this.guildId = j;
        this.robotUin = j2;
        this.role = i;
        this.authSetInfos = arrayList;
        this.setType = i2;
    }
}
