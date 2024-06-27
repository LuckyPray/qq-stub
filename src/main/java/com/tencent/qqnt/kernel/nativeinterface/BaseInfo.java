package com.tencent.qqnt.kernel.nativeinterface;

import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BaseInfo.class */
public final class BaseInfo implements Serializable {
    public int age;
    public int birthdayDay;
    public int birthdayMonth;
    public int birthdayYear;
    public int categoryId;
    public String eMail;
    public String longNick;
    public String phoneNum;
    public String qid;
    public byte[] richBuffer;
    public int richTime;
    long serialVersionUID;
    public int sex;

    public BaseInfo() {
        this.serialVersionUID = 1L;
        this.qid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.longNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eMail = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.phoneNum = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.richBuffer = new byte[0];
    }

    public int getAge() {
        return this.age;
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

    public String getEMail() {
        return this.eMail;
    }

    public String getLongNick() {
        return this.longNick;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public String getQid() {
        return this.qid;
    }

    public byte[] getRichBuffer() {
        return this.richBuffer;
    }

    public int getRichTime() {
        return this.richTime;
    }

    public int getSex() {
        return this.sex;
    }

    public String toString() {
        return "BaseInfo{qid=" + this.qid + ",longNick=" + this.longNick + ",birthdayYear=" + this.birthdayYear + ",birthdayMonth=" + this.birthdayMonth + ",birthdayDay=" + this.birthdayDay + ",age=" + this.age + ",sex=" + this.sex + ",eMail=" + this.eMail + ",phoneNum=" + this.phoneNum + ",categoryId=" + this.categoryId + ",richTime=" + this.richTime + ",richBuffer=" + this.richBuffer + ",}";
    }

    public BaseInfo(String str, String str2, int i, int i2, int i3, int i4, int i5, String str3, String str4, int i6, int i7, byte[] bArr) {
        this.serialVersionUID = 1L;
        this.qid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.longNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eMail = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.phoneNum = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.richBuffer = new byte[0];
        this.qid = str;
        this.longNick = str2;
        this.birthdayYear = i;
        this.birthdayMonth = i2;
        this.birthdayDay = i3;
        this.age = i4;
        this.sex = i5;
        this.eMail = str3;
        this.phoneNum = str4;
        this.categoryId = i6;
        this.richTime = i7;
        this.richBuffer = bArr;
    }
}
