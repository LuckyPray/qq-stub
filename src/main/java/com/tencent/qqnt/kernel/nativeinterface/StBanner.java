package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StBanner.class */
public final class StBanner {
    public int actionType;
    public long intervalTime;

    /* renamed from: id */
    public String f44id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String img = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String color = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String actionUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getActionType() {
        return this.actionType;
    }

    public String getActionUrl() {
        return this.actionUrl;
    }

    public String getColor() {
        return this.color;
    }

    public String getId() {
        return this.f44id;
    }

    public String getImg() {
        return this.img;
    }

    public long getIntervalTime() {
        return this.intervalTime;
    }

    public String getText() {
        return this.text;
    }
}
