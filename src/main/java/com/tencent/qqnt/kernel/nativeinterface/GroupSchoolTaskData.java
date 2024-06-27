package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskData.class */
public final class GroupSchoolTaskData {
    public boolean allowMakeUp;
    public long authorUin;
    public int progress;
    public long publishTime;
    public int status;
    public String taskId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public GroupSchoolNoticeContent content = new GroupSchoolNoticeContent();
    public GroupSchoolTaskTimeSettings timeSettings = new GroupSchoolTaskTimeSettings();
    public ArrayList<GroupSchoolTaskPublishGroupInfo> groups = new ArrayList<>();

    public boolean getAllowMakeUp() {
        return this.allowMakeUp;
    }

    public long getAuthorUin() {
        return this.authorUin;
    }

    public GroupSchoolNoticeContent getContent() {
        return this.content;
    }

    public ArrayList<GroupSchoolTaskPublishGroupInfo> getGroups() {
        return this.groups;
    }

    public int getProgress() {
        return this.progress;
    }

    public long getPublishTime() {
        return this.publishTime;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public GroupSchoolTaskTimeSettings getTimeSettings() {
        return this.timeSettings;
    }

    public String toString() {
        return "GroupSchoolTaskData{taskId=" + this.taskId + ",authorUin=" + this.authorUin + ",content=" + this.content + ",timeSettings=" + this.timeSettings + ",groups=" + this.groups + ",progress=" + this.progress + ",status=" + this.status + ",allowMakeUp=" + this.allowMakeUp + ",publishTime=" + this.publishTime + ",}";
    }
}
