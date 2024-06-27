package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSpaceResult.class */
public final class GroupSpaceResult {
    public boolean allUpload;
    public String clientWording;
    public int retCode;
    public String retMsg;
    public long totalSpace;
    public long usedSpace;

    public GroupSpaceResult() {
        this.retMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientWording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public boolean getAllUpload() {
        return this.allUpload;
    }

    public String getClientWording() {
        return this.clientWording;
    }

    public int getRetCode() {
        return this.retCode;
    }

    public String getRetMsg() {
        return this.retMsg;
    }

    public long getTotalSpace() {
        return this.totalSpace;
    }

    public long getUsedSpace() {
        return this.usedSpace;
    }

    public String toString() {
        return "GroupSpaceResult{retCode=" + this.retCode + ",retMsg=" + this.retMsg + ",clientWording=" + this.clientWording + ",totalSpace=" + this.totalSpace + ",usedSpace=" + this.usedSpace + ",allUpload=" + this.allUpload + ",}";
    }

    public GroupSpaceResult(int i, String str, String str2, long j, long j2, boolean z) {
        this.retMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientWording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.retCode = i;
        this.retMsg = str;
        this.clientWording = str2;
        this.totalSpace = j;
        this.usedSpace = j2;
        this.allUpload = z;
    }
}
