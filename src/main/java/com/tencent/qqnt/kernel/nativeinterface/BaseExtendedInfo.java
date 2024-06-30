package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BaseExtendedInfo.class */
public final class BaseExtendedInfo {
    public String address;
    public String city;
    public String college;
    public int constellation;
    public String country;
    public String homeTown;
    public String interest;
    public int kBloodType;
    public ArrayList<String> labels;
    public int makeFriendCareer;
    public String pos;
    public String postCode;
    public String province;
    public QQLevel qqLevel;
    public int regTime;
    public int shengXiao;

    public BaseExtendedInfo() {
        this.homeTown = "";
        this.pos = "";
        this.college = "";
        this.country = "";
        this.province = "";
        this.city = "";
        this.postCode = "";
        this.address = "";
        this.interest = "";
        this.labels = new ArrayList<>();
        this.qqLevel = new QQLevel();
    }

    public String getAddress() {
        return this.address;
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

    public String getHomeTown() {
        return this.homeTown;
    }

    public String getInterest() {
        return this.interest;
    }

    public int getKBloodType() {
        return this.kBloodType;
    }

    public ArrayList<String> getLabels() {
        return this.labels;
    }

    public int getMakeFriendCareer() {
        return this.makeFriendCareer;
    }

    public String getPos() {
        return this.pos;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getProvince() {
        return this.province;
    }

    public QQLevel getQqLevel() {
        return this.qqLevel;
    }

    public int getRegTime() {
        return this.regTime;
    }

    public int getShengXiao() {
        return this.shengXiao;
    }

    public String toString() {
        return "BaseExtendedInfo{constellation=" + this.constellation + ",shengXiao=" + this.shengXiao + ",kBloodType=" + this.kBloodType + ",homeTown=" + this.homeTown + ",makeFriendCareer=" + this.makeFriendCareer + ",pos=" + this.pos + ",college=" + this.college + ",country=" + this.country + ",province=" + this.province + ",city=" + this.city + ",postCode=" + this.postCode + ",address=" + this.address + ",regTime=" + this.regTime + ",interest=" + this.interest + ",labels=" + this.labels + ",qqLevel=" + this.qqLevel + ",}";
    }

    public BaseExtendedInfo(int i, int i2, int i3, String str, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i5, String str9, ArrayList<String> arrayList, QQLevel qQLevel) {
        this.homeTown = "";
        this.pos = "";
        this.college = "";
        this.country = "";
        this.province = "";
        this.city = "";
        this.postCode = "";
        this.address = "";
        this.interest = "";
        this.labels = new ArrayList<>();
        this.qqLevel = new QQLevel();
        this.constellation = i;
        this.shengXiao = i2;
        this.kBloodType = i3;
        this.homeTown = str;
        this.makeFriendCareer = i4;
        this.pos = str2;
        this.college = str3;
        this.country = str4;
        this.province = str5;
        this.city = str6;
        this.postCode = str7;
        this.address = str8;
        this.regTime = i5;
        this.interest = str9;
        this.labels = arrayList;
        this.qqLevel = qQLevel;
    }
}
