package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelMsgImportToolListener.class */
public interface IKernelMsgImportToolListener {
    Long getAndroidFreeDiskSize();

    AndroidImportParseMsgs getAndroidImportParseMsgs(AndroidImportQueryParam androidImportQueryParam);

    AndroidImportSessionInfo getAndroidImportSessionInfos();

    AndroidImportTableInfo getAndroidImportTableInfos(String str);

    DataLineImportInfo getDataLineImportInfosByTableName(String str);

    DataLineImportMsgRecords getDataLineImportMsgRecords(DataLineImportQueryParam dataLineImportQueryParam);

    ArrayList<ImportRecentUser> getiOSRecentUserDatas();

    Boolean isHasDataLineMsgToImport();

    Boolean isHasMsgRecordToImport();

    ArrayList<ImportMsgPbRecord> parseiOSDbMsgRecords(ArrayList<IOSDbMsgRecord> arrayList);

    ArrayList<MsgRecord> parseiOSSpecialMsgRecords(ArrayList<IOSDbMsgRecord> arrayList);
}
