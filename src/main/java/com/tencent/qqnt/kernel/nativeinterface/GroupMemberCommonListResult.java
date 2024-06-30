package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberCommonListResult.class */
public final class GroupMemberCommonListResult {
    public long groupCode;
    public int identifyFlag;
    public long startUin;
    public ArrayList<MemberCommonInfo> memberList = new ArrayList<>();
    public String strErrorInfo = "";

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getIdentifyFlag() {
        return this.identifyFlag;
    }

    public ArrayList<MemberCommonInfo> getMemberList() {
        return this.memberList;
    }

    public long getStartUin() {
        return this.startUin;
    }

    public String getStrErrorInfo() {
        return this.strErrorInfo;
    }

    public String toString() {
        return "GroupMemberCommonListResult{groupCode=" + this.groupCode + ",startUin=" + this.startUin + ",identifyFlag=" + this.identifyFlag + ",memberList=" + this.memberList + ",strErrorInfo=" + this.strErrorInfo + ",}";
    }
}
