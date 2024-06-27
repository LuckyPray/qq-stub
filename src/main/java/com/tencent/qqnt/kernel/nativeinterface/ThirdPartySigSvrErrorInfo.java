package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ThirdPartySigSvrErrorInfo.class */
public final class ThirdPartySigSvrErrorInfo {
    public int errCode;
    public String errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String toString() {
        return "ThirdPartySigSvrErrorInfo{errCode=" + this.errCode + ",errMsg=" + this.errMsg + ",}";
    }
}
