package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AddRobotGroupInfo.class */
public final class AddRobotGroupInfo {
    public boolean canAdd;
    public long groupId;
    public String groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public boolean inGroup;

    public boolean getCanAdd() {
        return this.canAdd;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public boolean getInGroup() {
        return this.inGroup;
    }

    public String toString() {
        return "AddRobotGroupInfo{groupId=" + this.groupId + ",groupName=" + this.groupName + ",inGroup=" + this.inGroup + ",canAdd=" + this.canAdd + ",}";
    }
}
