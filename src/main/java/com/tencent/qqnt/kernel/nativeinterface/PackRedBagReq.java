package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PackRedBagReq.class */
public final class PackRedBagReq {
    public int busType;
    public int channel;
    public String name;
    public int qrcodeFlag;
    public int recvType;
    public long recvUin;
    public long totalAmount;
    public long totalNum;
    public String wishing;

    public PackRedBagReq() {
        this.wishing = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getBusType() {
        return this.busType;
    }

    public int getChannel() {
        return this.channel;
    }

    public String getName() {
        return this.name;
    }

    public int getQrcodeFlag() {
        return this.qrcodeFlag;
    }

    public int getRecvType() {
        return this.recvType;
    }

    public long getRecvUin() {
        return this.recvUin;
    }

    public long getTotalAmount() {
        return this.totalAmount;
    }

    public long getTotalNum() {
        return this.totalNum;
    }

    public String getWishing() {
        return this.wishing;
    }

    public String toString() {
        return "PackRedBagReq{totalNum=" + this.totalNum + ",totalAmount=" + this.totalAmount + ",recvUin=" + this.recvUin + ",recvType=" + this.recvType + ",wishing=" + this.wishing + ",channel=" + this.channel + ",busType=" + this.busType + ",name=" + this.name + ",qrcodeFlag=" + this.qrcodeFlag + ",}";
    }

    public PackRedBagReq(long j, long j2, long j3, int i, String str, int i2, int i3, String str2, int i4) {
        this.wishing = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.totalNum = j;
        this.totalAmount = j2;
        this.recvUin = j3;
        this.recvType = i;
        this.wishing = str;
        this.channel = i2;
        this.busType = i3;
        this.name = str2;
        this.qrcodeFlag = i4;
    }
}
