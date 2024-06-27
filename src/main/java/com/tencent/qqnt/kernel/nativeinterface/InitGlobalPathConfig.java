package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InitGlobalPathConfig.class */
public final class InitGlobalPathConfig {
    public String basePathPrefix;
    public String desktopGlobalPath;
    public String mobileGlobalDBPath;
    public String mobileGlobalDataPath;
    public String mobileGlobalTempPath;

    public InitGlobalPathConfig() {
    }

    public String getBasePathPrefix() {
        return this.basePathPrefix;
    }

    public String getDesktopGlobalPath() {
        return this.desktopGlobalPath;
    }

    public String getMobileGlobalDBPath() {
        return this.mobileGlobalDBPath;
    }

    public String getMobileGlobalDataPath() {
        return this.mobileGlobalDataPath;
    }

    public String getMobileGlobalTempPath() {
        return this.mobileGlobalTempPath;
    }

    public String toString() {
        return "InitGlobalPathConfig{desktopGlobalPath=" + this.desktopGlobalPath + ",mobileGlobalDBPath=" + this.mobileGlobalDBPath + ",mobileGlobalDataPath=" + this.mobileGlobalDataPath + ",mobileGlobalTempPath=" + this.mobileGlobalTempPath + ",basePathPrefix=" + this.basePathPrefix + ",}";
    }

    public InitGlobalPathConfig(String str, String str2, String str3, String str4, String str5) {
        this.desktopGlobalPath = str;
        this.mobileGlobalDBPath = str2;
        this.mobileGlobalDataPath = str3;
        this.mobileGlobalTempPath = str4;
        this.basePathPrefix = str5;
    }
}
