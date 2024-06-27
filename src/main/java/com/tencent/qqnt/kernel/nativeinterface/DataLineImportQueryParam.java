package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DataLineImportQueryParam.class */
public final class DataLineImportQueryParam {
    public int readCount;
    public long startIndex;
    public String tableName;

    public DataLineImportQueryParam() {
        this.tableName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getReadCount() {
        return this.readCount;
    }

    public long getStartIndex() {
        return this.startIndex;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String toString() {
        return "DataLineImportQueryParam{tableName=" + this.tableName + ",startIndex=" + this.startIndex + ",readCount=" + this.readCount + ",}";
    }

    public DataLineImportQueryParam(String str, long j, int i) {
        this.tableName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tableName = str;
        this.startIndex = j;
        this.readCount = i;
    }
}
