package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ProfileDetailInfo.class */
public final class ProfileDetailInfo {
    public String address;
    public String avatarUrl;
    public int birthdayDay;
    public int birthdayMonth;
    public int birthdayYear;
    public String city;
    public String college;
    public int constellation;
    public String country;
    public int disableEmojiShortCuts;
    public String eMail;
    public int extStatus;
    public String homeTown;
    public String interest;
    public boolean isBlock;
    public int isHidePrivilegeIcon;
    public int isHideQQLevel;
    public boolean isSpecialCareOpen;
    public boolean isSpecialCareZone;
    public int kBloodType;
    public ArrayList<String> labels;
    public String longNick;
    public int makeFriendCareer;
    public String nick;
    public String phoneNum;
    public ProfilePicInfo photoWall;
    public String pos;
    public String postCode;
    public PrivilegeIcon privilegeIcon;
    public String province;
    public String qid;
    public int qidianCrewFlag;
    public int qidianCrewFlag2;
    public int qidianMasterFlag;
    public QQLevel qqLevel;
    public int recommendImgFlag;
    public int regTime;
    public String remark;
    public String ringId;
    public int sex;
    public int shengXiao;
    public int status;
    public boolean svipFlag;
    public int termType;
    public long topTime;
    public String uid;
    public long uin;
    public boolean vipFlag;
    public int vipLevel;
    public boolean yearVipFlag;

    public ProfileDetailInfo() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.qid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.remark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.longNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.homeTown = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.pos = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eMail = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.phoneNum = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.college = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.country = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.province = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.city = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.postCode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.address = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.ringId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.interest = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labels = new ArrayList<>();
        this.qqLevel = new QQLevel();
        this.privilegeIcon = new PrivilegeIcon();
        this.photoWall = new ProfilePicInfo();
    }

    public String getAddress() {
        return this.address;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public int getBirthdayDay() {
        return this.birthdayDay;
    }

    public int getBirthdayMonth() {
        return this.birthdayMonth;
    }

    public int getBirthdayYear() {
        return this.birthdayYear;
    }

    public String getCity() {
        return this.city;
    }

    public String getCollege() {
        return this.college;
    }

    public int getConstellation() {
        return this.constellation;
    }

    public String getCountry() {
        return this.country;
    }

    public int getDisableEmojiShortCuts() {
        return this.disableEmojiShortCuts;
    }

    public String getEMail() {
        return this.eMail;
    }

    public int getExtStatus() {
        return this.extStatus;
    }

    public String getHomeTown() {
        return this.homeTown;
    }

    public String getInterest() {
        return this.interest;
    }

    public boolean getIsBlock() {
        return this.isBlock;
    }

    public int getIsHidePrivilegeIcon() {
        return this.isHidePrivilegeIcon;
    }

    public int getIsHideQQLevel() {
        return this.isHideQQLevel;
    }

    public boolean getIsSpecialCareOpen() {
        return this.isSpecialCareOpen;
    }

    public boolean getIsSpecialCareZone() {
        return this.isSpecialCareZone;
    }

    public int getKBloodType() {
        return this.kBloodType;
    }

    public ArrayList<String> getLabels() {
        return this.labels;
    }

    public String getLongNick() {
        return this.longNick;
    }

    public int getMakeFriendCareer() {
        return this.makeFriendCareer;
    }

    public String getNick() {
        return this.nick;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public ProfilePicInfo getPhotoWall() {
        return this.photoWall;
    }

    public String getPos() {
        return this.pos;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public PrivilegeIcon getPrivilegeIcon() {
        return this.privilegeIcon;
    }

    public String getProvince() {
        return this.province;
    }

    public String getQid() {
        return this.qid;
    }

    public int getQidianCrewFlag() {
        return this.qidianCrewFlag;
    }

    public int getQidianCrewFlag2() {
        return this.qidianCrewFlag2;
    }

    public int getQidianMasterFlag() {
        return this.qidianMasterFlag;
    }

    public QQLevel getQqLevel() {
        return this.qqLevel;
    }

    public int getRecommendImgFlag() {
        return this.recommendImgFlag;
    }

    public int getRegTime() {
        return this.regTime;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getRingId() {
        return this.ringId;
    }

    public int getSex() {
        return this.sex;
    }

    public int getShengXiao() {
        return this.shengXiao;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean getSvipFlag() {
        return this.svipFlag;
    }

    public int getTermType() {
        return this.termType;
    }

    public long getTopTime() {
        return this.topTime;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public boolean getVipFlag() {
        return this.vipFlag;
    }

    public int getVipLevel() {
        return this.vipLevel;
    }

    public boolean getYearVipFlag() {
        return this.yearVipFlag;
    }

    public String toString() {
        return "ProfileDetailInfo{uid=" + this.uid + ",qid=" + this.qid + ",uin=" + this.uin + ",nick=" + this.nick + ",remark=" + this.remark + ",longNick=" + this.longNick + ",avatarUrl=" + this.avatarUrl + ",birthdayYear=" + this.birthdayYear + ",birthdayMonth=" + this.birthdayMonth + ",birthdayDay=" + this.birthdayDay + ",sex=" + this.sex + ",topTime=" + this.topTime + ",constellation=" + this.constellation + ",shengXiao=" + this.shengXiao + ",kBloodType=" + this.kBloodType + ",homeTown=" + this.homeTown + ",makeFriendCareer=" + this.makeFriendCareer + ",pos=" + this.pos + ",eMail=" + this.eMail + ",phoneNum=" + this.phoneNum + ",college=" + this.college + ",country=" + this.country + ",province=" + this.province + ",city=" + this.city + ",postCode=" + this.postCode + ",address=" + this.address + ",isBlock=" + this.isBlock + ",isSpecialCareOpen=" + this.isSpecialCareOpen + ",isSpecialCareZone=" + this.isSpecialCareZone + ",ringId=" + this.ringId + ",regTime=" + this.regTime + ",interest=" + this.interest + ",termType=" + this.termType + ",labels=" + this.labels + ",qqLevel=" + this.qqLevel + ",isHideQQLevel=" + this.isHideQQLevel + ",privilegeIcon=" + this.privilegeIcon + ",isHidePrivilegeIcon=" + this.isHidePrivilegeIcon + ",photoWall=" + this.photoWall + ",vipFlag=" + this.vipFlag + ",yearVipFlag=" + this.yearVipFlag + ",svipFlag=" + this.svipFlag + ",vipLevel=" + this.vipLevel + ",status=" + this.status + ",qidianMasterFlag=" + this.qidianMasterFlag + ",qidianCrewFlag=" + this.qidianCrewFlag + ",qidianCrewFlag2=" + this.qidianCrewFlag2 + ",extStatus=" + this.extStatus + ",recommendImgFlag=" + this.recommendImgFlag + ",disableEmojiShortCuts=" + this.disableEmojiShortCuts + ",}";
    }

    public ProfileDetailInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, long j2, int i5, int i6, int i7, String str7, int i8, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, boolean z2, boolean z3, String str17, int i9, String str18, int i10, ArrayList<String> arrayList, QQLevel qQLevel, int i11, PrivilegeIcon privilegeIcon, int i12, ProfilePicInfo profilePicInfo, boolean z4, boolean z5, boolean z6, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.qid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.remark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.longNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.homeTown = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.pos = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eMail = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.phoneNum = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.college = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.country = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.province = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.city = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.postCode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.address = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.ringId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.interest = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labels = new ArrayList<>();
        this.qqLevel = new QQLevel();
        this.privilegeIcon = new PrivilegeIcon();
        this.photoWall = new ProfilePicInfo();
        this.uid = str;
        this.qid = str2;
        this.uin = j;
        this.nick = str3;
        this.remark = str4;
        this.longNick = str5;
        this.avatarUrl = str6;
        this.birthdayYear = i;
        this.birthdayMonth = i2;
        this.birthdayDay = i3;
        this.sex = i4;
        this.topTime = j2;
        this.constellation = i5;
        this.shengXiao = i6;
        this.kBloodType = i7;
        this.homeTown = str7;
        this.makeFriendCareer = i8;
        this.pos = str8;
        this.eMail = str9;
        this.phoneNum = str10;
        this.college = str11;
        this.country = str12;
        this.province = str13;
        this.city = str14;
        this.postCode = str15;
        this.address = str16;
        this.isBlock = z;
        this.isSpecialCareOpen = z2;
        this.isSpecialCareZone = z3;
        this.ringId = str17;
        this.regTime = i9;
        this.interest = str18;
        this.termType = i10;
        this.labels = arrayList;
        this.qqLevel = qQLevel;
        this.isHideQQLevel = i11;
        this.privilegeIcon = privilegeIcon;
        this.isHidePrivilegeIcon = i12;
        this.photoWall = profilePicInfo;
        this.vipFlag = z4;
        this.yearVipFlag = z5;
        this.svipFlag = z6;
        this.vipLevel = i13;
        this.status = i14;
        this.qidianMasterFlag = i15;
        this.qidianCrewFlag = i16;
        this.qidianCrewFlag2 = i17;
        this.extStatus = i18;
        this.recommendImgFlag = i19;
        this.disableEmojiShortCuts = i20;
    }
}
