package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PrivilegeInfo.class */
public final class PrivilegeInfo {
    public String deluxeIconPath;
    public String deluxeIconUrl;
    public int flag;
    public String iconPath;
    public String iconUrl;
    public int isBig;
    public String jumpUrl;
    public int level;
    public int type;

    public PrivilegeInfo() {
        this.jumpUrl = "";
        this.iconUrl = "";
        this.iconPath = "";
        this.deluxeIconUrl = "";
        this.deluxeIconPath = "";
    }

    public String getDeluxeIconPath() {
        return this.deluxeIconPath;
    }

    public String getDeluxeIconUrl() {
        return this.deluxeIconUrl;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getIsBig() {
        return this.isBig;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public int getLevel() {
        return this.level;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "PrivilegeInfo{jumpUrl=" + this.jumpUrl + ",iconUrl=" + this.iconUrl + ",iconPath=" + this.iconPath + ",deluxeIconUrl=" + this.deluxeIconUrl + ",deluxeIconPath=" + this.deluxeIconPath + ",isBig=" + this.isBig + ",type=" + this.type + ",level=" + this.level + ",flag=" + this.flag + ",}";
    }

    public PrivilegeInfo(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4) {
        this.jumpUrl = "";
        this.iconUrl = "";
        this.iconPath = "";
        this.deluxeIconUrl = "";
        this.deluxeIconPath = "";
        this.jumpUrl = str;
        this.iconUrl = str2;
        this.iconPath = str3;
        this.deluxeIconUrl = str4;
        this.deluxeIconPath = str5;
        this.isBig = i;
        this.type = i2;
        this.level = i3;
        this.flag = i4;
    }
}
