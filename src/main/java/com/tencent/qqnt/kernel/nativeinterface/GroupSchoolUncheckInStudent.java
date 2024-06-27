package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolUncheckInStudent.class */
public final class GroupSchoolUncheckInStudent {
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public long remindTime;
    public long uin;

    public String getName() {
        return this.name;
    }

    public long getRemindTime() {
        return this.remindTime;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "GroupSchoolUncheckInStudent{uin=" + this.uin + ",name=" + this.name + ",remindTime=" + this.remindTime + ",}";
    }
}
