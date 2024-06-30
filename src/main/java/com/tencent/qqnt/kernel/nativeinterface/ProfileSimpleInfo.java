package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ProfileSimpleInfo.class */
public final class ProfileSimpleInfo {
    public String avatarUrl;
    public int birthdayDay;
    public int birthdayMonth;
    public int birthdayYear;
    public int categoryId;
    public int extStatus;
    public boolean isBlock;
    public boolean isMsgDisturb;
    public boolean isSpecialCareOpen;
    public boolean isSpecialCareZone;
    public boolean isZPlanCoupleOpen;
    public String longNick;
    public String nick;
    public boolean onlyChat;
    public String qid;
    public int qidianCrewFlag;
    public int qidianCrewFlag2;
    public int qidianMasterFlag;
    public boolean qzoneNotWatch;
    public boolean qzoneNotWatched;
    public String remark;
    public String ringId;
    public int sex;
    public int status;
    public int studyFlag;
    public boolean svipFlag;
    public int teenagerFlag;
    public long topTime;
    public String uid;
    public long uin;
    public boolean vipFlag;
    public int vipLevel;
    public boolean yearVipFlag;
    public int zplanCoupleSceneId;

    public ProfileSimpleInfo() {
        this.uid = "";
        this.qid = "";
        this.nick = "";
        this.remark = "";
        this.longNick = "";
        this.avatarUrl = "";
        this.ringId = "";
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

    public int getCategoryId() {
        return this.categoryId;
    }

    public int getExtStatus() {
        return this.extStatus;
    }

    public boolean getIsBlock() {
        return this.isBlock;
    }

    public boolean getIsMsgDisturb() {
        return this.isMsgDisturb;
    }

    public boolean getIsSpecialCareOpen() {
        return this.isSpecialCareOpen;
    }

    public boolean getIsSpecialCareZone() {
        return this.isSpecialCareZone;
    }

    public boolean getIsZPlanCoupleOpen() {
        return this.isZPlanCoupleOpen;
    }

    public String getLongNick() {
        return this.longNick;
    }

    public String getNick() {
        return this.nick;
    }

    public boolean getOnlyChat() {
        return this.onlyChat;
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

    public boolean getQzoneNotWatch() {
        return this.qzoneNotWatch;
    }

    public boolean getQzoneNotWatched() {
        return this.qzoneNotWatched;
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

    public int getStatus() {
        return this.status;
    }

    public int getStudyFlag() {
        return this.studyFlag;
    }

    public boolean getSvipFlag() {
        return this.svipFlag;
    }

    public int getTeenagerFlag() {
        return this.teenagerFlag;
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

    public int getZplanCoupleSceneId() {
        return this.zplanCoupleSceneId;
    }

    public String toString() {
        return "ProfileSimpleInfo{uid=" + this.uid + ",qid=" + this.qid + ",uin=" + this.uin + ",nick=" + this.nick + ",remark=" + this.remark + ",longNick=" + this.longNick + ",avatarUrl=" + this.avatarUrl + ",birthdayYear=" + this.birthdayYear + ",birthdayMonth=" + this.birthdayMonth + ",birthdayDay=" + this.birthdayDay + ",sex=" + this.sex + ",topTime=" + this.topTime + ",isBlock=" + this.isBlock + ",isMsgDisturb=" + this.isMsgDisturb + ",isSpecialCareOpen=" + this.isSpecialCareOpen + ",isSpecialCareZone=" + this.isSpecialCareZone + ",ringId=" + this.ringId + ",status=" + this.status + ",qidianMasterFlag=" + this.qidianMasterFlag + ",qidianCrewFlag=" + this.qidianCrewFlag + ",qidianCrewFlag2=" + this.qidianCrewFlag2 + ",extStatus=" + this.extStatus + ",categoryId=" + this.categoryId + ",onlyChat=" + this.onlyChat + ",qzoneNotWatch=" + this.qzoneNotWatch + ",qzoneNotWatched=" + this.qzoneNotWatched + ",vipFlag=" + this.vipFlag + ",yearVipFlag=" + this.yearVipFlag + ",svipFlag=" + this.svipFlag + ",vipLevel=" + this.vipLevel + ",isZPlanCoupleOpen=" + this.isZPlanCoupleOpen + ",zplanCoupleSceneId=" + this.zplanCoupleSceneId + ",teenagerFlag=" + this.teenagerFlag + ",studyFlag=" + this.studyFlag + ",}";
    }

    public ProfileSimpleInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, long j2, boolean z, boolean z2, boolean z3, boolean z4, String str7, int i5, int i6, int i7, int i8, int i9, int i10, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i11, boolean z11, int i12, int i13, int i14) {
        this.uid = "";
        this.qid = "";
        this.nick = "";
        this.remark = "";
        this.longNick = "";
        this.avatarUrl = "";
        this.ringId = "";
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
        this.isBlock = z;
        this.isMsgDisturb = z2;
        this.isSpecialCareOpen = z3;
        this.isSpecialCareZone = z4;
        this.ringId = str7;
        this.status = i5;
        this.qidianMasterFlag = i6;
        this.qidianCrewFlag = i7;
        this.qidianCrewFlag2 = i8;
        this.extStatus = i9;
        this.categoryId = i10;
        this.onlyChat = z5;
        this.qzoneNotWatch = z6;
        this.qzoneNotWatched = z7;
        this.vipFlag = z8;
        this.yearVipFlag = z9;
        this.svipFlag = z10;
        this.vipLevel = i11;
        this.isZPlanCoupleOpen = z11;
        this.zplanCoupleSceneId = i12;
        this.teenagerFlag = i13;
        this.studyFlag = i14;
    }
}
