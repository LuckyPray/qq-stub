package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BulletinFeedsDownloadInfo.class */
public final class BulletinFeedsDownloadInfo {
    public int errorCode;
    public int levelType;
    public long progress;
    public String errorMsg = "";
    public String feedsId = "";
    public String fileId = "";
    public BulletinFeedsFileType downloadType = BulletinFeedsFileType.values()[0];
    public String fileName = "";
    public String url = "";
    public String savePath = "";

    public BulletinFeedsFileType getDownloadType() {
        return this.downloadType;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getFeedsId() {
        return this.feedsId;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getLevelType() {
        return this.levelType;
    }

    public long getProgress() {
        return this.progress;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "BulletinFeedsDownloadInfo{errorCode=" + this.errorCode + ",errorMsg=" + this.errorMsg + ",progress=" + this.progress + ",feedsId=" + this.feedsId + ",fileId=" + this.fileId + ",downloadType=" + this.downloadType + ",fileName=" + this.fileName + ",levelType=" + this.levelType + ",url=" + this.url + ",savePath=" + this.savePath + ",}";
    }
}
