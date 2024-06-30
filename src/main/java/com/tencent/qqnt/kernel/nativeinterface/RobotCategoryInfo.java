package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotCategoryInfo.class */
public final class RobotCategoryInfo {
    public long listenerId;
    public String categoryId = "";
    public String name = "";

    public String getCategoryId() {
        return this.categoryId;
    }

    public long getListenerId() {
        return this.listenerId;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "RobotCategoryInfo{listenerId=" + this.listenerId + ",categoryId=" + this.categoryId + ",name=" + this.name + ",}";
    }
}
