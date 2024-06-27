package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MultiTransInfo.class */
public final class MultiTransInfo {
    public int friendFlag;
    public byte[] fromAnonId;
    public String fromFaceUrl;
    public int msgId;
    public int status;

    public MultiTransInfo() {
        this.fromAnonId = new byte[0];
        this.fromFaceUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getFriendFlag() {
        return this.friendFlag;
    }

    public byte[] getFromAnonId() {
        return this.fromAnonId;
    }

    public String getFromFaceUrl() {
        return this.fromFaceUrl;
    }

    public int getMsgId() {
        return this.msgId;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "MultiTransInfo{status=" + this.status + ",msgId=" + this.msgId + ",friendFlag=" + this.friendFlag + ",fromAnonId=" + this.fromAnonId + ",fromFaceUrl=" + this.fromFaceUrl + ",}";
    }

    public MultiTransInfo(int i, int i2, int i3, byte[] bArr, String str) {
        this.fromAnonId = new byte[0];
        this.fromFaceUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.status = i;
        this.msgId = i2;
        this.friendFlag = i3;
        this.fromAnonId = bArr;
        this.fromFaceUrl = str;
    }
}
