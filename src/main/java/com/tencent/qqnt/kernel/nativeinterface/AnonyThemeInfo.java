package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AnonyThemeInfo.class */
public final class AnonyThemeInfo {
    public String themeDesc;
    public int themeFlag;
    public String themeIconUrl;
    public int themeId;
    public String themeName;

    public AnonyThemeInfo() {
        this.themeName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.themeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.themeIconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getThemeDesc() {
        return this.themeDesc;
    }

    public int getThemeFlag() {
        return this.themeFlag;
    }

    public String getThemeIconUrl() {
        return this.themeIconUrl;
    }

    public int getThemeId() {
        return this.themeId;
    }

    public String getThemeName() {
        return this.themeName;
    }

    public String toString() {
        return "AnonyThemeInfo{themeId=" + this.themeId + ",themeName=" + this.themeName + ",themeDesc=" + this.themeDesc + ",themeIconUrl=" + this.themeIconUrl + ",themeFlag=" + this.themeFlag + ",}";
    }

    public AnonyThemeInfo(int i, String str, String str2, String str3, int i2) {
        this.themeName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.themeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.themeIconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.themeId = i;
        this.themeName = str;
        this.themeDesc = str2;
        this.themeIconUrl = str3;
        this.themeFlag = i2;
    }
}
