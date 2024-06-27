package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TemplateGroup.class */
public final class TemplateGroup {

    /* renamed from: id */
    public long f50id;
    public ArrayList<RobotTemplateInfo> templateList = new ArrayList<>();
    public int type;

    public long getId() {
        return this.f50id;
    }

    public ArrayList<RobotTemplateInfo> getTemplateList() {
        return this.templateList;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "TemplateGroup{id=" + this.f50id + ",type=" + this.type + ",templateList=" + this.templateList + ",}";
    }
}
