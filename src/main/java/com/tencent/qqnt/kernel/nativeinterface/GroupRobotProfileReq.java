package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotProfileReq.class */
public final class GroupRobotProfileReq {
    public long groupId;
    public int robotBizType;
    public long robotUin;
    public String bkn = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String robotUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public RobotProfileFetchType fetchType = RobotProfileFetchType.values()[0];

    public String getBkn() {
        return this.bkn;
    }

    public RobotProfileFetchType getFetchType() {
        return this.fetchType;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public int getRobotBizType() {
        return this.robotBizType;
    }

    public String getRobotUid() {
        return this.robotUid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "GroupRobotProfileReq{robotUin=" + this.robotUin + ",groupId=" + this.groupId + ",bkn=" + this.bkn + ",robotBizType=" + this.robotBizType + ",robotUid=" + this.robotUid + ",fetchType=" + this.fetchType + ",}";
    }
}
