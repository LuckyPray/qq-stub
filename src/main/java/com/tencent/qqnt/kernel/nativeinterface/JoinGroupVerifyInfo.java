package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/JoinGroupVerifyInfo.class */
public final class JoinGroupVerifyInfo {
    public JoinGroupVerifyType type = JoinGroupVerifyType.values()[0];
    public String url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public JoinGroupVerifyType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "JoinGroupVerifyInfo{type=" + this.type + ",url=" + this.url + ",}";
    }
}
