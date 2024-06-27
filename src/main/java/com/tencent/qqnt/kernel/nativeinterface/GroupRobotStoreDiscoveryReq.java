package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotStoreDiscoveryReq.class */
public final class GroupRobotStoreDiscoveryReq {
    public long groupId;
    public int sceneId;

    public long getGroupId() {
        return this.groupId;
    }

    public int getSceneId() {
        return this.sceneId;
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setSceneId(int i) {
        this.sceneId = i;
    }

    public String toString() {
        return "GroupRobotStoreDiscoveryReq{groupId=" + this.groupId + ",sceneId=" + this.sceneId + ",}";
    }
}
