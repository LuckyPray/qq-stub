package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CheckUrlResult.class */
public final class CheckUrlResult {
    public int jumpResult;
    public String jumpUrl;
    public int result;
    public String url;

    public CheckUrlResult() {
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getJumpResult() {
        return this.jumpResult;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public int getResult() {
        return this.result;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "CheckUrlResult{url=" + this.url + ",result=" + this.result + ",jumpResult=" + this.jumpResult + ",jumpUrl=" + this.jumpUrl + ",}";
    }

    public CheckUrlResult(String str, int i, int i2, String str2) {
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = str;
        this.result = i;
        this.jumpResult = i2;
        this.jumpUrl = str2;
    }
}
