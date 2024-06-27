package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/WrapperEngineGlobalConfig.class */
public final class WrapperEngineGlobalConfig implements IKernelModel {
    public int appType;
    public String appVersion;
    public InitGlobalPathConfig globalPathConfig;
    public String osVersion;
    public int platformType;
    public String qua;
    public ThumbConfig thumbConfig;
    public boolean useXlog;

    public WrapperEngineGlobalConfig() {
        this.appVersion = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.osVersion = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.globalPathConfig = new InitGlobalPathConfig();
        this.qua = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getAppType() {
        return this.appType;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public InitGlobalPathConfig getGlobalPathConfig() {
        return this.globalPathConfig;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public int getPlatformType() {
        return this.platformType;
    }

    public String getQua() {
        return this.qua;
    }

    public ThumbConfig getThumbConfig() {
        return this.thumbConfig;
    }

    public boolean getUseXlog() {
        return this.useXlog;
    }

    public void setAppType(int i) {
        this.appType = i;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setGlobalPathConfig(InitGlobalPathConfig initGlobalPathConfig) {
        this.globalPathConfig = initGlobalPathConfig;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setPlatformType(int i) {
        this.platformType = i;
    }

    public void setQua(String str) {
        this.qua = str;
    }

    public void setThumbConfig(ThumbConfig thumbConfig) {
        this.thumbConfig = thumbConfig;
    }

    public void setUseXlog(boolean z) {
        this.useXlog = z;
    }

    public String toString() {
        return "WrapperEngineGlobalConfig{platformType=" + this.platformType + ",appType=" + this.appType + ",appVersion=" + this.appVersion + ",osVersion=" + this.osVersion + ",globalPathConfig=" + this.globalPathConfig + ",thumbConfig=" + this.thumbConfig + ",useXlog=" + this.useXlog + ",qua=" + this.qua + ",}";
    }

    public WrapperEngineGlobalConfig(int i, int i2, String str, String str2, InitGlobalPathConfig initGlobalPathConfig, ThumbConfig thumbConfig, boolean z, String str3) {
        this.appVersion = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.osVersion = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.globalPathConfig = new InitGlobalPathConfig();
        this.qua = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.platformType = i;
        this.appType = i2;
        this.appVersion = str;
        this.osVersion = str2;
        this.globalPathConfig = initGlobalPathConfig;
        this.thumbConfig = thumbConfig;
        this.useXlog = z;
        this.qua = str3;
    }
}
