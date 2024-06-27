package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ClientAttr.class */
public final class ClientAttr {
    public int action;
    public int gender;
    public String uin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public UinAttr attr = new UinAttr();
    public String qqNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getAction() {
        return this.action;
    }

    public UinAttr getAttr() {
        return this.attr;
    }

    public int getGender() {
        return this.gender;
    }

    public String getQqNick() {
        return this.qqNick;
    }

    public String getUin() {
        return this.uin;
    }
}
