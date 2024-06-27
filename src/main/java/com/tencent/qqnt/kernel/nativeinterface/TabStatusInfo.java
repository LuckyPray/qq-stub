package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TabStatusInfo.class */
public final class TabStatusInfo {
    public boolean isExistence;
    public long tabId;

    public TabStatusInfo() {
    }

    public boolean getIsExistence() {
        return this.isExistence;
    }

    public long getTabId() {
        return this.tabId;
    }

    public String toString() {
        return "TabStatusInfo{tabId=" + this.tabId + ",isExistence=" + this.isExistence + ",}";
    }

    public TabStatusInfo(long j, boolean z) {
        this.tabId = j;
        this.isExistence = z;
    }
}
