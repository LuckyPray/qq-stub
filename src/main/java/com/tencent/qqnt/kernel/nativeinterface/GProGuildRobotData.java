package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotData.class */
public final class GProGuildRobotData {
    public boolean allowAddOtherGuild;
    public long appid;
    public String callName;
    public String extraInfo;
    public boolean isAudio;
    public int isGray;
    public boolean isSharable;
    public int muteStatus;
    public GProRobotGuildInfo officialGuild;
    public String ownerEntity;
    public ArrayList<GProRobotImageInfo> previewImages;
    public int publicType;
    public int punishmentStatus;
    public String robotAvatar;
    public boolean robotBan;
    public String robotDesc;
    public String robotName;
    public int robotOffline;
    public int robotRole;
    public int robotStatus;
    public long robotTid;
    public long robotUin;
    public int showInvite;
    public int status;
    public String supportUrl;
    public ArrayList<String> tags;
    public String verify;

    public GProGuildRobotData() {
        this.robotName = "";
        this.robotDesc = "";
        this.callName = "";
        this.verify = "";
        this.robotAvatar = "";
        this.extraInfo = "";
        this.supportUrl = "";
        this.ownerEntity = "";
        this.previewImages = new ArrayList<>();
        this.officialGuild = new GProRobotGuildInfo();
        this.tags = new ArrayList<>();
    }

    public boolean getAllowAddOtherGuild() {
        return this.allowAddOtherGuild;
    }

    public long getAppid() {
        return this.appid;
    }

    public String getCallName() {
        return this.callName;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public boolean getIsAudio() {
        return this.isAudio;
    }

    public int getIsGray() {
        return this.isGray;
    }

    public boolean getIsSharable() {
        return this.isSharable;
    }

    public int getMuteStatus() {
        return this.muteStatus;
    }

    public GProRobotGuildInfo getOfficialGuild() {
        return this.officialGuild;
    }

    public String getOwnerEntity() {
        return this.ownerEntity;
    }

    public ArrayList<GProRobotImageInfo> getPreviewImages() {
        return this.previewImages;
    }

    public int getPublicType() {
        return this.publicType;
    }

    public int getPunishmentStatus() {
        return this.punishmentStatus;
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

    public String getRobotName() {
        return this.robotName;
    }

    public int getRobotOffline() {
        return this.robotOffline;
    }

    public int getRobotRole() {
        return this.robotRole;
    }

    public int getRobotStatus() {
        return this.robotStatus;
    }

    public long getRobotTid() {
        return this.robotTid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public int getShowInvite() {
        return this.showInvite;
    }

    public int getStatus() {
        return this.status;
    }

    public String getSupportUrl() {
        return this.supportUrl;
    }

    public ArrayList<String> getTags() {
        return this.tags;
    }

    public String getVerify() {
        return this.verify;
    }

    public String toString() {
        return "GProGuildRobotData{robotUin=" + this.robotUin + ",robotName=" + this.robotName + ",status=" + this.status + ",robotDesc=" + this.robotDesc + ",callName=" + this.callName + ",showInvite=" + this.showInvite + ",robotOffline=" + this.robotOffline + ",verify=" + this.verify + ",robotAvatar=" + this.robotAvatar + ",extraInfo=" + this.extraInfo + ",robotRole=" + this.robotRole + ",isGray=" + this.isGray + ",isAudio=" + this.isAudio + ",muteStatus=" + this.muteStatus + ",punishmentStatus=" + this.punishmentStatus + ",supportUrl=" + this.supportUrl + ",robotTid=" + this.robotTid + ",robotBan=" + this.robotBan + ",isSharable=" + this.isSharable + ",allowAddOtherGuild=" + this.allowAddOtherGuild + ",publicType=" + this.publicType + ",appid=" + this.appid + ",ownerEntity=" + this.ownerEntity + ",previewImages=" + this.previewImages + ",officialGuild=" + this.officialGuild + ",tags=" + this.tags + ",robotStatus=" + this.robotStatus + ",}";
    }

    public GProGuildRobotData(long j, String str, int i, String str2, String str3, int i2, int i3, String str4, String str5, String str6, int i4, int i5, boolean z, int i6, int i7, String str7, long j2, boolean z2, boolean z3, boolean z4, int i8, long j3, String str8, ArrayList<GProRobotImageInfo> arrayList, GProRobotGuildInfo gProRobotGuildInfo, ArrayList<String> arrayList2) {
        this.robotName = "";
        this.robotDesc = "";
        this.callName = "";
        this.verify = "";
        this.robotAvatar = "";
        this.extraInfo = "";
        this.supportUrl = "";
        this.ownerEntity = "";
        this.previewImages = new ArrayList<>();
        this.officialGuild = new GProRobotGuildInfo();
        this.tags = new ArrayList<>();
        this.robotUin = j;
        this.robotName = str;
        this.status = i;
        this.robotDesc = str2;
        this.callName = str3;
        this.showInvite = i2;
        this.robotOffline = i3;
        this.verify = str4;
        this.robotAvatar = str5;
        this.extraInfo = str6;
        this.robotRole = i4;
        this.isGray = i5;
        this.isAudio = z;
        this.muteStatus = i6;
        this.punishmentStatus = i7;
        this.supportUrl = str7;
        this.robotTid = j2;
        this.robotBan = z2;
        this.isSharable = z3;
        this.allowAddOtherGuild = z4;
        this.publicType = i8;
        this.appid = j3;
        this.ownerEntity = str8;
        this.previewImages = arrayList;
        this.officialGuild = gProRobotGuildInfo;
        this.tags = arrayList2;
    }
}
