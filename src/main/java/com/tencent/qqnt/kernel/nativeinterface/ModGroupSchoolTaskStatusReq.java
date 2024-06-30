package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ModGroupSchoolTaskStatusReq.class */
public final class ModGroupSchoolTaskStatusReq {
    public int desStatus;
    public long groupCode;
    public int source;
    public String taskId;

    public ModGroupSchoolTaskStatusReq() {
        this.taskId = "";
    }

    public int getDesStatus() {
        return this.desStatus;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getSource() {
        return this.source;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String toString() {
        return "ModGroupSchoolTaskStatusReq{groupCode=" + this.groupCode + ",taskId=" + this.taskId + ",desStatus=" + this.desStatus + ",source=" + this.source + ",}";
    }

    public ModGroupSchoolTaskStatusReq(long j, String str, int i, int i2) {
        this.taskId = "";
        this.groupCode = j;
        this.taskId = str;
        this.desStatus = i;
        this.source = i2;
    }
}
