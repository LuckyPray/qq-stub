package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ServiceAssistantAppSwitch.class */
public final class ServiceAssistantAppSwitch {
    public long appId;
    public int appType;
    public String logo;
    public String name;
    public int switchValue;

    public ServiceAssistantAppSwitch() {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.logo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getAppId() {
        return this.appId;
    }

    public int getAppType() {
        return this.appType;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getName() {
        return this.name;
    }

    public int getSwitchValue() {
        return this.switchValue;
    }

    public String toString() {
        return "ServiceAssistantAppSwitch{appId=" + this.appId + ",appType=" + this.appType + ",switchValue=" + this.switchValue + ",name=" + this.name + ",logo=" + this.logo + ",}";
    }

    public ServiceAssistantAppSwitch(long j, int i, int i2, String str, String str2) {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.logo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.appId = j;
        this.appType = i;
        this.switchValue = i2;
        this.name = str;
        this.logo = str2;
    }
}
