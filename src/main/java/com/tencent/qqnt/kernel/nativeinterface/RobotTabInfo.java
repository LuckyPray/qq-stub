package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotTabInfo.class */
public final class RobotTabInfo {
    public String tabId = "";
    public String name = "";

    public String getName() {
        return this.name;
    }

    public String getTabId() {
        return this.tabId;
    }

    public String toString() {
        return "RobotTabInfo{tabId=" + this.tabId + ",name=" + this.name + ",}";
    }
}
