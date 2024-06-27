package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTemplateListReq.class */
public final class GroupSchoolTemplateListReq {
    public int page;
    public int pageSize;
    public int type;

    public GroupSchoolTemplateListReq() {
    }

    public int getPage() {
        return this.page;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "GroupSchoolTemplateListReq{page=" + this.page + ",pageSize=" + this.pageSize + ",type=" + this.type + ",}";
    }

    public GroupSchoolTemplateListReq(int i, int i2, int i3) {
        this.page = i;
        this.pageSize = i2;
        this.type = i3;
    }
}
