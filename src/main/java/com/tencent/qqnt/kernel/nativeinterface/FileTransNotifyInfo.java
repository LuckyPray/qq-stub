package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FileTransNotifyInfo.class */
public final class FileTransNotifyInfo {
    public int businessId;
    public Integer chatType;
    public String clientMsg;
    public CommonFileInfo commonFileInfo;
    public int fileDownType;
    public long fileErrCode;
    public String fileErrMsg;
    public String fileId;
    public long fileModelId;
    public String filePath;
    public long fileProgress;
    public long fileSpeed;
    public long fileSrvErrCode;
    public long msgElementId;
    public long msgId;
    public MsgRecord msgRecord;
    public int step;
    public int thumbSize;
    public long totalSize;
    public int trasferStatus;
    public Long userTotalSpacePerDay;
    public Long userUsedSpacePerDay;

    public FileTransNotifyInfo() {
        this.fileId = "";
        this.fileErrMsg = "";
        this.filePath = "";
        this.clientMsg = "";
    }

    public int getBusinessId() {
        return this.businessId;
    }

    public Integer getChatType() {
        return this.chatType;
    }

    public String getClientMsg() {
        return this.clientMsg;
    }

    public CommonFileInfo getCommonFileInfo() {
        return this.commonFileInfo;
    }

    public int getFileDownType() {
        return this.fileDownType;
    }

    public long getFileErrCode() {
        return this.fileErrCode;
    }

    public String getFileErrMsg() {
        return this.fileErrMsg;
    }

    public String getFileId() {
        return this.fileId;
    }

    public long getFileModelId() {
        return this.fileModelId;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getFileProgress() {
        return this.fileProgress;
    }

    public long getFileSpeed() {
        return this.fileSpeed;
    }

    public long getFileSrvErrCode() {
        return this.fileSrvErrCode;
    }

    public long getMsgElementId() {
        return this.msgElementId;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public MsgRecord getMsgRecord() {
        return this.msgRecord;
    }

    public int getStep() {
        return this.step;
    }

    public int getThumbSize() {
        return this.thumbSize;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public int getTrasferStatus() {
        return this.trasferStatus;
    }

    public Long getUserTotalSpacePerDay() {
        return this.userTotalSpacePerDay;
    }

    public Long getUserUsedSpacePerDay() {
        return this.userUsedSpacePerDay;
    }

    public String toString() {
        return "FileTransNotifyInfo{fileModelId=" + this.fileModelId + ",msgElementId=" + this.msgElementId + ",msgId=" + this.msgId + ",fileId=" + this.fileId + ",fileProgress=" + this.fileProgress + ",fileSpeed=" + this.fileSpeed + ",fileErrCode=" + this.fileErrCode + ",fileErrMsg=" + this.fileErrMsg + ",fileDownType=" + this.fileDownType + ",thumbSize=" + this.thumbSize + ",filePath=" + this.filePath + ",totalSize=" + this.totalSize + ",trasferStatus=" + this.trasferStatus + ",step=" + this.step + ",commonFileInfo=" + this.commonFileInfo + ",fileSrvErrCode=" + this.fileSrvErrCode + ",clientMsg=" + this.clientMsg + ",businessId=" + this.businessId + ",userTotalSpacePerDay=" + this.userTotalSpacePerDay + ",userUsedSpacePerDay=" + this.userUsedSpacePerDay + ",msgRecord=" + this.msgRecord + ",chatType=" + this.chatType + ",}";
    }

    public FileTransNotifyInfo(long j, long j2, long j3, String str, long j4, long j5, long j6, String str2, int i, int i2, String str3, long j7, int i3, int i4, CommonFileInfo commonFileInfo, long j8, String str4, int i5, Long l, Long l2, MsgRecord msgRecord, Integer num) {
        this.fileId = "";
        this.fileErrMsg = "";
        this.filePath = "";
        this.clientMsg = "";
        this.fileModelId = j;
        this.msgElementId = j2;
        this.msgId = j3;
        this.fileId = str;
        this.fileProgress = j4;
        this.fileSpeed = j5;
        this.fileErrCode = j6;
        this.fileErrMsg = str2;
        this.fileDownType = i;
        this.thumbSize = i2;
        this.filePath = str3;
        this.totalSize = j7;
        this.trasferStatus = i3;
        this.step = i4;
        this.commonFileInfo = commonFileInfo;
        this.fileSrvErrCode = j8;
        this.clientMsg = str4;
        this.businessId = i5;
        this.userTotalSpacePerDay = l;
        this.userUsedSpacePerDay = l2;
        this.msgRecord = msgRecord;
        this.chatType = num;
    }
}
