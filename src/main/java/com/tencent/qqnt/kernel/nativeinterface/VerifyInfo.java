package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/VerifyInfo.class */
public final class VerifyInfo implements IKernelModel {
    public String countryNew;
    public String countryOld;
    public String phoneNew;
    public String phoneOld;
    public String smsCode;

    public VerifyInfo() {
        this.countryOld = "";
        this.phoneOld = "";
        this.countryNew = "";
        this.phoneNew = "";
        this.smsCode = "";
    }

    public String getCountryNew() {
        return this.countryNew;
    }

    public String getCountryOld() {
        return this.countryOld;
    }

    public String getPhoneNew() {
        return this.phoneNew;
    }

    public String getPhoneOld() {
        return this.phoneOld;
    }

    public String getSmsCode() {
        return this.smsCode;
    }

    public void setCountryNew(String str) {
        this.countryNew = str;
    }

    public void setCountryOld(String str) {
        this.countryOld = str;
    }

    public void setPhoneNew(String str) {
        this.phoneNew = str;
    }

    public void setPhoneOld(String str) {
        this.phoneOld = str;
    }

    public void setSmsCode(String str) {
        this.smsCode = str;
    }

    public String toString() {
        return "VerifyInfo{countryOld=" + this.countryOld + ",phoneOld=" + this.phoneOld + ",countryNew=" + this.countryNew + ",phoneNew=" + this.phoneNew + ",smsCode=" + this.smsCode + ",}";
    }

    public VerifyInfo(String str, String str2, String str3, String str4, String str5) {
        this.countryOld = "";
        this.phoneOld = "";
        this.countryNew = "";
        this.phoneNew = "";
        this.smsCode = "";
        this.countryOld = str;
        this.phoneOld = str2;
        this.countryNew = str3;
        this.phoneNew = str4;
        this.smsCode = str5;
    }
}
