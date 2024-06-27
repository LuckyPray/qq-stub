package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskCheckInInfoReq.class */
public final class GroupSchoolTaskCheckInInfoReq {
    public long date;
    public long groupCode;
    public boolean needState;
    public String taskId;

    public GroupSchoolTaskCheckInInfoReq() {
        this.taskId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getDate() {
        return this.date;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public boolean getNeedState() {
        return this.needState;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String toString() {
        return "GroupSchoolTaskCheckInInfoReq{groupCode=" + this.groupCode + ",taskId=" + this.taskId + ",date=" + this.date + ",needState=" + this.needState + ",}";
    }

    public GroupSchoolTaskCheckInInfoReq(long j, String str, long j2, boolean z) {
        this.taskId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupCode = j;
        this.taskId = str;
        this.date = j2;
        this.needState = z;
    }
}
