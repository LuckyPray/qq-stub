package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotAuthClassInfo.class */
public final class GProGuildRobotAuthClassInfo {
    public String className;
    public int order;

    public GProGuildRobotAuthClassInfo() {
        this.className = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getClassName() {
        return this.className;
    }

    public int getOrder() {
        return this.order;
    }

    public String toString() {
        return "GProGuildRobotAuthClassInfo{className=" + this.className + ",order=" + this.order + ",}";
    }

    public GProGuildRobotAuthClassInfo(String str, int i) {
        this.className = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.className = str;
        this.order = i;
    }
}
