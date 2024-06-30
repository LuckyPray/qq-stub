package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ImportMsgRecordFileInfo.class */
public final class ImportMsgRecordFileInfo {
    public ArrayList<ImportMsgFilePath> filePaths;
    public int fileStatus;
    public int fileType;
    public String fileUuid;

    public ImportMsgRecordFileInfo() {
        this.fileUuid = "";
        this.filePaths = new ArrayList<>();
    }

    public ArrayList<ImportMsgFilePath> getFilePaths() {
        return this.filePaths;
    }

    public int getFileStatus() {
        return this.fileStatus;
    }

    public int getFileType() {
        return this.fileType;
    }

    public String getFileUuid() {
        return this.fileUuid;
    }

    public String toString() {
        return "ImportMsgRecordFileInfo{fileType=" + this.fileType + ",fileStatus=" + this.fileStatus + ",fileUuid=" + this.fileUuid + ",filePaths=" + this.filePaths + ",}";
    }

    public ImportMsgRecordFileInfo(int i, int i2, String str, ArrayList<ImportMsgFilePath> arrayList) {
        this.fileUuid = "";
        this.filePaths = new ArrayList<>();
        this.fileType = i;
        this.fileStatus = i2;
        this.fileUuid = str;
        this.filePaths = arrayList;
    }
}
