package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildInfo.class */
public final class GProGuildInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public int allowSearch;
    public GProMsgSeq authChannelChangeSeq;
    public long bannedTimeLimit;
    public long changeNameInterval;
    public GProMsgSeq channelChangeSeq;
    public int clientId;
    public int coverFontColorId;
    public long coverSeq;
    public GProDirectMsgThreshold directMsgThreshold;
    public GProExtendInfo extendInfo;
    public long faceSeq;
    public long groupId;
    public int guildCanShare;
    public long guildCode;
    public GProMsgSeq guildInfoChangeSeq;
    public String guildName;
    public long guildNameChangeTime;
    public String guildNumber;
    public GProMsgSeq guildPermissionChanngeSeq;
    public int guildSignInNotify;
    public GProGroupProStatus guildStatus;
    public int guildType;
    public boolean isGroupGuild;
    public int isVisibleForVisitor;
    public GProJumpInfo jumpInfo;
    public int keywordSearchSwitch;
    public int medalLevel;
    public ArrayList<GProMedalInfo> medals;
    public int memberNum;
    public ArrayList<GProNavigationInfo> navigations;
    public long ownerTinyid;
    public String profile;
    public int qrCodePeriod;
    public int qrCodeSwitch;
    public GProMsgSeq roleChangeSeq;
    long serialVersionUID;
    public long shutupExpireTime;
    public GProSpeakThreshold speakThreshold;
    public GProTagInfo tagInfo;
    public int topicSquareSwitch;
    public int visitorInteractionAllSwitch;
    public int vistorFaceDistinguish;
    public int vistorInteraction;

    public GProGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = "";
        this.profile = "";
        this.guildStatus = new GProGroupProStatus();
        this.guildNumber = "";
        this.speakThreshold = new GProSpeakThreshold();
        this.directMsgThreshold = new GProDirectMsgThreshold();
        this.extendInfo = new GProExtendInfo();
        this.navigations = new ArrayList<>();
        this.jumpInfo = new GProJumpInfo();
        this.medals = new ArrayList<>();
        this.tagInfo = new GProTagInfo();
        this.guildInfoChangeSeq = new GProMsgSeq();
        this.channelChangeSeq = new GProMsgSeq();
        this.roleChangeSeq = new GProMsgSeq();
        this.authChannelChangeSeq = new GProMsgSeq();
        this.guildPermissionChanngeSeq = new GProMsgSeq();
    }

    public int getAllowSearch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.allowSearch : ((Integer) iPatchRedirector.redirect((short) 20, this)).intValue();
    }

    public GProMsgSeq getAuthChannelChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 41)) ? this.authChannelChangeSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 41, this);
    }

    public long getBannedTimeLimit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.bannedTimeLimit : ((Long) iPatchRedirector.redirect((short) 14, this)).longValue();
    }

    public long getChangeNameInterval() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 44)) ? this.changeNameInterval : ((Long) iPatchRedirector.redirect((short) 44, this)).longValue();
    }

    public GProMsgSeq getChannelChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 39)) ? this.channelChangeSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 39, this);
    }

    public int getClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.clientId : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public int getCoverFontColorId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.coverFontColorId : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public long getCoverSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.coverSeq : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public GProDirectMsgThreshold getDirectMsgThreshold() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.directMsgThreshold : (GProDirectMsgThreshold) iPatchRedirector.redirect((short) 24, this);
    }

    public GProExtendInfo getExtendInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.extendInfo : (GProExtendInfo) iPatchRedirector.redirect((short) 25, this);
    }

    public long getFaceSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.faceSeq : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public long getGroupId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) ? this.groupId : ((Long) iPatchRedirector.redirect((short) 32, this)).longValue();
    }

    public int getGuildCanShare() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.guildCanShare : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public long getGuildCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildCode : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public GProMsgSeq getGuildInfoChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) ? this.guildInfoChangeSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 38, this);
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getGuildNameChangeTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.guildNameChangeTime : ((Long) iPatchRedirector.redirect((short) 19, this)).longValue();
    }

    public String getGuildNumber() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.guildNumber : (String) iPatchRedirector.redirect((short) 18, this);
    }

    public GProMsgSeq getGuildPermissionChanngeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 42)) ? this.guildPermissionChanngeSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 42, this);
    }

    public int getGuildSignInNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) ? this.guildSignInNotify : ((Integer) iPatchRedirector.redirect((short) 37, this)).intValue();
    }

    public GProGroupProStatus getGuildStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildStatus : (GProGroupProStatus) iPatchRedirector.redirect((short) 9, this);
    }

    public int getGuildType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public boolean getIsGroupGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) ? this.isGroupGuild : ((Boolean) iPatchRedirector.redirect((short) 33, this)).booleanValue();
    }

    public int getIsVisibleForVisitor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.isVisibleForVisitor : ((Integer) iPatchRedirector.redirect((short) 22, this)).intValue();
    }

    public GProJumpInfo getJumpInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.jumpInfo : (GProJumpInfo) iPatchRedirector.redirect((short) 27, this);
    }

    public int getKeywordSearchSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.keywordSearchSwitch : ((Integer) iPatchRedirector.redirect((short) 21, this)).intValue();
    }

    public int getMedalLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 43)) ? this.medalLevel : ((Integer) iPatchRedirector.redirect((short) 43, this)).intValue();
    }

    public ArrayList<GProMedalInfo> getMedals() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) ? this.medals : (ArrayList) iPatchRedirector.redirect((short) 30, this);
    }

    public int getMemberNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.memberNum : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProNavigationInfo> getNavigations() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.navigations : (ArrayList) iPatchRedirector.redirect((short) 26, this);
    }

    public long getOwnerTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.ownerTinyid : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public String getProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.profile : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getQrCodePeriod() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.qrCodePeriod : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public int getQrCodeSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) ? this.qrCodeSwitch : ((Integer) iPatchRedirector.redirect((short) 35, this)).intValue();
    }

    public GProMsgSeq getRoleChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 40)) ? this.roleChangeSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 40, this);
    }

    public long getShutupExpireTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.shutupExpireTime : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public GProSpeakThreshold getSpeakThreshold() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.speakThreshold : (GProSpeakThreshold) iPatchRedirector.redirect((short) 23, this);
    }

    public GProTagInfo getTagInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) ? this.tagInfo : (GProTagInfo) iPatchRedirector.redirect((short) 34, this);
    }

    public int getTopicSquareSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) ? this.topicSquareSwitch : ((Integer) iPatchRedirector.redirect((short) 31, this)).intValue();
    }

    public int getVisitorInteractionAllSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) ? this.visitorInteractionAllSwitch : ((Integer) iPatchRedirector.redirect((short) 36, this)).intValue();
    }

    public int getVistorFaceDistinguish() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) ? this.vistorFaceDistinguish : ((Integer) iPatchRedirector.redirect((short) 28, this)).intValue();
    }

    public int getVistorInteraction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) ? this.vistorInteraction : ((Integer) iPatchRedirector.redirect((short) 29, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 45)) {
            return (String) iPatchRedirector.redirect((short) 45, this);
        }
        return "GProGuildInfo{guildCode=" + this.guildCode + ",memberNum=" + this.memberNum + ",guildType=" + this.guildType + ",guildName=" + this.guildName + ",profile=" + this.profile + ",faceSeq=" + this.faceSeq + ",guildStatus=" + this.guildStatus + ",ownerTinyid=" + this.ownerTinyid + ",coverSeq=" + this.coverSeq + ",clientId=" + this.clientId + ",shutupExpireTime=" + this.shutupExpireTime + ",bannedTimeLimit=" + this.bannedTimeLimit + ",coverFontColorId=" + this.coverFontColorId + ",guildCanShare=" + this.guildCanShare + ",qrCodePeriod=" + this.qrCodePeriod + ",guildNumber=" + this.guildNumber + ",guildNameChangeTime=" + this.guildNameChangeTime + ",allowSearch=" + this.allowSearch + ",keywordSearchSwitch=" + this.keywordSearchSwitch + ",isVisibleForVisitor=" + this.isVisibleForVisitor + ",speakThreshold=" + this.speakThreshold + ",directMsgThreshold=" + this.directMsgThreshold + ",extendInfo=" + this.extendInfo + ",navigations=" + this.navigations + ",jumpInfo=" + this.jumpInfo + ",vistorFaceDistinguish=" + this.vistorFaceDistinguish + ",vistorInteraction=" + this.vistorInteraction + ",medals=" + this.medals + ",topicSquareSwitch=" + this.topicSquareSwitch + ",groupId=" + this.groupId + ",isGroupGuild=" + this.isGroupGuild + ",tagInfo=" + this.tagInfo + ",qrCodeSwitch=" + this.qrCodeSwitch + ",visitorInteractionAllSwitch=" + this.visitorInteractionAllSwitch + ",guildSignInNotify=" + this.guildSignInNotify + ",guildInfoChangeSeq=" + this.guildInfoChangeSeq + ",channelChangeSeq=" + this.channelChangeSeq + ",roleChangeSeq=" + this.roleChangeSeq + ",authChannelChangeSeq=" + this.authChannelChangeSeq + ",guildPermissionChanngeSeq=" + this.guildPermissionChanngeSeq + ",medalLevel=" + this.medalLevel + ",changeNameInterval=" + this.changeNameInterval + ",}";
    }

    public GProGuildInfo(long j, int i, String str, String str2, long j2, GProGroupProStatus gProGroupProStatus, long j3, long j4, int i2, long j5, long j6, int i3, int i4, int i5, String str3, long j7, int i6, int i7, int i8, GProSpeakThreshold gProSpeakThreshold, GProDirectMsgThreshold gProDirectMsgThreshold, GProExtendInfo gProExtendInfo, ArrayList<GProNavigationInfo> arrayList, GProJumpInfo gProJumpInfo, int i9, int i10, ArrayList<GProMedalInfo> arrayList2, int i11, long j8, boolean z, GProTagInfo gProTagInfo, int i12, int i13, GProMsgSeq gProMsgSeq, GProMsgSeq gProMsgSeq2, GProMsgSeq gProMsgSeq3, GProMsgSeq gProMsgSeq4, GProMsgSeq gProMsgSeq5, int i14, long j9) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Integer.valueOf(i), str, str2, Long.valueOf(j2), gProGroupProStatus, Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i2), Long.valueOf(j5), Long.valueOf(j6), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str3, Long.valueOf(j7), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), gProSpeakThreshold, gProDirectMsgThreshold, gProExtendInfo, arrayList, gProJumpInfo, Integer.valueOf(i9), Integer.valueOf(i10), arrayList2, Integer.valueOf(i11), Long.valueOf(j8), Boolean.valueOf(z), gProTagInfo, Integer.valueOf(i12), Integer.valueOf(i13), gProMsgSeq, gProMsgSeq2, gProMsgSeq3, gProMsgSeq4, gProMsgSeq5, Integer.valueOf(i14), Long.valueOf(j9));
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = "";
        this.profile = "";
        this.guildStatus = new GProGroupProStatus();
        this.guildNumber = "";
        this.speakThreshold = new GProSpeakThreshold();
        this.directMsgThreshold = new GProDirectMsgThreshold();
        this.extendInfo = new GProExtendInfo();
        this.navigations = new ArrayList<>();
        this.jumpInfo = new GProJumpInfo();
        this.medals = new ArrayList<>();
        this.tagInfo = new GProTagInfo();
        this.guildInfoChangeSeq = new GProMsgSeq();
        this.channelChangeSeq = new GProMsgSeq();
        this.roleChangeSeq = new GProMsgSeq();
        this.authChannelChangeSeq = new GProMsgSeq();
        this.guildPermissionChanngeSeq = new GProMsgSeq();
        this.guildCode = j;
        this.memberNum = i;
        this.guildName = str;
        this.profile = str2;
        this.faceSeq = j2;
        this.guildStatus = gProGroupProStatus;
        this.ownerTinyid = j3;
        this.coverSeq = j4;
        this.clientId = i2;
        this.shutupExpireTime = j5;
        this.bannedTimeLimit = j6;
        this.coverFontColorId = i3;
        this.guildCanShare = i4;
        this.qrCodePeriod = i5;
        this.guildNumber = str3;
        this.guildNameChangeTime = j7;
        this.allowSearch = i6;
        this.keywordSearchSwitch = i7;
        this.isVisibleForVisitor = i8;
        this.speakThreshold = gProSpeakThreshold;
        this.directMsgThreshold = gProDirectMsgThreshold;
        this.extendInfo = gProExtendInfo;
        this.navigations = arrayList;
        this.jumpInfo = gProJumpInfo;
        this.vistorFaceDistinguish = i9;
        this.vistorInteraction = i10;
        this.medals = arrayList2;
        this.topicSquareSwitch = i11;
        this.groupId = j8;
        this.isGroupGuild = z;
        this.tagInfo = gProTagInfo;
        this.qrCodeSwitch = i12;
        this.visitorInteractionAllSwitch = i13;
        this.guildInfoChangeSeq = gProMsgSeq;
        this.channelChangeSeq = gProMsgSeq2;
        this.roleChangeSeq = gProMsgSeq3;
        this.authChannelChangeSeq = gProMsgSeq4;
        this.guildPermissionChanngeSeq = gProMsgSeq5;
        this.medalLevel = i14;
        this.changeNameInterval = j9;
    }
}
