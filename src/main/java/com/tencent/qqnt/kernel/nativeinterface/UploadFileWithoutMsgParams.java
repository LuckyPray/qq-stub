package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UploadFileWithoutMsgParams.class */
public final class UploadFileWithoutMsgParams {
    public RMBizTypeEnum bizType;
    public String filePath;
    public String peerUid;
    public int transferId;
    public boolean useNTV2;

    public UploadFileWithoutMsgParams() {
        this.bizType = RMBizTypeEnum.values()[0];
        this.filePath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public RMBizTypeEnum getBizType() {
        return this.bizType;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public int getTransferId() {
        return this.transferId;
    }

    public boolean getUseNTV2() {
        return this.useNTV2;
    }

    public String toString() {
        return "UploadFileWithoutMsgParams{transferId=" + this.transferId + ",bizType=" + this.bizType + ",filePath=" + this.filePath + ",peerUid=" + this.peerUid + ",useNTV2=" + this.useNTV2 + ",}";
    }

    public UploadFileWithoutMsgParams(int i, RMBizTypeEnum rMBizTypeEnum, String str, String str2, boolean z) {
        this.bizType = RMBizTypeEnum.values()[0];
        this.filePath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.transferId = i;
        this.bizType = rMBizTypeEnum;
        this.filePath = str;
        this.peerUid = str2;
        this.useNTV2 = z;
    }
}
