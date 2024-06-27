package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OidbRspInfo.class */
public final class OidbRspInfo {
    public String errMsg;
    public byte[] respData;
    public int result;
    public String tips;

    public OidbRspInfo() {
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tips = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.respData = new byte[0];
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public byte[] getRespData() {
        return this.respData;
    }

    public int getResult() {
        return this.result;
    }

    public String getTips() {
        return this.tips;
    }

    public String toString() {
        return "OidbRspInfo{result=" + this.result + ",errMsg=" + this.errMsg + ",tips=" + this.tips + ",respData=" + this.respData + ",}";
    }

    public OidbRspInfo(int i, String str, String str2, byte[] bArr) {
        this.errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tips = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.respData = new byte[0];
        this.result = i;
        this.errMsg = str;
        this.tips = str2;
        this.respData = bArr;
    }
}
