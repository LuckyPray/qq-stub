package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NewAccount.class */
public final class NewAccount implements IKernelModel {
    public String country;
    public String phone;

    public NewAccount() {
        this.country = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.phone = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public String toString() {
        return "NewAccount{country=" + this.country + ",phone=" + this.phone + ",}";
    }

    public NewAccount(String str, String str2) {
        this.country = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.phone = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.country = str;
        this.phone = str2;
    }
}
