package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SessionTicket.class */
public final class SessionTicket {

    /* renamed from: a2 */
    public String f41a2;

    /* renamed from: d2 */
    public String f42d2;
    public String d2Key;

    public SessionTicket() {
        this.f41a2 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f42d2 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.d2Key = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getA2() {
        return this.f41a2;
    }

    public String getD2() {
        return this.f42d2;
    }

    public String getD2Key() {
        return this.d2Key;
    }

    public String toString() {
        return "SessionTicket{a2=" + this.f41a2 + ",d2=" + this.f42d2 + ",d2Key=" + this.d2Key + ",}";
    }

    public SessionTicket(String str, String str2, String str3) {
        this.f41a2 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f42d2 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.d2Key = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f41a2 = str;
        this.f42d2 = str2;
        this.d2Key = str3;
    }
}
