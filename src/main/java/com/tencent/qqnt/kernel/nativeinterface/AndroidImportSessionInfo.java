package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AndroidImportSessionInfo.class */
public final class AndroidImportSessionInfo {
    public ArrayList<ImportRecentUser> recentUserDatas;
    public ArrayList<String> tableNames;

    public AndroidImportSessionInfo() {
        this.recentUserDatas = new ArrayList<>();
        this.tableNames = new ArrayList<>();
    }

    public ArrayList<ImportRecentUser> getRecentUserDatas() {
        return this.recentUserDatas;
    }

    public ArrayList<String> getTableNames() {
        return this.tableNames;
    }

    public String toString() {
        return "AndroidImportSessionInfo{recentUserDatas=" + this.recentUserDatas + ",tableNames=" + this.tableNames + ",}";
    }

    public AndroidImportSessionInfo(ArrayList<ImportRecentUser> arrayList, ArrayList<String> arrayList2) {
        this.recentUserDatas = new ArrayList<>();
        this.tableNames = new ArrayList<>();
        this.recentUserDatas = arrayList;
        this.tableNames = arrayList2;
    }
}
