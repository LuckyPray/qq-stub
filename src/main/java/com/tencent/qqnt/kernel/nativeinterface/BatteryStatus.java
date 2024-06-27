package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BatteryStatus.class */
public final class BatteryStatus {
    public boolean chargingState;
    public int percent;

    public BatteryStatus() {
    }

    public boolean getChargingState() {
        return this.chargingState;
    }

    public int getPercent() {
        return this.percent;
    }

    public String toString() {
        return "BatteryStatus{percent=" + this.percent + ",chargingState=" + this.chargingState + ",}";
    }

    public BatteryStatus(int i, boolean z) {
        this.percent = i;
        this.chargingState = z;
    }
}
