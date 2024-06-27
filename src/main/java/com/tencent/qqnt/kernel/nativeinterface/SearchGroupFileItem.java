package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupFileItem.class */
public final class SearchGroupFileItem {
    public int busId;
    public int deadTime;
    public int downloadTimes;
    public String fileId;
    public long fileModelId;
    public String fileName;
    public ArrayList<SearchHitInfo> fileNameHits;
    public long fileSize;
    public long groupCode;
    public String groupName;
    public String localPath;
    public long matchUin;
    public ArrayList<String> matchWords;
    public int modifyTime;
    public int uploadTime;
    public String uploaderName;
    public long uploaderUin;

    public SearchGroupFileItem() {
        this.groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uploaderName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.matchWords = new ArrayList<>();
        this.fileNameHits = new ArrayList<>();
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
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

    public String getFileId() {
        return this.fileId;
    }

    public long getFileModelId() {
        return this.fileModelId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public ArrayList<SearchHitInfo> getFileNameHits() {
        return this.fileNameHits;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public long getMatchUin() {
        return this.matchUin;
    }

    public ArrayList<String> getMatchWords() {
        return this.matchWords;
    }

    public int getModifyTime() {
        return this.modifyTime;
    }

    public int getUploadTime() {
        return this.uploadTime;
    }

    public String getUploaderName() {
        return this.uploaderName;
    }

    public long getUploaderUin() {
        return this.uploaderUin;
    }

    public String toString() {
        return "SearchGroupFileItem{groupCode=" + this.groupCode + ",groupName=" + this.groupName + ",uploaderUin=" + this.uploaderUin + ",uploaderName=" + this.uploaderName + ",matchUin=" + this.matchUin + ",matchWords=" + this.matchWords + ",fileNameHits=" + this.fileNameHits + ",fileModelId=" + this.fileModelId + ",fileId=" + this.fileId + ",fileName=" + this.fileName + ",fileSize=" + this.fileSize + ",busId=" + this.busId + ",uploadTime=" + this.uploadTime + ",modifyTime=" + this.modifyTime + ",deadTime=" + this.deadTime + ",downloadTimes=" + this.downloadTimes + ",localPath=" + this.localPath + ",}";
    }

    public SearchGroupFileItem(long j, String str, long j2, String str2, long j3, ArrayList<String> arrayList, ArrayList<SearchHitInfo> arrayList2, long j4, String str3, String str4, long j5, int i, int i2, int i3, int i4, int i5, String str5) {
        this.groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uploaderName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.matchWords = new ArrayList<>();
        this.fileNameHits = new ArrayList<>();
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.localPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupCode = j;
        this.groupName = str;
        this.uploaderUin = j2;
        this.uploaderName = str2;
        this.matchUin = j3;
        this.matchWords = arrayList;
        this.fileNameHits = arrayList2;
        this.fileModelId = j4;
        this.fileId = str3;
        this.fileName = str4;
        this.fileSize = j5;
        this.busId = i;
        this.uploadTime = i2;
        this.modifyTime = i3;
        this.deadTime = i4;
        this.downloadTimes = i5;
        this.localPath = str5;
    }
}
