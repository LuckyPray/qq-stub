package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PublishGroupSchoolTaskReq.class */
public final class PublishGroupSchoolTaskReq {
    public boolean allowMakeUp;
    public GroupSchoolNoticeContent content;
    public long groupCode;
    public long reminderTime;
    public ArrayList<Long> syncGroups;
    public GroupSchoolTaskTimeSettings timeSettings;

    public PublishGroupSchoolTaskReq() {
        this.content = new GroupSchoolNoticeContent();
        this.syncGroups = new ArrayList<>();
        this.timeSettings = new GroupSchoolTaskTimeSettings();
    }

    public boolean getAllowMakeUp() {
        return this.allowMakeUp;
    }

    public GroupSchoolNoticeContent getContent() {
        return this.content;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public long getReminderTime() {
        return this.reminderTime;
    }

    public ArrayList<Long> getSyncGroups() {
        return this.syncGroups;
    }

    public GroupSchoolTaskTimeSettings getTimeSettings() {
        return this.timeSettings;
    }

    public String toString() {
        return "PublishGroupSchoolTaskReq{groupCode=" + this.groupCode + ",content=" + this.content + ",syncGroups=" + this.syncGroups + ",timeSettings=" + this.timeSettings + ",reminderTime=" + this.reminderTime + ",allowMakeUp=" + this.allowMakeUp + ",}";
    }

    public PublishGroupSchoolTaskReq(long j, GroupSchoolNoticeContent groupSchoolNoticeContent, ArrayList<Long> arrayList, GroupSchoolTaskTimeSettings groupSchoolTaskTimeSettings, long j2, boolean z) {
        this.content = new GroupSchoolNoticeContent();
        this.syncGroups = new ArrayList<>();
        this.timeSettings = new GroupSchoolTaskTimeSettings();
        this.groupCode = j;
        this.content = groupSchoolNoticeContent;
        this.syncGroups = arrayList;
        this.timeSettings = groupSchoolTaskTimeSettings;
        this.reminderTime = j2;
        this.allowMakeUp = z;
    }
}
