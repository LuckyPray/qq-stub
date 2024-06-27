package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UploadStatusParams.class */
public final class UploadStatusParams {
    public int chatType;
    public long elemId;
    public long modelId;
    public long msgId;
    public String path;
    public String peerUid;
    public int status;

    public UploadStatusParams() {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.path = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getChatType() {
        return this.chatType;
    }

    public long getElemId() {
        return this.elemId;
    }

    public long getModelId() {
        return this.modelId;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getPath() {
        return this.path;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "UploadStatusParams{msgId=" + this.msgId + ",elemId=" + this.elemId + ",modelId=" + this.modelId + ",peerUid=" + this.peerUid + ",chatType=" + this.chatType + ",status=" + this.status + ",path=" + this.path + ",}";
    }

    public UploadStatusParams(long j, long j2, long j3, String str, int i, int i2, String str2) {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.path = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msgId = j;
        this.elemId = j2;
        this.modelId = j3;
        this.peerUid = str;
        this.chatType = i;
        this.status = i2;
        this.path = str2;
    }
}
