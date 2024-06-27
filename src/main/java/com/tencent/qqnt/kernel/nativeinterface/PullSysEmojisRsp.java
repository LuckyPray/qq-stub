package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PullSysEmojisRsp.class */
public final class PullSysEmojisRsp {
    public BasePanelResult normalPanelResult = new BasePanelResult();
    public BasePanelResult superPanelResult = new BasePanelResult();
    public BasePanelResult redHeartPanelResult = new BasePanelResult();

    public BasePanelResult getNormalPanelResult() {
        return this.normalPanelResult;
    }

    public BasePanelResult getRedHeartPanelResult() {
        return this.redHeartPanelResult;
    }

    public BasePanelResult getSuperPanelResult() {
        return this.superPanelResult;
    }

    public String toString() {
        return "PullSysEmojisRsp{normalPanelResult=" + this.normalPanelResult + ",superPanelResult=" + this.superPanelResult + ",redHeartPanelResult=" + this.redHeartPanelResult + ",}";
    }
}
