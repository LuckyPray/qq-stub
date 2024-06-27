package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskCheckInInfo.class */
public final class GroupSchoolTaskCheckInInfo {
    public long checkInTime;
    public boolean isMakeUp;
    public long uin;
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public GroupSchoolNoticeContent content = new GroupSchoolNoticeContent();

    public long getCheckInTime() {
        return this.checkInTime;
    }

    public GroupSchoolNoticeContent getContent() {
        return this.content;
    }

    public boolean getIsMakeUp() {
        return this.isMakeUp;
    }

    public String getName() {
        return this.name;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "GroupSchoolTaskCheckInInfo{uin=" + this.uin + ",name=" + this.name + ",content=" + this.content + ",checkInTime=" + this.checkInTime + ",isMakeUp=" + this.isMakeUp + ",}";
    }
}
