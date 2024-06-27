package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSimpleProfile.class */
public final class GProSimpleProfile {
    static IPatchRedirector $redirector_;
    public String avatarMeta;
    public String avatarPendant;
    public ArrayList<Long> categoryIds;
    public GProClientIdentity clientIdentityBytes;
    public String displayName;
    public long guildId;
    public long levelRoleId;
    public String memberName;
    public String nickName;
    public GProMedal personalMedal;
    public long roleId;
    public long tinyId;

    public GProSimpleProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.displayName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientIdentityBytes = new GProClientIdentity();
        this.avatarPendant = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.personalMedal = new GProMedal();
        this.categoryIds = new ArrayList<>();
    }

    public String getAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.avatarMeta : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getAvatarPendant() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.avatarPendant : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public ArrayList<Long> getCategoryIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.categoryIds : (ArrayList) iPatchRedirector.redirect((short) 14, this);
    }

    public GProClientIdentity getClientIdentityBytes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.clientIdentityBytes : (GProClientIdentity) iPatchRedirector.redirect((short) 11, this);
    }

    public String getDisplayName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.displayName : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getLevelRoleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.levelRoleId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String getMemberName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.memberName : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.nickName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public GProMedal getPersonalMedal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.personalMedal : (GProMedal) iPatchRedirector.redirect((short) 13, this);
    }

    public long getRoleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.roleId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public void setAvatarMeta(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) {
            this.avatarMeta = str;
        } else {
            iPatchRedirector.redirect((short) 22, this, str);
        }
    }

    public void setAvatarPendant(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) {
            this.avatarPendant = str;
        } else {
            iPatchRedirector.redirect((short) 24, this, str);
        }
    }

    public void setCategoryIds(ArrayList<Long> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) {
            this.categoryIds = arrayList;
        } else {
            iPatchRedirector.redirect((short) 26, this, arrayList);
        }
    }

    public void setClientIdentityBytes(GProClientIdentity gProClientIdentity) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) {
            this.clientIdentityBytes = gProClientIdentity;
        } else {
            iPatchRedirector.redirect((short) 23, this, gProClientIdentity);
        }
    }

    public void setDisplayName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) {
            this.displayName = str;
        } else {
            iPatchRedirector.redirect((short) 21, this, str);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 15, this, j);
        }
    }

    public void setLevelRoleId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.levelRoleId = j;
        } else {
            iPatchRedirector.redirect((short) 18, this, j);
        }
    }

    public void setMemberName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) {
            this.memberName = str;
        } else {
            iPatchRedirector.redirect((short) 20, this, str);
        }
    }

    public void setNickName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) {
            this.nickName = str;
        } else {
            iPatchRedirector.redirect((short) 19, this, str);
        }
    }

    public void setPersonalMedal(GProMedal gProMedal) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) {
            this.personalMedal = gProMedal;
        } else {
            iPatchRedirector.redirect((short) 25, this, gProMedal);
        }
    }

    public void setRoleId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.roleId = j;
        } else {
            iPatchRedirector.redirect((short) 17, this, j);
        }
    }

    public void setTinyId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.tinyId = j;
        } else {
            iPatchRedirector.redirect((short) 16, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 27)) {
            return (String) iPatchRedirector.redirect((short) 27, this);
        }
        return "GProSimpleProfile{guildId=" + this.guildId + ",tinyId=" + this.tinyId + ",roleId=" + this.roleId + ",levelRoleId=" + this.levelRoleId + ",nickName=" + this.nickName + ",memberName=" + this.memberName + ",displayName=" + this.displayName + ",avatarMeta=" + this.avatarMeta + ",clientIdentityBytes=" + this.clientIdentityBytes + ",avatarPendant=" + this.avatarPendant + ",personalMedal=" + this.personalMedal + ",categoryIds=" + this.categoryIds + ",}";
    }

    public GProSimpleProfile(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, GProClientIdentity gProClientIdentity, String str5, GProMedal gProMedal, ArrayList<Long> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), str, str2, str3, str4, gProClientIdentity, str5, gProMedal, arrayList});
            return;
        }
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.displayName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientIdentityBytes = new GProClientIdentity();
        this.avatarPendant = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.personalMedal = new GProMedal();
        this.categoryIds = new ArrayList<>();
        this.guildId = j;
        this.tinyId = j2;
        this.roleId = j3;
        this.levelRoleId = j4;
        this.nickName = str;
        this.memberName = str2;
        this.displayName = str3;
        this.avatarMeta = str4;
        this.clientIdentityBytes = gProClientIdentity;
        this.avatarPendant = str5;
        this.personalMedal = gProMedal;
        this.categoryIds = arrayList;
    }
}
