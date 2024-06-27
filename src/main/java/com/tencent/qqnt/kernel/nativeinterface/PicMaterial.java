package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PicMaterial.class */
public final class PicMaterial {
    public PicStyle picStyle = PicStyle.values()[0];
    public StyleInfo styleInfo = new StyleInfo();
    public String url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public PicStyle getPicStyle() {
        return this.picStyle;
    }

    public StyleInfo getStyleInfo() {
        return this.styleInfo;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "PicMaterial{picStyle=" + this.picStyle + ",styleInfo=" + this.styleInfo + ",url=" + this.url + ",}";
    }
}
