package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PanelItemInfo.class */
public final class PanelItemInfo {
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String color = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String fontColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String borderColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getBorderColor() {
        return this.borderColor;
    }

    public String getColor() {
        return this.color;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "PanelItemInfo{name=" + this.name + ",icon=" + this.icon + ",url=" + this.url + ",color=" + this.color + ",fontColor=" + this.fontColor + ",borderColor=" + this.borderColor + ",}";
    }
}
