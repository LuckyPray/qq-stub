package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskPublishGroupInfo.class */
public final class GroupSchoolTaskPublishGroupInfo {
    public long groupCode;
    public String groupName = "";

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String toString() {
        return "GroupSchoolTaskPublishGroupInfo{groupCode=" + this.groupCode + ",groupName=" + this.groupName + ",}";
    }
}
