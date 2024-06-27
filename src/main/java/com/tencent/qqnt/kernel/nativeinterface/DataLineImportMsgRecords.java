package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DataLineImportMsgRecords.class */
public final class DataLineImportMsgRecords {
    public ArrayList<MsgRecord> msgRecord;
    public long nextId;
    public int readCount;

    public DataLineImportMsgRecords() {
        this.msgRecord = new ArrayList<>();
    }

    public ArrayList<MsgRecord> getMsgRecord() {
        return this.msgRecord;
    }

    public long getNextId() {
        return this.nextId;
    }

    public int getReadCount() {
        return this.readCount;
    }

    public String toString() {
        return "DataLineImportMsgRecords{readCount=" + this.readCount + ",nextId=" + this.nextId + ",msgRecord=" + this.msgRecord + ",}";
    }

    public DataLineImportMsgRecords(int i, long j, ArrayList<MsgRecord> arrayList) {
        this.msgRecord = new ArrayList<>();
        this.readCount = i;
        this.nextId = j;
        this.msgRecord = arrayList;
    }
}
