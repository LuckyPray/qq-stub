package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ReqToFriend.class */
public final class ReqToFriend {
    public int addFriendSetting;
    public String answer;
    public String buddyUid;
    public long buddyUin;
    public Integer defaultCatgory;
    public String phoneNumber;
    public String remark;
    public Verify securityVerify;
    public int sourceID;
    public int sourceSubID;
    public String verifyInfo;

    public ReqToFriend() {
        this.buddyUid = "";
        this.phoneNumber = "";
    }

    public int getAddFriendSetting() {
        return this.addFriendSetting;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getBuddyUid() {
        return this.buddyUid;
    }

    public long getBuddyUin() {
        return this.buddyUin;
    }

    public Integer getDefaultCatgory() {
        return this.defaultCatgory;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getRemark() {
        return this.remark;
    }

    public Verify getSecurityVerify() {
        return this.securityVerify;
    }

    public int getSourceID() {
        return this.sourceID;
    }

    public int getSourceSubID() {
        return this.sourceSubID;
    }

    public String getVerifyInfo() {
        return this.verifyInfo;
    }

    public void setAddFriendSetting(int i) {
        this.addFriendSetting = i;
    }

    public void setAnswer(String str) {
        this.answer = str;
    }

    public void setBuddyUid(String str) {
        this.buddyUid = str;
    }

    public void setBuddyUin(long j) {
        this.buddyUin = j;
    }

    public void setDefaultCatgory(Integer num) {
        this.defaultCatgory = num;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setSecurityVerify(Verify verify) {
        this.securityVerify = verify;
    }

    public void setSourceID(int i) {
        this.sourceID = i;
    }

    public void setSourceSubID(int i) {
        this.sourceSubID = i;
    }

    public void setVerifyInfo(String str) {
        this.verifyInfo = str;
    }

    public String toString() {
        return "ReqToFriend{buddyUin=" + this.buddyUin + ",buddyUid=" + this.buddyUid + ",phoneNumber=" + this.phoneNumber + ",addFriendSetting=" + this.addFriendSetting + ",answer=" + this.answer + ",remark=" + this.remark + ",defaultCatgory=" + this.defaultCatgory + ",verifyInfo=" + this.verifyInfo + ",securityVerify=" + this.securityVerify + ",sourceID=" + this.sourceID + ",sourceSubID=" + this.sourceSubID + ",}";
    }

    public ReqToFriend(long j, String str, String str2, int i, String str3, String str4, Integer num, String str5, Verify verify, int i2, int i3) {
        this.buddyUid = "";
        this.phoneNumber = "";
        this.buddyUin = j;
        this.buddyUid = str;
        this.phoneNumber = str2;
        this.addFriendSetting = i;
        this.answer = str3;
        this.remark = str4;
        this.defaultCatgory = num;
        this.verifyInfo = str5;
        this.securityVerify = verify;
        this.sourceID = i2;
        this.sourceSubID = i3;
    }
}
