package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BigDataTicket.class */
public final class BigDataTicket {
    public String sessionKey;
    public String sessionSig;

    public BigDataTicket() {
        this.sessionSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sessionKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getSessionKey() {
        return this.sessionKey;
    }

    public String getSessionSig() {
        return this.sessionSig;
    }

    public String toString() {
        return "BigDataTicket{sessionSig=" + this.sessionSig + ",sessionKey=" + this.sessionKey + ",}";
    }

    public BigDataTicket(String str, String str2) {
        this.sessionSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sessionKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sessionSig = str;
        this.sessionKey = str2;
    }
}
