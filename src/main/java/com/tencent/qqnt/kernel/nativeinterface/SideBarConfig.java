package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SideBarConfig.class */
public final class SideBarConfig {
    public int barId;
    public SideBarStatus status;
    public int weight;

    public SideBarConfig() {
        this.status = SideBarStatus.values()[0];
    }

    public int getBarId() {
        return this.barId;
    }

    public SideBarStatus getStatus() {
        return this.status;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return "SideBarConfig{barId=" + this.barId + ",status=" + this.status + ",weight=" + this.weight + ",}";
    }

    public SideBarConfig(int i, SideBarStatus sideBarStatus, int i2) {
        this.status = SideBarStatus.values()[0];
        this.barId = i;
        this.status = sideBarStatus;
        this.weight = i2;
    }
}
