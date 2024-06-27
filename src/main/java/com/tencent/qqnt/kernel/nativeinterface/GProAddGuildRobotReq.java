package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProAddGuildRobotReq.class */
public final class GProAddGuildRobotReq {
    public ArrayList<GProGuildRobotAuthSetInfo> authSetInfos;
    public long guildId;
    public long robotUin;
    public int role;

    public GProAddGuildRobotReq() {
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

    public String toString() {
        return "GProAddGuildRobotReq{guildId=" + this.guildId + ",robotUin=" + this.robotUin + ",role=" + this.role + ",authSetInfos=" + this.authSetInfos + ",}";
    }

    public GProAddGuildRobotReq(long j, long j2, int i, ArrayList<GProGuildRobotAuthSetInfo> arrayList) {
        this.authSetInfos = new ArrayList<>();
        this.guildId = j;
        this.robotUin = j2;
        this.role = i;
        this.authSetInfos = arrayList;
    }
}
