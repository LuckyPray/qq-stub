package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BatchGetGroupSchoolRoleReq.class */
public final class BatchGetGroupSchoolRoleReq {
    public ArrayList<Long> groupCodes;
    public int type;

    public BatchGetGroupSchoolRoleReq() {
        this.groupCodes = new ArrayList<>();
    }

    public ArrayList<Long> getGroupCodes() {
        return this.groupCodes;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "BatchGetGroupSchoolRoleReq{groupCodes=" + this.groupCodes + ",type=" + this.type + ",}";
    }

    public BatchGetGroupSchoolRoleReq(ArrayList<Long> arrayList, int i) {
        this.groupCodes = new ArrayList<>();
        this.groupCodes = arrayList;
        this.type = i;
    }
}
