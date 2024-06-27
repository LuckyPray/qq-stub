package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StFeedCellLBS.class */
public final class StFeedCellLBS {
    public StLBS lbs = new StLBS();
    public String iconToken = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getIconToken() {
        return this.iconToken;
    }

    public StLBS getLbs() {
        return this.lbs;
    }

    public void setIconToken(String str) {
        this.iconToken = str;
    }

    public void setLbs(StLBS stLBS) {
        this.lbs = stLBS;
    }
}
