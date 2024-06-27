package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskStatisticsRsp.class */
public final class GroupSchoolTaskStatisticsRsp {
    public int checkedInStudents;
    public boolean isEnd;
    public ArrayList<GroupSchoolTaskCheckInInfo> records = new ArrayList<>();
    public int requiredStudents;

    public int getCheckedInStudents() {
        return this.checkedInStudents;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public ArrayList<GroupSchoolTaskCheckInInfo> getRecords() {
        return this.records;
    }

    public int getRequiredStudents() {
        return this.requiredStudents;
    }

    public String toString() {
        return "GroupSchoolTaskStatisticsRsp{requiredStudents=" + this.requiredStudents + ",checkedInStudents=" + this.checkedInStudents + ",records=" + this.records + ",isEnd=" + this.isEnd + ",}";
    }
}
