package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CreateGroupResult.class */
public final class CreateGroupResult {
    public long groupCode;
    public ArrayList<SecurityInfo> securityInfo;

    public CreateGroupResult() {
        this.securityInfo = new ArrayList<>();
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public ArrayList<SecurityInfo> getSecurityInfo() {
        return this.securityInfo;
    }

    public String toString() {
        return "CreateGroupResult{groupCode=" + this.groupCode + ",securityInfo=" + this.securityInfo + ",}";
    }

    public CreateGroupResult(long j, ArrayList<SecurityInfo> arrayList) {
        this.securityInfo = new ArrayList<>();
        this.groupCode = j;
        this.securityInfo = arrayList;
    }
}
