package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FavMarketEmoticonInfo.class */
public final class FavMarketEmoticonInfo {
    public String eId;
    public String faceName;
    public int height;
    public int width;

    public FavMarketEmoticonInfo() {
        this.eId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.faceName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getEId() {
        return this.eId;
    }

    public String getFaceName() {
        return this.faceName;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "FavMarketEmoticonInfo{eId=" + this.eId + ",width=" + this.width + ",height=" + this.height + ",faceName=" + this.faceName + ",}";
    }

    public FavMarketEmoticonInfo(String str, int i, int i2, String str2) {
        this.eId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.faceName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eId = str;
        this.width = i;
        this.height = i2;
        this.faceName = str2;
    }
}
