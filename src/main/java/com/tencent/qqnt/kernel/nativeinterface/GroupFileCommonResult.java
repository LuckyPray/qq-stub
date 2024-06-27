package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupFileCommonResult.class */
public final class GroupFileCommonResult {
    public String clientWording;
    public int retCode;
    public String retMsg;

    public GroupFileCommonResult() {
        this.retMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientWording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getClientWording() {
        return this.clientWording;
    }

    public int getRetCode() {
        return this.retCode;
    }

    public String getRetMsg() {
        return this.retMsg;
    }

    public String toString() {
        return "GroupFileCommonResult{retCode=" + this.retCode + ",retMsg=" + this.retMsg + ",clientWording=" + this.clientWording + ",}";
    }

    public GroupFileCommonResult(int i, String str, String str2) {
        this.retMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientWording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.retCode = i;
        this.retMsg = str;
        this.clientWording = str2;
    }
}
