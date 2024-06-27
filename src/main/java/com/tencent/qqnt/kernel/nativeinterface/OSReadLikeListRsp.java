package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSReadLikeListRsp.class */
public final class OSReadLikeListRsp {
    public int errCode;
    public String errMsg;

    public OSReadLikeListRsp() {
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String toString() {
        return "OSReadLikeListRsp{errCode=" + this.errCode + ",errMsg=" + this.errMsg + ",}";
    }

    public OSReadLikeListRsp(int i, String str) {
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.errCode = i;
        this.errMsg = str;
    }
}
