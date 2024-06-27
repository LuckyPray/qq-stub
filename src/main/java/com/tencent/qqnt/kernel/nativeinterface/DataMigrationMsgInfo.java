package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DataMigrationMsgInfo.class */
public final class DataMigrationMsgInfo {
    public int chatType;
    public String chatUin;
    public byte[] extensionData;
    public String extraData;
    public long msgRandom;
    public long msgSeq;
    public long msgTime;
    public int msgType;

    public DataMigrationMsgInfo() {
        this.chatUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.extensionData = new byte[0];
        this.extraData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getChatType() {
        return this.chatType;
    }

    public String getChatUin() {
        return this.chatUin;
    }

    public byte[] getExtensionData() {
        return this.extensionData;
    }

    public String getExtraData() {
        return this.extraData;
    }

    public long getMsgRandom() {
        return this.msgRandom;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public String toString() {
        return "DataMigrationMsgInfo{chatType=" + this.chatType + ",chatUin=" + this.chatUin + ",msgType=" + this.msgType + ",msgTime=" + this.msgTime + ",msgSeq=" + this.msgSeq + ",msgRandom=" + this.msgRandom + ",extensionData=" + this.extensionData + ",extraData=" + this.extraData + ",}";
    }

    public DataMigrationMsgInfo(int i, String str, int i2, long j, long j2, long j3, byte[] bArr, String str2) {
        this.chatUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.extensionData = new byte[0];
        this.extraData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.chatType = i;
        this.chatUin = str;
        this.msgType = i2;
        this.msgTime = j;
        this.msgSeq = j2;
        this.msgRandom = j3;
        this.extensionData = bArr;
        this.extraData = str2;
    }
}
