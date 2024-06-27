package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskDetailReq.class */
public final class GroupSchoolTaskDetailReq {
    public long groupCode;
    public String taskId;

    public GroupSchoolTaskDetailReq() {
        this.taskId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String toString() {
        return "GroupSchoolTaskDetailReq{groupCode=" + this.groupCode + ",taskId=" + this.taskId + ",}";
    }

    public GroupSchoolTaskDetailReq(long j, String str) {
        this.taskId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupCode = j;
        this.taskId = str;
    }
}
