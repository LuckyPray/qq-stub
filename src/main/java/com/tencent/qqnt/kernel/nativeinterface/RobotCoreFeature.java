package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotCoreFeature.class */
public final class RobotCoreFeature {
    public int featureId;
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getFeatureId() {
        return this.featureId;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "RobotCoreFeature{featureId=" + this.featureId + ",name=" + this.name + ",}";
    }
}
