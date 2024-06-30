package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AndroidImportTableInfo.class */
public final class AndroidImportTableInfo {
    public String groupUin;
    public long maxId;
    public int quickCount;
    public int slowCount;
    public long slowMaxId;
    public String tableName;
    public byte[] tmpSessionSig;
    public String uin;
    public int uinType;

    public AndroidImportTableInfo() {
        this.tableName = "";
        this.uin = "";
        this.groupUin = "";
        this.tmpSessionSig = new byte[0];
    }

    public String getGroupUin() {
        return this.groupUin;
    }

    public long getMaxId() {
        return this.maxId;
    }

    public int getQuickCount() {
        return this.quickCount;
    }

    public int getSlowCount() {
        return this.slowCount;
    }

    public long getSlowMaxId() {
        return this.slowMaxId;
    }

    public String getTableName() {
        return this.tableName;
    }

    public byte[] getTmpSessionSig() {
        return this.tmpSessionSig;
    }

    public String getUin() {
        return this.uin;
    }

    public int getUinType() {
        return this.uinType;
    }

    public String toString() {
        return "AndroidImportTableInfo{tableName=" + this.tableName + ",uin=" + this.uin + ",quickCount=" + this.quickCount + ",slowCount=" + this.slowCount + ",uinType=" + this.uinType + ",maxId=" + this.maxId + ",slowMaxId=" + this.slowMaxId + ",groupUin=" + this.groupUin + ",tmpSessionSig=" + this.tmpSessionSig + ",}";
    }

    public AndroidImportTableInfo(String str, String str2, int i, int i2, int i3, long j, long j2, String str3, byte[] bArr) {
        this.tableName = "";
        this.uin = "";
        this.groupUin = "";
        this.tmpSessionSig = new byte[0];
        this.tableName = str;
        this.uin = str2;
        this.quickCount = i;
        this.slowCount = i2;
        this.uinType = i3;
        this.maxId = j;
        this.slowMaxId = j2;
        this.groupUin = str3;
        this.tmpSessionSig = bArr;
    }
}
