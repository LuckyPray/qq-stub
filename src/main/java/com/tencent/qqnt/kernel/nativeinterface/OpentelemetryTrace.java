package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OpentelemetryTrace.class */
public final class OpentelemetryTrace {

    /* renamed from: id */
    public String f30id;

    public OpentelemetryTrace() {
        this.f30id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getId() {
        return this.f30id;
    }

    public String toString() {
        return "OpentelemetryTrace{id=" + this.f30id + ",}";
    }

    public OpentelemetryTrace(String str) {
        this.f30id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f30id = str;
    }
}
