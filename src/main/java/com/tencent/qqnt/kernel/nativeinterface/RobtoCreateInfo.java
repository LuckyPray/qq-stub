package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobtoCreateInfo.class */
public final class RobtoCreateInfo {
    public String createName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String createUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getCreateName() {
        return this.createName;
    }

    public String getCreateUid() {
        return this.createUid;
    }

    public String toString() {
        return "RobtoCreateInfo{createName=" + this.createName + ",createUid=" + this.createUid + ",}";
    }
}
