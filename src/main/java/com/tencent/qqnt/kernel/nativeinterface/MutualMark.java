package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MutualMark.class */
public final class MutualMark {
    public Integer closeFlag;
    public long continueDays;
    public float count;
    public ResourceInfo gradeResourceInfo;
    public boolean hasRemindInContact;
    public String iconFormat;
    public long iconStatus;
    public Long iconStatusEndTime;
    public String iconUrl;
    public boolean isWearing;
    public long lastActionTime;
    public Long lastChangTime;
    public long level;
    public long lightUpTime;
    public long markFlag;
    public Integer markVersion;
    public String maxVersion;
    public String minVersion;
    public int orderNum;
    public Long remindAnimStartTime;
    public ResourceInfo resourceInfo;
    public String strCluster;
    public long subLevel;
    public long type;

    public MutualMark() {
    }

    public Integer getCloseFlag() {
        return this.closeFlag;
    }

    public long getContinueDays() {
        return this.continueDays;
    }

    public float getCount() {
        return this.count;
    }

    public ResourceInfo getGradeResourceInfo() {
        return this.gradeResourceInfo;
    }

    public boolean getHasRemindInContact() {
        return this.hasRemindInContact;
    }

    public String getIconFormat() {
        return this.iconFormat;
    }

    public long getIconStatus() {
        return this.iconStatus;
    }

    public Long getIconStatusEndTime() {
        return this.iconStatusEndTime;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public boolean getIsWearing() {
        return this.isWearing;
    }

    public long getLastActionTime() {
        return this.lastActionTime;
    }

    public Long getLastChangTime() {
        return this.lastChangTime;
    }

    public long getLevel() {
        return this.level;
    }

    public long getLightUpTime() {
        return this.lightUpTime;
    }

    public long getMarkFlag() {
        return this.markFlag;
    }

    public Integer getMarkVersion() {
        return this.markVersion;
    }

    public String getMaxVersion() {
        return this.maxVersion;
    }

    public String getMinVersion() {
        return this.minVersion;
    }

    public int getOrderNum() {
        return this.orderNum;
    }

    public Long getRemindAnimStartTime() {
        return this.remindAnimStartTime;
    }

    public ResourceInfo getResourceInfo() {
        return this.resourceInfo;
    }

    public String getStrCluster() {
        return this.strCluster;
    }

    public long getSubLevel() {
        return this.subLevel;
    }

    public long getType() {
        return this.type;
    }

    public String toString() {
        return "MutualMark{markFlag=" + this.markFlag + ",type=" + this.type + ",level=" + this.level + ",count=" + this.count + ",continueDays=" + this.continueDays + ",lastActionTime=" + this.lastActionTime + ",iconStatus=" + this.iconStatus + ",subLevel=" + this.subLevel + ",iconStatusEndTime=" + this.iconStatusEndTime + ",closeFlag=" + this.closeFlag + ",strCluster=" + this.strCluster + ",resourceInfo=" + this.resourceInfo + ",gradeResourceInfo=" + this.gradeResourceInfo + ",minVersion=" + this.minVersion + ",maxVersion=" + this.maxVersion + ",iconUrl=" + this.iconUrl + ",markVersion=" + this.markVersion + ",lightUpTime=" + this.lightUpTime + ",isWearing=" + this.isWearing + ",iconFormat=" + this.iconFormat + ",orderNum=" + this.orderNum + ",lastChangTime=" + this.lastChangTime + ",hasRemindInContact=" + this.hasRemindInContact + ",remindAnimStartTime=" + this.remindAnimStartTime + ",}";
    }

    public MutualMark(long j, long j2, long j3, float f, long j4, long j5, long j6, long j7, Long l, Integer num, String str, ResourceInfo resourceInfo, ResourceInfo resourceInfo2, String str2, String str3, String str4, Integer num2, long j8, boolean z, String str5, int i, Long l2, boolean z2, Long l3) {
        this.markFlag = j;
        this.type = j2;
        this.level = j3;
        this.count = f;
        this.continueDays = j4;
        this.lastActionTime = j5;
        this.iconStatus = j6;
        this.subLevel = j7;
        this.iconStatusEndTime = l;
        this.closeFlag = num;
        this.strCluster = str;
        this.resourceInfo = resourceInfo;
        this.gradeResourceInfo = resourceInfo2;
        this.minVersion = str2;
        this.maxVersion = str3;
        this.iconUrl = str4;
        this.markVersion = num2;
        this.lightUpTime = j8;
        this.isWearing = z;
        this.iconFormat = str5;
        this.orderNum = i;
        this.lastChangTime = l2;
        this.hasRemindInContact = z2;
        this.remindAnimStartTime = l3;
    }
}
