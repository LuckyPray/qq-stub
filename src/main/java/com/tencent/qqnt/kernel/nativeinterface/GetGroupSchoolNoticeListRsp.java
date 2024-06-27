package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetGroupSchoolNoticeListRsp.class */
public final class GetGroupSchoolNoticeListRsp {
    public ArrayList<GroupSchoolNoticeData> datas = new ArrayList<>();
    public long groupCode;
    public boolean isEnd;

    public ArrayList<GroupSchoolNoticeData> getDatas() {
        return this.datas;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public String toString() {
        return "GetGroupSchoolNoticeListRsp{groupCode=" + this.groupCode + ",datas=" + this.datas + ",isEnd=" + this.isEnd + ",}";
    }
}
