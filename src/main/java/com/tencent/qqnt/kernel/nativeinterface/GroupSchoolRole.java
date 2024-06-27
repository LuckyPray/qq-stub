package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolRole.class */
public final class GroupSchoolRole {
    public long groupCode;
    public int groupRoleId;
    public boolean overLimit;
    public int roleId;
    public int studentNum;

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getGroupRoleId() {
        return this.groupRoleId;
    }

    public boolean getOverLimit() {
        return this.overLimit;
    }

    public int getRoleId() {
        return this.roleId;
    }

    public int getStudentNum() {
        return this.studentNum;
    }

    public String toString() {
        return "GroupSchoolRole{groupCode=" + this.groupCode + ",roleId=" + this.roleId + ",studentNum=" + this.studentNum + ",overLimit=" + this.overLimit + ",groupRoleId=" + this.groupRoleId + ",}";
    }
}
