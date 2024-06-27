package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ThirdPartyBusinessInfo.class */
public final class ThirdPartyBusinessInfo {
    public String info;
    public boolean isPersistence;
    public LiteBusinessType type;

    public ThirdPartyBusinessInfo() {
        this.type = LiteBusinessType.values()[0];
        this.info = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getInfo() {
        return this.info;
    }

    public boolean getIsPersistence() {
        return this.isPersistence;
    }

    public LiteBusinessType getType() {
        return this.type;
    }

    public String toString() {
        return "ThirdPartyBusinessInfo{type=" + this.type + ",info=" + this.info + ",isPersistence=" + this.isPersistence + ",}";
    }

    public ThirdPartyBusinessInfo(LiteBusinessType liteBusinessType, String str, boolean z) {
        this.type = LiteBusinessType.values()[0];
        this.info = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.type = liteBusinessType;
        this.info = str;
        this.isPersistence = z;
    }
}
