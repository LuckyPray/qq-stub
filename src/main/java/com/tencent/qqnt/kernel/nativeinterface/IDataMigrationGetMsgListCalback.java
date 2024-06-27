package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IDataMigrationGetMsgListCalback.class */
public interface IDataMigrationGetMsgListCalback {
    void onResult(int i, String str, boolean z, ArrayList<DataMigrationMsgInfo> arrayList, ArrayList<DataMigrationResourceInfo> arrayList2);
}
