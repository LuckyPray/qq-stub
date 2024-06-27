package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotMsgPushSetReq.class */
public final class RobotMsgPushSetReq {
    public long groupId;
    public boolean isReceive;
    public long robotUin;
    public RobtMsgSettingType settingType;

    public RobotMsgPushSetReq() {
        this.settingType = RobtMsgSettingType.values()[0];
    }

    public long getGroupId() {
        return this.groupId;
    }

    public boolean getIsReceive() {
        return this.isReceive;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public RobtMsgSettingType getSettingType() {
        return this.settingType;
    }

    public String toString() {
        return "RobotMsgPushSetReq{robotUin=" + this.robotUin + ",settingType=" + this.settingType + ",isReceive=" + this.isReceive + ",groupId=" + this.groupId + ",}";
    }

    public RobotMsgPushSetReq(long j, RobtMsgSettingType robtMsgSettingType, boolean z, long j2) {
        this.settingType = RobtMsgSettingType.values()[0];
        this.robotUin = j;
        this.settingType = robtMsgSettingType;
        this.isReceive = z;
        this.groupId = j2;
    }
}
