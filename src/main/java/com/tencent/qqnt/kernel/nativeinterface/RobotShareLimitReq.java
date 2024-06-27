package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotShareLimitReq.class */
public final class RobotShareLimitReq {
    public int shareType;

    public RobotShareLimitReq() {
    }

    public int getShareType() {
        return this.shareType;
    }

    public String toString() {
        return "RobotShareLimitReq{shareType=" + this.shareType + ",}";
    }

    public RobotShareLimitReq(int i) {
        this.shareType = i;
    }
}
