package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SendRequestParam.class */
public final class SendRequestParam {
    public String account;
    public int accountType;
    public int reqTargetAccountType;
    public int resendNum;
    public int sendOptions;
    public int sendTimeout;
    public int sendTimeoutOnSlowNet;

    public SendRequestParam() {
        this.account = "";
    }

    public String getAccount() {
        return this.account;
    }

    public int getAccountType() {
        return this.accountType;
    }

    public int getReqTargetAccountType() {
        return this.reqTargetAccountType;
    }

    public int getResendNum() {
        return this.resendNum;
    }

    public int getSendOptions() {
        return this.sendOptions;
    }

    public int getSendTimeout() {
        return this.sendTimeout;
    }

    public int getSendTimeoutOnSlowNet() {
        return this.sendTimeoutOnSlowNet;
    }

    public String toString() {
        return "SendRequestParam{sendTimeout=" + this.sendTimeout + ",sendTimeoutOnSlowNet=" + this.sendTimeoutOnSlowNet + ",resendNum=" + this.resendNum + ",sendOptions=" + this.sendOptions + ",reqTargetAccountType=" + this.reqTargetAccountType + ",account=" + this.account + ",accountType=" + this.accountType + ",}";
    }

    public SendRequestParam(int i, int i2, int i3, int i4, int i5, String str, int i6) {
        this.account = "";
        this.sendTimeout = i;
        this.sendTimeoutOnSlowNet = i2;
        this.resendNum = i3;
        this.sendOptions = i4;
        this.reqTargetAccountType = i5;
        this.account = str;
        this.accountType = i6;
    }
}
