package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CleanFileDetail.class */
public final class CleanFileDetail {
    public int chatType;
    public String fileName;
    public String filePath;
    public long fileSize;
    public long fileTime;
    public long forwardSubMsgId;
    public long msgId;
    public String peerUid;
    public boolean wildFile;

    public CleanFileDetail() {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.filePath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getChatType() {
        return this.chatType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public long getFileTime() {
        return this.fileTime;
    }

    public long getForwardSubMsgId() {
        return this.forwardSubMsgId;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public boolean getWildFile() {
        return this.wildFile;
    }

    public String toString() {
        return "CleanFileDetail{msgId=" + this.msgId + ",forwardSubMsgId=" + this.forwardSubMsgId + ",peerUid=" + this.peerUid + ",chatType=" + this.chatType + ",fileTime=" + this.fileTime + ",fileName=" + this.fileName + ",fileSize=" + this.fileSize + ",filePath=" + this.filePath + ",wildFile=" + this.wildFile + ",}";
    }

    public CleanFileDetail(long j, long j2, String str, int i, long j3, String str2, long j4, String str3, boolean z) {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.filePath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msgId = j;
        this.forwardSubMsgId = j2;
        this.peerUid = str;
        this.chatType = i;
        this.fileTime = j3;
        this.fileName = str2;
        this.fileSize = j4;
        this.filePath = str3;
        this.wildFile = z;
    }
}
