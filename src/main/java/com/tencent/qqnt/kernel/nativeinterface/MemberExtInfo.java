package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MemberExtInfo.class */
public final class MemberExtInfo {
    public int activeDay;
    public int cmdUinFlagExt3Grocery;
    public int level;
    public int point;
    public long specialTitleExpireTime;
    public long uin;
    public String strName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String specialTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public byte[] msgNeedField = new byte[0];
    public ArrayList<MemberIcon> memberIconList = new ArrayList<>();

    public int getActiveDay() {
        return this.activeDay;
    }

    public int getCmdUinFlagExt3Grocery() {
        return this.cmdUinFlagExt3Grocery;
    }

    public int getLevel() {
        return this.level;
    }

    public ArrayList<MemberIcon> getMemberIconList() {
        return this.memberIconList;
    }

    public byte[] getMsgNeedField() {
        return this.msgNeedField;
    }

    public String getNickName() {
        return this.nickName;
    }

    public int getPoint() {
        return this.point;
    }

    public String getSpecialTitle() {
        return this.specialTitle;
    }

    public long getSpecialTitleExpireTime() {
        return this.specialTitleExpireTime;
    }

    public String getStrName() {
        return this.strName;
    }

    public long getUin() {
        return this.uin;
    }

    public void setActiveDay(int i) {
        this.activeDay = i;
    }

    public void setCmdUinFlagExt3Grocery(int i) {
        this.cmdUinFlagExt3Grocery = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setMemberIconList(ArrayList<MemberIcon> arrayList) {
        this.memberIconList = arrayList;
    }

    public void setMsgNeedField(byte[] bArr) {
        this.msgNeedField = bArr;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPoint(int i) {
        this.point = i;
    }

    public void setSpecialTitle(String str) {
        this.specialTitle = str;
    }

    public void setSpecialTitleExpireTime(long j) {
        this.specialTitleExpireTime = j;
    }

    public void setStrName(String str) {
        this.strName = str;
    }

    public void setUin(long j) {
        this.uin = j;
    }

    public String toString() {
        return "MemberExtInfo{uin=" + this.uin + ",point=" + this.point + ",activeDay=" + this.activeDay + ",level=" + this.level + ",strName=" + this.strName + ",nickName=" + this.nickName + ",specialTitle=" + this.specialTitle + ",specialTitleExpireTime=" + this.specialTitleExpireTime + ",msgNeedField=" + this.msgNeedField + ",cmdUinFlagExt3Grocery=" + this.cmdUinFlagExt3Grocery + ",memberIconList=" + this.memberIconList + ",}";
    }
}
