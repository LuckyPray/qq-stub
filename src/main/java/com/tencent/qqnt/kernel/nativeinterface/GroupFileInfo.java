package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupFileInfo.class */
public final class GroupFileInfo {
    public int busId;
    public int deadTime;
    public int downloadTimes;
    public long elementId;
    public String fileId;
    public long fileModelId;
    public String fileName;
    public long fileSize;
    public boolean isFolder;
    public String localPath;
    public String md5;
    public int modifyTime;
    public String parentFolderId;
    public String sha;
    public String sha3;
    public int transStatus;
    public int transType;
    public int uploadTime;
    public long uploadedSize;
    public String uploaderLocalPath;
    public String uploaderName;
    public long uploaderUin;

    public GroupFileInfo() {
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sha = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sha3 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uploaderName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.localPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getBusId() {
        return this.busId;
    }

    public int getDeadTime() {
        return this.deadTime;
    }

    public int getDownloadTimes() {
        return this.downloadTimes;
    }

    public long getElementId() {
        return this.elementId;
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

    public boolean getIsFolder() {
        return this.isFolder;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getModifyTime() {
        return this.modifyTime;
    }

    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public String getSha() {
        return this.sha;
    }

    public String getSha3() {
        return this.sha3;
    }

    public int getTransStatus() {
        return this.transStatus;
    }

    public int getTransType() {
        return this.transType;
    }

    public int getUploadTime() {
        return this.uploadTime;
    }

    public long getUploadedSize() {
        return this.uploadedSize;
    }

    public String getUploaderLocalPath() {
        return this.uploaderLocalPath;
    }

    public String getUploaderName() {
        return this.uploaderName;
    }

    public long getUploaderUin() {
        return this.uploaderUin;
    }

    public String toString() {
        return "GroupFileInfo{fileModelId=" + this.fileModelId + ",fileId=" + this.fileId + ",fileName=" + this.fileName + ",fileSize=" + this.fileSize + ",busId=" + this.busId + ",uploadedSize=" + this.uploadedSize + ",uploadTime=" + this.uploadTime + ",deadTime=" + this.deadTime + ",modifyTime=" + this.modifyTime + ",downloadTimes=" + this.downloadTimes + ",sha=" + this.sha + ",sha3=" + this.sha3 + ",md5=" + this.md5 + ",uploaderLocalPath=" + this.uploaderLocalPath + ",uploaderName=" + this.uploaderName + ",uploaderUin=" + this.uploaderUin + ",parentFolderId=" + this.parentFolderId + ",localPath=" + this.localPath + ",transStatus=" + this.transStatus + ",transType=" + this.transType + ",elementId=" + this.elementId + ",isFolder=" + this.isFolder + ",}";
    }

    public GroupFileInfo(long j, String str, String str2, long j2, int i, long j3, int i2, int i3, int i4, int i5, String str3, String str4, String str5, String str6, String str7, long j4, String str8, String str9, int i6, int i7, long j5, boolean z) {
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sha = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sha3 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uploaderName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.localPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileModelId = j;
        this.fileId = str;
        this.fileName = str2;
        this.fileSize = j2;
        this.busId = i;
        this.uploadedSize = j3;
        this.uploadTime = i2;
        this.deadTime = i3;
        this.modifyTime = i4;
        this.downloadTimes = i5;
        this.sha = str3;
        this.sha3 = str4;
        this.md5 = str5;
        this.uploaderLocalPath = str6;
        this.uploaderName = str7;
        this.uploaderUin = j4;
        this.parentFolderId = str8;
        this.localPath = str9;
        this.transStatus = i6;
        this.transType = i7;
        this.elementId = j5;
        this.isFolder = z;
    }
}
