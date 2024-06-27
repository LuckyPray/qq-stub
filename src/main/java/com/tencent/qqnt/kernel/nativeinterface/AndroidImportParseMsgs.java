package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AndroidImportParseMsgs.class */
public final class AndroidImportParseMsgs {
    public ArrayList<ImportMsgPbRecord> importMsgPbRecord;
    public long nextId;
    public long parseTime;
    public int readCount;
    public long readTime;
    public ArrayList<MsgRecord> specialMsgRecord;

    public AndroidImportParseMsgs() {
        this.importMsgPbRecord = new ArrayList<>();
        this.specialMsgRecord = new ArrayList<>();
    }

    public ArrayList<ImportMsgPbRecord> getImportMsgPbRecord() {
        return this.importMsgPbRecord;
    }

    public long getNextId() {
        return this.nextId;
    }

    public long getParseTime() {
        return this.parseTime;
    }

    public int getReadCount() {
        return this.readCount;
    }

    public long getReadTime() {
        return this.readTime;
    }

    public ArrayList<MsgRecord> getSpecialMsgRecord() {
        return this.specialMsgRecord;
    }

    public String toString() {
        return "AndroidImportParseMsgs{readCount=" + this.readCount + ",nextId=" + this.nextId + ",readTime=" + this.readTime + ",parseTime=" + this.parseTime + ",importMsgPbRecord=" + this.importMsgPbRecord + ",specialMsgRecord=" + this.specialMsgRecord + ",}";
    }

    public AndroidImportParseMsgs(int i, long j, long j2, long j3, ArrayList<ImportMsgPbRecord> arrayList, ArrayList<MsgRecord> arrayList2) {
        this.importMsgPbRecord = new ArrayList<>();
        this.specialMsgRecord = new ArrayList<>();
        this.readCount = i;
        this.nextId = j;
        this.readTime = j2;
        this.parseTime = j3;
        this.importMsgPbRecord = arrayList;
        this.specialMsgRecord = arrayList2;
    }
}
