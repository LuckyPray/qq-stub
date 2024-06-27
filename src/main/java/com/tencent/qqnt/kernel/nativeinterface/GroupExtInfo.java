package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupExtInfo.class */
public final class GroupExtInfo {
    public GroupExt extInfo = new GroupExt();
    public long groupCode;
    public int resultCode;

    public GroupExt getExtInfo() {
        return this.extInfo;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String toString() {
        return "GroupExtInfo{groupCode=" + this.groupCode + ",resultCode=" + this.resultCode + ",extInfo=" + this.extInfo + ",}";
    }
}
