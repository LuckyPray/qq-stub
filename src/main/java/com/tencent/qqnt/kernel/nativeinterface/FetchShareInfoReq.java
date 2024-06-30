package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FetchShareInfoReq.class */
public final class FetchShareInfoReq {
    public RobotShareScene scene = RobotShareScene.values()[0];
    public RobotShareTarget target = RobotShareTarget.values()[0];
    public String uid = "";

    public RobotShareScene getScene() {
        return this.scene;
    }

    public RobotShareTarget getTarget() {
        return this.target;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "FetchShareInfoReq{scene=" + this.scene + ",target=" + this.target + ",uid=" + this.uid + ",}";
    }
}
