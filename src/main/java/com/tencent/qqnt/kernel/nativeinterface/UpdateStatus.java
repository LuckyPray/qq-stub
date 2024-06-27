package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UpdateStatus.class */
public final class UpdateStatus {
    public String filePath;
    public Long fileProgress;
    public Long fileSize;
    public Integer fileSpeed;
    public FileAssistantStatus fileStatus;

    /* renamed from: id */
    public String f53id;
    public String thumbPath;

    public UpdateStatus() {
        this.f53id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public Long getFileProgress() {
        return this.fileProgress;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public Integer getFileSpeed() {
        return this.fileSpeed;
    }

    public FileAssistantStatus getFileStatus() {
        return this.fileStatus;
    }

    public String getId() {
        return this.f53id;
    }

    public String getThumbPath() {
        return this.thumbPath;
    }

    public String toString() {
        return "UpdateStatus{id=" + this.f53id + ",fileStatus=" + this.fileStatus + ",fileProgress=" + this.fileProgress + ",fileSize=" + this.fileSize + ",fileSpeed=" + this.fileSpeed + ",thumbPath=" + this.thumbPath + ",filePath=" + this.filePath + ",}";
    }

    public UpdateStatus(String str, FileAssistantStatus fileAssistantStatus, Long l, Long l2, Integer num, String str2, String str3) {
        this.f53id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f53id = str;
        this.fileStatus = fileAssistantStatus;
        this.fileProgress = l;
        this.fileSize = l2;
        this.fileSpeed = num;
        this.thumbPath = str2;
        this.filePath = str3;
    }
}
