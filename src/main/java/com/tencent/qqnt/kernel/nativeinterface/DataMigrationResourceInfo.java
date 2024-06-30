package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DataMigrationResourceInfo.class */
public final class DataMigrationResourceInfo {
    public String extraData;
    public String filePath;
    public long fileSize;
    public long msgRandom;
    public long msgSeq;
    public int msgSubType;
    public int msgType;

    public DataMigrationResourceInfo() {
        this.filePath = "";
        this.extraData = "";
    }

    public String getExtraData() {
        return this.extraData;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public long getMsgRandom() {
        return this.msgRandom;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public int getMsgSubType() {
        return this.msgSubType;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public String toString() {
        return "DataMigrationResourceInfo{msgSeq=" + this.msgSeq + ",msgRandom=" + this.msgRandom + ",msgType=" + this.msgType + ",msgSubType=" + this.msgSubType + ",filePath=" + this.filePath + ",fileSize=" + this.fileSize + ",extraData=" + this.extraData + ",}";
    }

    public DataMigrationResourceInfo(long j, long j2, int i, int i2, String str, long j3, String str2) {
        this.filePath = "";
        this.extraData = "";
        this.msgSeq = j;
        this.msgRandom = j2;
        this.msgType = i;
        this.msgSubType = i2;
        this.filePath = str;
        this.fileSize = j3;
        this.extraData = str2;
    }
}
