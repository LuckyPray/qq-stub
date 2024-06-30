package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RDeliveryConfig.class */
public final class RDeliveryConfig implements IKernelModel {
    public String appId;
    public String appKey;
    public String appVersion;
    public String bundleId;
    public ArrayList<String> fixedAfterHitKeys;
    public String language;
    public String logicEnvironment;
    public String osVersion;
    public int platform;
    public String sdkVersion;
    public String serverUrl;
    public int systemId;
    public String userId;

    public RDeliveryConfig() {
        this.appKey = "";
        this.appId = "";
        this.logicEnvironment = "";
        this.language = "";
        this.sdkVersion = "";
        this.userId = "";
        this.appVersion = "";
        this.osVersion = "";
        this.bundleId = "";
        this.serverUrl = "";
        this.fixedAfterHitKeys = new ArrayList<>();
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getBundleId() {
        return this.bundleId;
    }

    public ArrayList<String> getFixedAfterHitKeys() {
        return this.fixedAfterHitKeys;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLogicEnvironment() {
        return this.logicEnvironment;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getServerUrl() {
        return this.serverUrl;
    }

    public int getSystemId() {
        return this.systemId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setBundleId(String str) {
        this.bundleId = str;
    }

    public void setFixedAfterHitKeys(ArrayList<String> arrayList) {
        this.fixedAfterHitKeys = arrayList;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLogicEnvironment(String str) {
        this.logicEnvironment = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setServerUrl(String str) {
        this.serverUrl = str;
    }

    public void setSystemId(int i) {
        this.systemId = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "RDeliveryConfig{appKey=" + this.appKey + ",systemId=" + this.systemId + ",appId=" + this.appId + ",logicEnvironment=" + this.logicEnvironment + ",platform=" + this.platform + ",language=" + this.language + ",sdkVersion=" + this.sdkVersion + ",userId=" + this.userId + ",appVersion=" + this.appVersion + ",osVersion=" + this.osVersion + ",bundleId=" + this.bundleId + ",serverUrl=" + this.serverUrl + ",fixedAfterHitKeys=" + this.fixedAfterHitKeys + ",}";
    }

    public RDeliveryConfig(String str, int i, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList<String> arrayList) {
        this.appKey = "";
        this.appId = "";
        this.logicEnvironment = "";
        this.language = "";
        this.sdkVersion = "";
        this.userId = "";
        this.appVersion = "";
        this.osVersion = "";
        this.bundleId = "";
        this.serverUrl = "";
        this.fixedAfterHitKeys = new ArrayList<>();
        this.appKey = str;
        this.systemId = i;
        this.appId = str2;
        this.logicEnvironment = str3;
        this.platform = i2;
        this.language = str4;
        this.sdkVersion = str5;
        this.userId = str6;
        this.appVersion = str7;
        this.osVersion = str8;
        this.bundleId = str9;
        this.serverUrl = str10;
        this.fixedAfterHitKeys = arrayList;
    }
}
