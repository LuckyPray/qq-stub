package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DownloadGroupFileParams.class */
public final class DownloadGroupFileParams {
    public String fileId;
    public long fileModelId;
    public String fileName;
    public long fileSize;

    public DownloadGroupFileParams() {
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFileId() {
        return this.fileId;
    }

    public long getFileModelId() {
        return this.fileModelId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String toString() {
        return "DownloadGroupFileParams{fileId=" + this.fileId + ",fileName=" + this.fileName + ",fileSize=" + this.fileSize + ",fileModelId=" + this.fileModelId + ",}";
    }

    public DownloadGroupFileParams(String str, String str2, long j, long j2) {
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileId = str;
        this.fileName = str2;
        this.fileSize = j;
        this.fileModelId = j2;
    }
}
