package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStUser.class */
public final class GProStUser {
    static IPatchRedirector $redirector_;
    public String avatarPendant;
    public long birthday;
    public int blackState;
    public byte[] busiData;
    public String certificationDesc;
    public GProChannelUserInfo channelUserInfo;
    public String company;
    public int constellation;
    public String desc;
    public int descType;
    public int followState;
    public int frdState;
    public GProStIconInfo icon;
    public String idd;
    public String jumpUrl;
    public String location;
    public String locationCode;
    public String loginId;
    public GProCustomManageTag manageTag;
    public GProStTagMedalInfo medal;
    public String nick;
    public int nickFlag;
    public GProPersonalMedal personalMedal;
    public int relationState;
    public String school;
    public int sex;
    public String thirdId;
    public int type;
    public long uin;
    public ArrayList<GProCustomManageTag> userTagList;

    public GProStUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.idd = "";
        this.nick = "";
        this.icon = new GProStIconInfo();
        this.desc = "";
        this.school = "";
        this.location = "";
        this.busiData = new byte[0];
        this.medal = new GProStTagMedalInfo();
        this.jumpUrl = "";
        this.locationCode = "";
        this.thirdId = "";
        this.company = "";
        this.certificationDesc = "";
        this.channelUserInfo = new GProChannelUserInfo();
        this.loginId = "";
        this.manageTag = new GProCustomManageTag();
        this.personalMedal = new GProPersonalMedal();
        this.userTagList = new ArrayList<>();
        this.avatarPendant = "";
    }

    public String getAvatarPendant() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) ? this.avatarPendant : (String) iPatchRedirector.redirect((short) 31, this);
    }

    public long getBirthday() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.birthday : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public int getBlackState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.blackState : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 12, this);
    }

    public String getCertificationDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.certificationDesc : (String) iPatchRedirector.redirect((short) 22, this);
    }

    public GProChannelUserInfo getChannelUserInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.channelUserInfo : (GProChannelUserInfo) iPatchRedirector.redirect((short) 24, this);
    }

    public String getCompany() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.company : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public int getConstellation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.constellation : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public String getDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.desc : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getDescType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.descType : ((Integer) iPatchRedirector.redirect((short) 23, this)).intValue();
    }

    public int getFollowState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.followState : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getFrdState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.frdState : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public GProStIconInfo getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.icon : (GProStIconInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public String getIdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.idd : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 18, this);
    }

    public String getLocation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.location : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getLocationCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.locationCode : (String) iPatchRedirector.redirect((short) 19, this);
    }

    public String getLoginId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.loginId : (String) iPatchRedirector.redirect((short) 25, this);
    }

    public GProCustomManageTag getManageTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) ? this.manageTag : (GProCustomManageTag) iPatchRedirector.redirect((short) 28, this);
    }

    public GProStTagMedalInfo getMedal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.medal : (GProStTagMedalInfo) iPatchRedirector.redirect((short) 16, this);
    }

    public String getNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.nick : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getNickFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.nickFlag : ((Integer) iPatchRedirector.redirect((short) 27, this)).intValue();
    }

    public GProPersonalMedal getPersonalMedal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) ? this.personalMedal : (GProPersonalMedal) iPatchRedirector.redirect((short) 29, this);
    }

    public int getRelationState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.relationState : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public String getSchool() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.school : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getSex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.sex : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getThirdId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.thirdId : (String) iPatchRedirector.redirect((short) 20, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.uin : ((Long) iPatchRedirector.redirect((short) 26, this)).longValue();
    }

    public ArrayList<GProCustomManageTag> getUserTagList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) ? this.userTagList : (ArrayList) iPatchRedirector.redirect((short) 30, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 32)) {
            return (String) iPatchRedirector.redirect((short) 32, this);
        }
        return "GProStUser{idd=" + this.idd + ",nick=" + this.nick + ",icon=" + this.icon + ",desc=" + this.desc + ",followState=" + this.followState + ",type=" + this.type + ",sex=" + this.sex + ",birthday=" + this.birthday + ",school=" + this.school + ",location=" + this.location + ",busiData=" + this.busiData + ",frdState=" + this.frdState + ",relationState=" + this.relationState + ",blackState=" + this.blackState + ",medal=" + this.medal + ",constellation=" + this.constellation + ",jumpUrl=" + this.jumpUrl + ",locationCode=" + this.locationCode + ",thirdId=" + this.thirdId + ",company=" + this.company + ",certificationDesc=" + this.certificationDesc + ",descType=" + this.descType + ",channelUserInfo=" + this.channelUserInfo + ",loginId=" + this.loginId + ",uin=" + this.uin + ",nickFlag=" + this.nickFlag + ",manageTag=" + this.manageTag + ",personalMedal=" + this.personalMedal + ",userTagList=" + this.userTagList + ",avatarPendant=" + this.avatarPendant + ",}";
    }
}
