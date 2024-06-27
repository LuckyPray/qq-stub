package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotInfo.class */
public final class GProGuildRobotInfo {
    public String robotAvatar;
    public boolean robotBan;
    public String robotDesc;
    public ArrayList<GProGuildRobotFeature> robotFeatures;
    public String robotName;
    public int robotOffline;
    public int robotTestStatus;
    public long robotTid;
    public long robotUin;
    public ArrayList<String> tags;

    public GProGuildRobotInfo() {
        this.robotName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.robotAvatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.robotDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.robotFeatures = new ArrayList<>();
        this.tags = new ArrayList<>();
    }

    public String getRobotAvatar() {
        return this.robotAvatar;
    }

    public boolean getRobotBan() {
        return this.robotBan;
    }

    public String getRobotDesc() {
        return this.robotDesc;
    }

    public ArrayList<GProGuildRobotFeature> getRobotFeatures() {
        return this.robotFeatures;
    }

    public String getRobotName() {
        return this.robotName;
    }

    public int getRobotOffline() {
        return this.robotOffline;
    }

    public int getRobotTestStatus() {
        return this.robotTestStatus;
    }

    public long getRobotTid() {
        return this.robotTid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public ArrayList<String> getTags() {
        return this.tags;
    }

    public String toString() {
        return "GProGuildRobotInfo{robotUin=" + this.robotUin + ",robotName=" + this.robotName + ",robotAvatar=" + this.robotAvatar + ",robotDesc=" + this.robotDesc + ",robotOffline=" + this.robotOffline + ",robotFeatures=" + this.robotFeatures + ",robotTestStatus=" + this.robotTestStatus + ",robotTid=" + this.robotTid + ",robotBan=" + this.robotBan + ",tags=" + this.tags + ",}";
    }

    public GProGuildRobotInfo(long j, String str, String str2, String str3, int i, ArrayList<GProGuildRobotFeature> arrayList, int i2, long j2, boolean z, ArrayList<String> arrayList2) {
        this.robotName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.robotAvatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.robotDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.robotFeatures = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.robotUin = j;
        this.robotName = str;
        this.robotAvatar = str2;
        this.robotDesc = str3;
        this.robotOffline = i;
        this.robotFeatures = arrayList;
        this.robotTestStatus = i2;
        this.robotTid = j2;
        this.robotBan = z;
        this.tags = arrayList2;
    }
}
