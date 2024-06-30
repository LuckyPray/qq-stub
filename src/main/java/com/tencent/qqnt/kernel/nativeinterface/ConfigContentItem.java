package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ConfigContentItem.class */
public final class ConfigContentItem {
    public String content;
    public int taskId;

    public ConfigContentItem() {
        this.content = "";
    }

    public String getContent() {
        return this.content;
    }

    public int getTaskId() {
        return this.taskId;
    }

    public String toString() {
        return "ConfigContentItem{taskId=" + this.taskId + ",content=" + this.content + ",}";
    }

    public ConfigContentItem(int i, String str) {
        this.content = "";
        this.taskId = i;
        this.content = str;
    }
}
