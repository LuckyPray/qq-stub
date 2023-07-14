package com.tencent.qqnt.kernel.nativeinterface;

public final class ZPlanMsgElement {
    int actionFlag;
    byte[] extInfo;
    int guestActionID;
    int masterActionID;

    public ZPlanMsgElement() {
        this.extInfo = new byte[0];
    }

    public int getActionFlag() {
        return this.actionFlag;
    }

    public byte[] getExtInfo() {
        return this.extInfo;
    }

    public int getGuestActionID() {
        return this.guestActionID;
    }

    public int getMasterActionID() {
        return this.masterActionID;
    }

    public String toString() {
        return "ZPlanMsgElement{masterActionID=" + this.masterActionID + ",guestActionID=" + this.guestActionID + ",actionFlag=" + this.actionFlag + ",extInfo=" + this.extInfo + ",}";
    }

    public ZPlanMsgElement(int i, int i2, int i3, byte[] bArr) {
        this.extInfo = new byte[0];
        this.masterActionID = i;
        this.guestActionID = i2;
        this.actionFlag = i3;
        this.extInfo = bArr;
    }
}