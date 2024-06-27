package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OnLineBusinessInfo.class */
public final class OnLineBusinessInfo {
    public int bindUinNotifySwitch;
    public int kikPc;
    public int notifySwitch;

    public OnLineBusinessInfo() {
    }

    public int getBindUinNotifySwitch() {
        return this.bindUinNotifySwitch;
    }

    public int getKikPc() {
        return this.kikPc;
    }

    public int getNotifySwitch() {
        return this.notifySwitch;
    }

    public String toString() {
        return "OnLineBusinessInfo{kikPc=" + this.kikPc + ",notifySwitch=" + this.notifySwitch + ",bindUinNotifySwitch=" + this.bindUinNotifySwitch + ",}";
    }

    public OnLineBusinessInfo(int i, int i2, int i3) {
        this.kikPc = i;
        this.notifySwitch = i2;
        this.bindUinNotifySwitch = i3;
    }
}
