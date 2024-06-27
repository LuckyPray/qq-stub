package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSLikeStatusRsp.class */
public final class OSLikeStatusRsp {
    public int errCode;
    public String errMsg;

    public OSLikeStatusRsp() {
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String toString() {
        return "OSLikeStatusRsp{errCode=" + this.errCode + ",errMsg=" + this.errMsg + ",}";
    }

    public OSLikeStatusRsp(int i, String str) {
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.errCode = i;
        this.errMsg = str;
    }
}
