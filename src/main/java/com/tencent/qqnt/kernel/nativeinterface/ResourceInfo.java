package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ResourceInfo.class */
public final class ResourceInfo {
    public String grayUrl;
    public String iconCartoonMd5;
    public String iconCartoonUrl;
    public String iconDynamicUrl;
    public String iconName;
    public String iconStaticUrl;
    public Integer playCartoon;

    public ResourceInfo() {
    }

    public String getGrayUrl() {
        return this.grayUrl;
    }

    public String getIconCartoonMd5() {
        return this.iconCartoonMd5;
    }

    public String getIconCartoonUrl() {
        return this.iconCartoonUrl;
    }

    public String getIconDynamicUrl() {
        return this.iconDynamicUrl;
    }

    public String getIconName() {
        return this.iconName;
    }

    public String getIconStaticUrl() {
        return this.iconStaticUrl;
    }

    public Integer getPlayCartoon() {
        return this.playCartoon;
    }

    public String toString() {
        return "ResourceInfo{iconStaticUrl=" + this.iconStaticUrl + ",iconDynamicUrl=" + this.iconDynamicUrl + ",iconCartoonUrl=" + this.iconCartoonUrl + ",iconCartoonMd5=" + this.iconCartoonMd5 + ",iconName=" + this.iconName + ",playCartoon=" + this.playCartoon + ",grayUrl=" + this.grayUrl + ",}";
    }

    public ResourceInfo(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        this.iconStaticUrl = str;
        this.iconDynamicUrl = str2;
        this.iconCartoonUrl = str3;
        this.iconCartoonMd5 = str4;
        this.iconName = str5;
        this.playCartoon = num;
        this.grayUrl = str6;
    }
}
