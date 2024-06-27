package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RMReqExParams.class */
public final class RMReqExParams {
    public int downSourceType;
    public int triggerType;

    public RMReqExParams() {
    }

    public int getDownSourceType() {
        return this.downSourceType;
    }

    public int getTriggerType() {
        return this.triggerType;
    }

    public String toString() {
        return "RMReqExParams{downSourceType=" + this.downSourceType + ",triggerType=" + this.triggerType + ",}";
    }

    public RMReqExParams(int i, int i2) {
        this.downSourceType = i;
        this.triggerType = i2;
    }
}
