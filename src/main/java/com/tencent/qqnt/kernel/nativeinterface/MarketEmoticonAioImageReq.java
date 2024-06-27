package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MarketEmoticonAioImageReq.class */
public final class MarketEmoticonAioImageReq {
    public String eId;
    public String encryptKey;
    public int epId;
    public int height;
    public int jobType;
    public String name;
    public int width;

    public MarketEmoticonAioImageReq() {
        this.eId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.encryptKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getEId() {
        return this.eId;
    }

    public String getEncryptKey() {
        return this.encryptKey;
    }

    public int getEpId() {
        return this.epId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getJobType() {
        return this.jobType;
    }

    public String getName() {
        return this.name;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "MarketEmoticonAioImageReq{epId=" + this.epId + ",eId=" + this.eId + ",name=" + this.name + ",encryptKey=" + this.encryptKey + ",width=" + this.width + ",height=" + this.height + ",jobType=" + this.jobType + ",}";
    }

    public MarketEmoticonAioImageReq(int i, String str, String str2, String str3, int i2, int i3, int i4) {
        this.eId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.encryptKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.epId = i;
        this.eId = str;
        this.name = str2;
        this.encryptKey = str3;
        this.width = i2;
        this.height = i3;
        this.jobType = i4;
    }
}
