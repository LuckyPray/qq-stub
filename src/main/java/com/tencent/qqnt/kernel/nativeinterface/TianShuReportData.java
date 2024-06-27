package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TianShuReportData.class */
public final class TianShuReportData {
    public int mActionAttr;
    public int mActionId;
    public int mActionValue;
    public String mAppId;
    public String mItemId;
    public String mPageId;
    public String mSubItemId;

    public TianShuReportData() {
        this.mAppId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mPageId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mItemId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mSubItemId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getMActionAttr() {
        return this.mActionAttr;
    }

    public int getMActionId() {
        return this.mActionId;
    }

    public int getMActionValue() {
        return this.mActionValue;
    }

    public String getMAppId() {
        return this.mAppId;
    }

    public String getMItemId() {
        return this.mItemId;
    }

    public String getMPageId() {
        return this.mPageId;
    }

    public String getMSubItemId() {
        return this.mSubItemId;
    }

    public String toString() {
        return "TianShuReportData{mAppId=" + this.mAppId + ",mPageId=" + this.mPageId + ",mItemId=" + this.mItemId + ",mSubItemId=" + this.mSubItemId + ",mActionId=" + this.mActionId + ",mActionValue=" + this.mActionValue + ",mActionAttr=" + this.mActionAttr + ",}";
    }

    public TianShuReportData(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this.mAppId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mPageId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mItemId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mSubItemId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mAppId = str;
        this.mPageId = str2;
        this.mItemId = str3;
        this.mSubItemId = str4;
        this.mActionId = i;
        this.mActionValue = i2;
        this.mActionAttr = i3;
    }
}
