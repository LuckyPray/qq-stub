package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUser.class */
public final class GProUser implements Serializable {
    static IPatchRedirector $redirector_;
    public int allowScreenShare;
    public String avatarMeta;
    public String avatarPendant;
    public GProBusinessInfo businessInfo;
    public int chnRole;
    public GProClientIdentity clientIdentity;
    public GProClientPresence clientPresence;
    public byte[] cookie;
    public int gender;
    public long guildId;
    public boolean guildMute;
    public boolean inBlack;
    public long joinTime;
    public int levelRoleId;
    public String memberName;
    public ArrayList<Integer> myRoles;
    public String nickName;
    public int onlineState;
    public GProMedal personalMedal;
    public int platform;
    public int robotMuteStatus;
    public int robotPunishmentStatus;
    public String robotTestGuilds;
    public int robotType;
    public GProRoleManagementTag roleManagementTag;
    long serialVersionUID;
    public long shutUpExpireTime;
    public long tinyId;
    public int type;
    public GProVoiceInfo voiceInfo;

    public GProUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.memberName = "";
        this.nickName = "";
        this.cookie = new byte[0];
        this.clientIdentity = new GProClientIdentity();
        this.clientPresence = new GProClientPresence();
        this.robotTestGuilds = "";
        this.avatarMeta = "";
        this.voiceInfo = new GProVoiceInfo();
        this.businessInfo = new GProBusinessInfo();
        this.myRoles = new ArrayList<>();
        this.avatarPendant = "";
        this.personalMedal = new GProMedal();
        this.roleManagementTag = new GProRoleManagementTag();
    }

    public int getAllowScreenShare() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.allowScreenShare : ((Integer) iPatchRedirector.redirect((short) 24, this)).intValue();
    }

    public String getAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.avatarMeta : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public String getAvatarPendant() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) ? this.avatarPendant : (String) iPatchRedirector.redirect((short) 29, this);
    }

    public GProBusinessInfo getBusinessInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.businessInfo : (GProBusinessInfo) iPatchRedirector.redirect((short) 25, this);
    }

    public int getChnRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.chnRole : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public GProClientIdentity getClientIdentity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.clientIdentity : (GProClientIdentity) iPatchRedirector.redirect((short) 15, this);
    }

    public GProClientPresence getClientPresence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.clientPresence : (GProClientPresence) iPatchRedirector.redirect((short) 16, this);
    }

    public byte[] getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.cookie : (byte[]) iPatchRedirector.redirect((short) 14, this);
    }

    public int getGender() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.gender : ((Integer) iPatchRedirector.redirect((short) 23, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public boolean getGuildMute() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.guildMute : ((Boolean) iPatchRedirector.redirect((short) 11, this)).booleanValue();
    }

    public boolean getInBlack() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.inBlack : ((Boolean) iPatchRedirector.redirect((short) 12, this)).booleanValue();
    }

    public long getJoinTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.joinTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public int getLevelRoleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.levelRoleId : ((Integer) iPatchRedirector.redirect((short) 27, this)).intValue();
    }

    public String getMemberName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.memberName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<Integer> getMyRoles() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) ? this.myRoles : (ArrayList) iPatchRedirector.redirect((short) 28, this);
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.nickName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getOnlineState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.onlineState : ((Integer) iPatchRedirector.redirect((short) 26, this)).intValue();
    }

    public GProMedal getPersonalMedal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) ? this.personalMedal : (GProMedal) iPatchRedirector.redirect((short) 30, this);
    }

    public int getPlatform() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.platform : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public int getRobotMuteStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.robotMuteStatus : ((Integer) iPatchRedirector.redirect((short) 18, this)).intValue();
    }

    public int getRobotPunishmentStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.robotPunishmentStatus : ((Integer) iPatchRedirector.redirect((short) 19, this)).intValue();
    }

    public String getRobotTestGuilds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.robotTestGuilds : (String) iPatchRedirector.redirect((short) 20, this);
    }

    public int getRobotType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.robotType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public GProRoleManagementTag getRoleManagementTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) ? this.roleManagementTag : (GProRoleManagementTag) iPatchRedirector.redirect((short) 31, this);
    }

    public long getShutUpExpireTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.shutUpExpireTime : ((Long) iPatchRedirector.redirect((short) 17, this)).longValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public GProVoiceInfo getVoiceInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.voiceInfo : (GProVoiceInfo) iPatchRedirector.redirect((short) 22, this);
    }

    public void setAllowScreenShare(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 53)) {
            this.allowScreenShare = i;
        } else {
            iPatchRedirector.redirect((short) 53, this, i);
        }
    }

    public void setAvatarMeta(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 50)) {
            this.avatarMeta = str;
        } else {
            iPatchRedirector.redirect((short) 50, this, str);
        }
    }

    public void setAvatarPendant(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 58)) {
            this.avatarPendant = str;
        } else {
            iPatchRedirector.redirect((short) 58, this, str);
        }
    }

    public void setBusinessInfo(GProBusinessInfo gProBusinessInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 54)) {
            this.businessInfo = gProBusinessInfo;
        } else {
            iPatchRedirector.redirect((short) 54, this, gProBusinessInfo);
        }
    }

    public void setChnRole(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 39)) {
            this.chnRole = i;
        } else {
            iPatchRedirector.redirect((short) 39, this, i);
        }
    }

    public void setClientIdentity(GProClientIdentity gProClientIdentity) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 44)) {
            this.clientIdentity = gProClientIdentity;
        } else {
            iPatchRedirector.redirect((short) 44, this, gProClientIdentity);
        }
    }

    public void setClientPresence(GProClientPresence gProClientPresence) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 45)) {
            this.clientPresence = gProClientPresence;
        } else {
            iPatchRedirector.redirect((short) 45, this, gProClientPresence);
        }
    }

    public void setCookie(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 43)) {
            this.cookie = bArr;
        } else {
            iPatchRedirector.redirect((short) 43, this, bArr);
        }
    }

    public void setGender(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 52)) {
            this.gender = i;
        } else {
            iPatchRedirector.redirect((short) 52, this, i);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 33, this, j);
        }
    }

    public void setGuildMute(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 40)) {
            this.guildMute = z;
        } else {
            iPatchRedirector.redirect((short) 40, this, z);
        }
    }

    public void setInBlack(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 41)) {
            this.inBlack = z;
        } else {
            iPatchRedirector.redirect((short) 41, this, z);
        }
    }

    public void setJoinTime(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) {
            this.joinTime = j;
        } else {
            iPatchRedirector.redirect((short) 37, this, j);
        }
    }

    public void setLevelRoleId(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 56)) {
            this.levelRoleId = i;
        } else {
            iPatchRedirector.redirect((short) 56, this, i);
        }
    }

    public void setMemberName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) {
            this.memberName = str;
        } else {
            iPatchRedirector.redirect((short) 34, this, str);
        }
    }

    public void setMyRoles(ArrayList<Integer> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 57)) {
            this.myRoles = arrayList;
        } else {
            iPatchRedirector.redirect((short) 57, this, arrayList);
        }
    }

    public void setNickName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) {
            this.nickName = str;
        } else {
            iPatchRedirector.redirect((short) 35, this, str);
        }
    }

    public void setOnlineState(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 55)) {
            this.onlineState = i;
        } else {
            iPatchRedirector.redirect((short) 55, this, i);
        }
    }

    public void setPersonalMedal(GProMedal gProMedal) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 59)) {
            this.personalMedal = gProMedal;
        } else {
            iPatchRedirector.redirect((short) 59, this, gProMedal);
        }
    }

    public void setPlatform(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 42)) {
            this.platform = i;
        } else {
            iPatchRedirector.redirect((short) 42, this, i);
        }
    }

    public void setRobotMuteStatus(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 47)) {
            this.robotMuteStatus = i;
        } else {
            iPatchRedirector.redirect((short) 47, this, i);
        }
    }

    public void setRobotPunishmentStatus(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 48)) {
            this.robotPunishmentStatus = i;
        } else {
            iPatchRedirector.redirect((short) 48, this, i);
        }
    }

    public void setRobotTestGuilds(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 49)) {
            this.robotTestGuilds = str;
        } else {
            iPatchRedirector.redirect((short) 49, this, str);
        }
    }

    public void setRobotType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) {
            this.robotType = i;
        } else {
            iPatchRedirector.redirect((short) 38, this, i);
        }
    }

    public void setRoleManagementTag(GProRoleManagementTag gProRoleManagementTag) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 60)) {
            this.roleManagementTag = gProRoleManagementTag;
        } else {
            iPatchRedirector.redirect((short) 60, this, gProRoleManagementTag);
        }
    }

    public void setShutUpExpireTime(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 46)) {
            this.shutUpExpireTime = j;
        } else {
            iPatchRedirector.redirect((short) 46, this, j);
        }
    }

    public void setTinyId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) {
            this.tinyId = j;
        } else {
            iPatchRedirector.redirect((short) 32, this, j);
        }
    }

    public void setType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) {
            this.type = i;
        } else {
            iPatchRedirector.redirect((short) 36, this, i);
        }
    }

    public void setVoiceInfo(GProVoiceInfo gProVoiceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 51)) {
            this.voiceInfo = gProVoiceInfo;
        } else {
            iPatchRedirector.redirect((short) 51, this, gProVoiceInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 61)) {
            return (String) iPatchRedirector.redirect((short) 61, this);
        }
        return "GProUser{tinyId=" + this.tinyId + ",guildId=" + this.guildId + ",memberName=" + this.memberName + ",nickName=" + this.nickName + ",type=" + this.type + ",joinTime=" + this.joinTime + ",robotType=" + this.robotType + ",chnRole=" + this.chnRole + ",guildMute=" + this.guildMute + ",inBlack=" + this.inBlack + ",platform=" + this.platform + ",cookie=" + this.cookie + ",clientIdentity=" + this.clientIdentity + ",clientPresence=" + this.clientPresence + ",shutUpExpireTime=" + this.shutUpExpireTime + ",robotMuteStatus=" + this.robotMuteStatus + ",robotPunishmentStatus=" + this.robotPunishmentStatus + ",robotTestGuilds=" + this.robotTestGuilds + ",avatarMeta=" + this.avatarMeta + ",voiceInfo=" + this.voiceInfo + ",gender=" + this.gender + ",allowScreenShare=" + this.allowScreenShare + ",businessInfo=" + this.businessInfo + ",onlineState=" + this.onlineState + ",levelRoleId=" + this.levelRoleId + ",myRoles=" + this.myRoles + ",avatarPendant=" + this.avatarPendant + ",personalMedal=" + this.personalMedal + ",roleManagementTag=" + this.roleManagementTag + ",}";
    }

    public GProUser(long j, long j2, String str, String str2, int i, long j3, int i2, int i3, boolean z, boolean z2, int i4, byte[] bArr, GProClientIdentity gProClientIdentity, GProClientPresence gProClientPresence, long j4, int i5, int i6, String str3, String str4, GProVoiceInfo gProVoiceInfo, int i7, int i8, GProBusinessInfo gProBusinessInfo, int i9, int i10, ArrayList<Integer> arrayList, String str5, GProMedal gProMedal, GProRoleManagementTag gProRoleManagementTag) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), str, str2, Integer.valueOf(i), Long.valueOf(j3), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i4), bArr, gProClientIdentity, gProClientPresence, Long.valueOf(j4), Integer.valueOf(i5), Integer.valueOf(i6), str3, str4, gProVoiceInfo, Integer.valueOf(i7), Integer.valueOf(i8), gProBusinessInfo, Integer.valueOf(i9), Integer.valueOf(i10), arrayList, str5, gProMedal, gProRoleManagementTag);
            return;
        }
        this.serialVersionUID = 1L;
        this.memberName = "";
        this.nickName = "";
        this.cookie = new byte[0];
        this.clientIdentity = new GProClientIdentity();
        this.clientPresence = new GProClientPresence();
        this.robotTestGuilds = "";
        this.avatarMeta = "";
        this.voiceInfo = new GProVoiceInfo();
        this.businessInfo = new GProBusinessInfo();
        this.myRoles = new ArrayList<>();
        this.avatarPendant = "";
        this.personalMedal = new GProMedal();
        this.roleManagementTag = new GProRoleManagementTag();
        this.tinyId = j;
        this.guildId = j2;
        this.memberName = str;
        this.nickName = str2;
        this.type = i;
        this.joinTime = j3;
        this.robotType = i2;
        this.chnRole = i3;
        this.guildMute = z;
        this.inBlack = z2;
        this.platform = i4;
        this.cookie = bArr;
        this.clientIdentity = gProClientIdentity;
        this.clientPresence = gProClientPresence;
        this.shutUpExpireTime = j4;
        this.robotMuteStatus = i5;
        this.robotPunishmentStatus = i6;
        this.robotTestGuilds = str3;
        this.avatarMeta = str4;
        this.voiceInfo = gProVoiceInfo;
        this.gender = i7;
        this.allowScreenShare = i8;
        this.businessInfo = gProBusinessInfo;
        this.onlineState = i9;
        this.levelRoleId = i10;
        this.myRoles = arrayList;
        this.avatarPendant = str5;
        this.personalMedal = gProMedal;
        this.roleManagementTag = gProRoleManagementTag;
    }
}
