package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskIndex.class */
public final class GroupSchoolTaskIndex {
    public long groupCode;
    public String taskId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String toString() {
        return "GroupSchoolTaskIndex{taskId=" + this.taskId + ",groupCode=" + this.groupCode + ",}";
    }
}
