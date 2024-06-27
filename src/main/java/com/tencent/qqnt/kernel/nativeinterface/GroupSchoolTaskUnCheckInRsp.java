package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskUnCheckInRsp.class */
public final class GroupSchoolTaskUnCheckInRsp {
    public boolean isAllRemind;
    public boolean isEnd;
    public ArrayList<GroupSchoolUncheckInStudent> students = new ArrayList<>();
    public int total;

    public boolean getIsAllRemind() {
        return this.isAllRemind;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public ArrayList<GroupSchoolUncheckInStudent> getStudents() {
        return this.students;
    }

    public int getTotal() {
        return this.total;
    }

    public String toString() {
        return "GroupSchoolTaskUnCheckInRsp{students=" + this.students + ",isAllRemind=" + this.isAllRemind + ",isEnd=" + this.isEnd + ",total=" + this.total + ",}";
    }
}
