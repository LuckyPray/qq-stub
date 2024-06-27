package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchTabInfo.class */
public final class SearchTabInfo {
    public long tabMask;
    public String tabName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public long getTabMask() {
        return this.tabMask;
    }

    public String getTabName() {
        return this.tabName;
    }

    public String toString() {
        return "SearchTabInfo{tabName=" + this.tabName + ",tabMask=" + this.tabMask + ",}";
    }
}
