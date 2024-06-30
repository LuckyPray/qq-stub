package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolNoticeReceiverInfo.class */
public final class GroupSchoolNoticeReceiverInfo {
    public long confirmTime;
    public String name = "";
    public long remindTime;
    public long uin;

    public long getConfirmTime() {
        return this.confirmTime;
    }

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
        return "GroupSchoolNoticeReceiverInfo{uin=" + this.uin + ",confirmTime=" + this.confirmTime + ",remindTime=" + this.remindTime + ",name=" + this.name + ",}";
    }
}
