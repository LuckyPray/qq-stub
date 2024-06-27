package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OpentelemetryInit.class */
public final class OpentelemetryInit {
    public boolean isInit;
    public boolean isReport;

    public OpentelemetryInit() {
    }

    public boolean getIsInit() {
        return this.isInit;
    }

    public boolean getIsReport() {
        return this.isReport;
    }

    public String toString() {
        return "OpentelemetryInit{isInit=" + this.isInit + ",isReport=" + this.isReport + ",}";
    }

    public OpentelemetryInit(boolean z, boolean z2) {
        this.isInit = z;
        this.isReport = z2;
    }
}
