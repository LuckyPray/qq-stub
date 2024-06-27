package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DataLineImportInfo.class */
public final class DataLineImportInfo {
    public long maxId;
    public int msgCount;
    public String tableName;

    public DataLineImportInfo() {
        this.tableName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getMaxId() {
        return this.maxId;
    }

    public int getMsgCount() {
        return this.msgCount;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String toString() {
        return "DataLineImportInfo{tableName=" + this.tableName + ",msgCount=" + this.msgCount + ",maxId=" + this.maxId + ",}";
    }

    public DataLineImportInfo(String str, int i, long j) {
        this.tableName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tableName = str;
        this.msgCount = i;
        this.maxId = j;
    }
}
