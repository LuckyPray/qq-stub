package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UploadGroupFileParams.class */
public final class UploadGroupFileParams {
    public long fileModelId;
    public String fileName;
    public String filePath;

    public UploadGroupFileParams() {
        this.fileName = "";
        this.filePath = "";
    }

    public long getFileModelId() {
        return this.fileModelId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String toString() {
        return "UploadGroupFileParams{fileName=" + this.fileName + ",filePath=" + this.filePath + ",fileModelId=" + this.fileModelId + ",}";
    }

    public UploadGroupFileParams(String str, String str2, long j) {
        this.fileName = "";
        this.filePath = "";
        this.fileName = str;
        this.filePath = str2;
        this.fileModelId = j;
    }
}
