package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskCheckInInfoRsp.class */
public final class GroupSchoolTaskCheckInInfoRsp {
    public ArrayList<GroupSchoolTaskCheckInStatusInfo> states = new ArrayList<>();
    public GroupSchoolTaskCheckInInfo records = new GroupSchoolTaskCheckInInfo();

    public GroupSchoolTaskCheckInInfo getRecords() {
        return this.records;
    }

    public ArrayList<GroupSchoolTaskCheckInStatusInfo> getStates() {
        return this.states;
    }

    public String toString() {
        return "GroupSchoolTaskCheckInInfoRsp{states=" + this.states + ",records=" + this.records + ",}";
    }
}
