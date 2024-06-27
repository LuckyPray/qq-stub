package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OpentelemetryTracePlan.class */
public final class OpentelemetryTracePlan {
    public boolean isOpen;
    public boolean isReport;

    public OpentelemetryTracePlan() {
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }

    public boolean getIsReport() {
        return this.isReport;
    }

    public String toString() {
        return "OpentelemetryTracePlan{isOpen=" + this.isOpen + ",isReport=" + this.isReport + ",}";
    }

    public OpentelemetryTracePlan(boolean z, boolean z2) {
        this.isOpen = z;
        this.isReport = z2;
    }
}
