package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StatusUnit.class */
public final class StatusUnit {
    public boolean isNeedContinueQuery;
    public int status;
    public String mediaId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String errMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getErrMsg() {
        return this.errMsg;
    }

    public boolean getIsNeedContinueQuery() {
        return this.isNeedContinueQuery;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public int getStatus() {
        return this.status;
    }
}
