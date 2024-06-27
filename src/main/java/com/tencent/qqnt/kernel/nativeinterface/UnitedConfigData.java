package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UnitedConfigData.class */
public final class UnitedConfigData {
    public int code;
    public String content;
    public String group;
    public Boolean isCdn;
    public boolean isSwitchOn;
    public String resourcePath;

    public UnitedConfigData() {
        this.group = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getCode() {
        return this.code;
    }

    public String getContent() {
        return this.content;
    }

    public String getGroup() {
        return this.group;
    }

    public Boolean getIsCdn() {
        return this.isCdn;
    }

    public boolean getIsSwitchOn() {
        return this.isSwitchOn;
    }

    public String getResourcePath() {
        return this.resourcePath;
    }

    public String toString() {
        return "UnitedConfigData{group=" + this.group + ",content=" + this.content + ",isSwitchOn=" + this.isSwitchOn + ",code=" + this.code + ",isCdn=" + this.isCdn + ",resourcePath=" + this.resourcePath + ",}";
    }

    public UnitedConfigData(String str, String str2, boolean z, int i, Boolean bool, String str3) {
        this.group = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.group = str;
        this.content = str2;
        this.isSwitchOn = z;
        this.code = i;
        this.isCdn = bool;
        this.resourcePath = str3;
    }
}
