package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SpecialCareSetting.class */
public final class SpecialCareSetting {
    public boolean isOn;
    public boolean isRingOn;
    public boolean isZoneOn;

    public SpecialCareSetting() {
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public boolean getIsRingOn() {
        return this.isRingOn;
    }

    public boolean getIsZoneOn() {
        return this.isZoneOn;
    }

    public String toString() {
        return "SpecialCareSetting{isRingOn=" + this.isRingOn + ",isZoneOn=" + this.isZoneOn + ",isOn=" + this.isOn + ",}";
    }

    public SpecialCareSetting(boolean z, boolean z2, boolean z3) {
        this.isRingOn = z;
        this.isZoneOn = z2;
        this.isOn = z3;
    }
}
