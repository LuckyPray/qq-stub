package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FileCacheInfo.class */
public final class FileCacheInfo {
    public long elementId;
    public String elementIdStr;
    public long fileKey;
    public String fileName;
    public long fileSize;
    public long fileTime;
    public CacheFileType fileType;
    public String path;
    public String previewPath;
    public String senderId;
    public String senderName;

    public FileCacheInfo() {
        this.elementIdStr = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileType = CacheFileType.values()[0];
        this.path = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.senderId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.previewPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.senderName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getElementId() {
        return this.elementId;
    }

    public String getElementIdStr() {
        return this.elementIdStr;
    }

    public long getFileKey() {
        return this.fileKey;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public long getFileTime() {
        return this.fileTime;
    }

    public CacheFileType getFileType() {
        return this.fileType;
    }

    public String getPath() {
        return this.path;
    }

    public String getPreviewPath() {
        return this.previewPath;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public String toString() {
        return "FileCacheInfo{fileSize=" + this.fileSize + ",fileTime=" + this.fileTime + ",fileKey=" + this.fileKey + ",elementId=" + this.elementId + ",elementIdStr=" + this.elementIdStr + ",fileType=" + this.fileType + ",path=" + this.path + ",fileName=" + this.fileName + ",senderId=" + this.senderId + ",previewPath=" + this.previewPath + ",senderName=" + this.senderName + ",}";
    }

    public FileCacheInfo(long j, long j2, long j3, long j4, String str, CacheFileType cacheFileType, String str2, String str3, String str4, String str5, String str6) {
        this.elementIdStr = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileType = CacheFileType.values()[0];
        this.path = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.senderId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.previewPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.senderName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileSize = j;
        this.fileTime = j2;
        this.fileKey = j3;
        this.elementId = j4;
        this.elementIdStr = str;
        this.fileType = cacheFileType;
        this.path = str2;
        this.fileName = str3;
        this.senderId = str4;
        this.previewPath = str5;
        this.senderName = str6;
    }
}
