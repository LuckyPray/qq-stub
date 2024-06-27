package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskListRsp.class */
public final class GroupSchoolTaskListRsp {
    public ArrayList<GroupSchoolTaskData> datas = new ArrayList<>();
    public long groupCode;
    public boolean isEnd;

    public ArrayList<GroupSchoolTaskData> getDatas() {
        return this.datas;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public String toString() {
        return "GroupSchoolTaskListRsp{groupCode=" + this.groupCode + ",datas=" + this.datas + ",isEnd=" + this.isEnd + ",}";
    }
}
