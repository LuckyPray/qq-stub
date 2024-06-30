package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ScanQrRspInfo.class */
public final class ScanQrRspInfo {
    public AutoLoginInfo autoLogin;
    public String dstAppName;
    public OpenAppInfo dstOpenAppInfo;
    public String loginCity;
    public String loginDevName;
    public String loginDevType;
    public LoginPlat loginPlat;
    public boolean needA1;
    public SecCheckResult secCheckResult;
    public TipsCtrl tips;

    public ScanQrRspInfo() {
        this.dstAppName = "";
        this.loginCity = "";
        this.loginDevType = "";
        this.loginDevName = "";
        this.dstOpenAppInfo = new OpenAppInfo();
        this.secCheckResult = SecCheckResult.values()[0];
        this.tips = new TipsCtrl();
        this.autoLogin = new AutoLoginInfo();
        this.loginPlat = LoginPlat.values()[0];
    }

    public AutoLoginInfo getAutoLogin() {
        return this.autoLogin;
    }

    public String getDstAppName() {
        return this.dstAppName;
    }

    public OpenAppInfo getDstOpenAppInfo() {
        return this.dstOpenAppInfo;
    }

    public String getLoginCity() {
        return this.loginCity;
    }

    public String getLoginDevName() {
        return this.loginDevName;
    }

    public String getLoginDevType() {
        return this.loginDevType;
    }

    public LoginPlat getLoginPlat() {
        return this.loginPlat;
    }

    public boolean getNeedA1() {
        return this.needA1;
    }

    public SecCheckResult getSecCheckResult() {
        return this.secCheckResult;
    }

    public TipsCtrl getTips() {
        return this.tips;
    }

    public String toString() {
        return "ScanQrRspInfo{dstAppName=" + this.dstAppName + ",loginCity=" + this.loginCity + ",loginDevType=" + this.loginDevType + ",loginDevName=" + this.loginDevName + ",needA1=" + this.needA1 + ",dstOpenAppInfo=" + this.dstOpenAppInfo + ",secCheckResult=" + this.secCheckResult + ",tips=" + this.tips + ",autoLogin=" + this.autoLogin + ",loginPlat=" + this.loginPlat + ",}";
    }

    public ScanQrRspInfo(String str, String str2, String str3, String str4, boolean z, OpenAppInfo openAppInfo, SecCheckResult secCheckResult, TipsCtrl tipsCtrl, AutoLoginInfo autoLoginInfo, LoginPlat loginPlat) {
        this.dstAppName = "";
        this.loginCity = "";
        this.loginDevType = "";
        this.loginDevName = "";
        this.dstOpenAppInfo = new OpenAppInfo();
        this.secCheckResult = SecCheckResult.values()[0];
        this.tips = new TipsCtrl();
        this.autoLogin = new AutoLoginInfo();
        this.loginPlat = LoginPlat.values()[0];
        this.dstAppName = str;
        this.loginCity = str2;
        this.loginDevType = str3;
        this.loginDevName = str4;
        this.needA1 = z;
        this.dstOpenAppInfo = openAppInfo;
        this.secCheckResult = secCheckResult;
        this.tips = tipsCtrl;
        this.autoLogin = autoLoginInfo;
        this.loginPlat = loginPlat;
    }
}
