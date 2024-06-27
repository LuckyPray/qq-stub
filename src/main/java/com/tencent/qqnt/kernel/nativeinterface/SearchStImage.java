package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchStImage.class */
public final class SearchStImage {
    public int height;
    public int width;
    public String picUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String layerPicUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getHeight() {
        return this.height;
    }

    public String getLayerPicUrl() {
        return this.layerPicUrl;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "SearchStImage{width=" + this.width + ",height=" + this.height + ",picUrl=" + this.picUrl + ",layerPicUrl=" + this.layerPicUrl + ",}";
    }
}
