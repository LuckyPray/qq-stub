package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ImageInfo.class */
public final class ImageInfo {
    public String imageUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getDesc() {
        return this.desc;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String toString() {
        return "ImageInfo{imageUrl=" + this.imageUrl + ",desc=" + this.desc + ",}";
    }
}
