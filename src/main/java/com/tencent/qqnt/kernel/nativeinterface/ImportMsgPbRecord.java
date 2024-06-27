package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ImportMsgPbRecord.class */
public final class ImportMsgPbRecord {
    public byte[] dataBuf;
    public byte[] extendData;
    public ArrayList<ImportMsgRecordFileInfo> fileInfos;
    public DataImportGameChatSession gameChatSession;
    public int pbType;
    public Integer sendStatus;

    public ImportMsgPbRecord() {
        this.fileInfos = new ArrayList<>();
        this.dataBuf = new byte[0];
    }

    public byte[] getDataBuf() {
        return this.dataBuf;
    }

    public byte[] getExtendData() {
        return this.extendData;
    }

    public ArrayList<ImportMsgRecordFileInfo> getFileInfos() {
        return this.fileInfos;
    }

    public DataImportGameChatSession getGameChatSession() {
        return this.gameChatSession;
    }

    public int getPbType() {
        return this.pbType;
    }

    public Integer getSendStatus() {
        return this.sendStatus;
    }

    public String toString() {
        return "ImportMsgPbRecord{pbType=" + this.pbType + ",extendData=" + this.extendData + ",fileInfos=" + this.fileInfos + ",dataBuf=" + this.dataBuf + ",gameChatSession=" + this.gameChatSession + ",sendStatus=" + this.sendStatus + ",}";
    }

    public ImportMsgPbRecord(int i, byte[] bArr, ArrayList<ImportMsgRecordFileInfo> arrayList, byte[] bArr2, DataImportGameChatSession dataImportGameChatSession, Integer num) {
        this.fileInfos = new ArrayList<>();
        this.dataBuf = new byte[0];
        this.pbType = i;
        this.extendData = bArr;
        this.fileInfos = arrayList;
        this.dataBuf = bArr2;
        this.gameChatSession = dataImportGameChatSession;
        this.sendStatus = num;
    }
}
