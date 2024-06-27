package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTemplateListRsp.class */
public final class GroupSchoolTemplateListRsp {
    public ArrayList<GroupSchoolTemplateData> datas = new ArrayList<>();
    public boolean isEnd;

    public ArrayList<GroupSchoolTemplateData> getDatas() {
        return this.datas;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public String toString() {
        return "GroupSchoolTemplateListRsp{datas=" + this.datas + ",isEnd=" + this.isEnd + ",}";
    }
}
