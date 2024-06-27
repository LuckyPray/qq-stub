package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberHonorReq.class */
public final class GroupMemberHonorReq {
    public ArrayList<Long> groupCode = new ArrayList<>();

    public ArrayList<Long> getGroupCode() {
        return this.groupCode;
    }

    public String toString() {
        return "GroupMemberHonorReq{groupCode=" + this.groupCode + ",}";
    }
}
