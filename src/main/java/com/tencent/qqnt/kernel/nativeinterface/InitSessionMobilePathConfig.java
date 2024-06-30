package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InitSessionMobilePathConfig.class */
public final class InitSessionMobilePathConfig {
    public String mobileQqFilePath;
    public String mobileQqMarketPath;
    public String mobileQqPicPath;
    public String mobileQqPttPath;
    public String mobileQqVideoPath;

    public InitSessionMobilePathConfig() {
        this.mobileQqPicPath = "";
        this.mobileQqVideoPath = "";
        this.mobileQqPttPath = "";
        this.mobileQqFilePath = "";
        this.mobileQqMarketPath = "";
    }

    public String getMobileQqFilePath() {
        return this.mobileQqFilePath;
    }

    public String getMobileQqMarketPath() {
        return this.mobileQqMarketPath;
    }

    public String getMobileQqPicPath() {
        return this.mobileQqPicPath;
    }

    public String getMobileQqPttPath() {
        return this.mobileQqPttPath;
    }

    public String getMobileQqVideoPath() {
        return this.mobileQqVideoPath;
    }

    public String toString() {
        return "InitSessionMobilePathConfig{mobileQqPicPath=" + this.mobileQqPicPath + ",mobileQqVideoPath=" + this.mobileQqVideoPath + ",mobileQqPttPath=" + this.mobileQqPttPath + ",mobileQqFilePath=" + this.mobileQqFilePath + ",mobileQqMarketPath=" + this.mobileQqMarketPath + ",}";
    }

    public InitSessionMobilePathConfig(String str, String str2, String str3, String str4, String str5) {
        this.mobileQqPicPath = "";
        this.mobileQqVideoPath = "";
        this.mobileQqPttPath = "";
        this.mobileQqFilePath = "";
        this.mobileQqMarketPath = "";
        this.mobileQqPicPath = str;
        this.mobileQqVideoPath = str2;
        this.mobileQqPttPath = str3;
        this.mobileQqFilePath = str4;
        this.mobileQqMarketPath = str5;
    }
}
