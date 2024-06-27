package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PrivacySetting.class */
public final class PrivacySetting implements IKernelModel {
    public Boolean addMeByGroup;
    public Boolean addMeByMobile;
    public Boolean addMeByNTCode;

    public PrivacySetting() {
    }

    public Boolean getAddMeByGroup() {
        return this.addMeByGroup;
    }

    public Boolean getAddMeByMobile() {
        return this.addMeByMobile;
    }

    public Boolean getAddMeByNTCode() {
        return this.addMeByNTCode;
    }

    public void setAddMeByGroup(Boolean bool) {
        this.addMeByGroup = bool;
    }

    public void setAddMeByMobile(Boolean bool) {
        this.addMeByMobile = bool;
    }

    public void setAddMeByNTCode(Boolean bool) {
        this.addMeByNTCode = bool;
    }

    public String toString() {
        return "PrivacySetting{addMeByMobile=" + this.addMeByMobile + ",addMeByNTCode=" + this.addMeByNTCode + ",addMeByGroup=" + this.addMeByGroup + ",}";
    }

    public PrivacySetting(Boolean bool, Boolean bool2, Boolean bool3) {
        this.addMeByMobile = bool;
        this.addMeByNTCode = bool2;
        this.addMeByGroup = bool3;
    }
}
