package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTemplateData.class */
public final class GroupSchoolTemplateData {

    /* renamed from: id */
    public String f21id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String course = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getContent() {
        return this.content;
    }

    public String getCourse() {
        return this.course;
    }

    public String getId() {
        return this.f21id;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "GroupSchoolTemplateData{id=" + this.f21id + ",title=" + this.title + ",content=" + this.content + ",course=" + this.course + ",}";
    }
}
