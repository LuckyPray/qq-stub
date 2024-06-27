package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StFeedCellQunInfo.class */
public final class StFeedCellQunInfo {
    public String qunId;

    public StFeedCellQunInfo() {
        this.qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getQunId() {
        return this.qunId;
    }

    public StFeedCellQunInfo(String str) {
        this.qunId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.qunId = str;
    }
}
