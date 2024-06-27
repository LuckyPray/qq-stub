package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotStoreCategoryListReq.class */
public final class GroupRobotStoreCategoryListReq {
    public int categoryId;
    public long groupId;
    public int sceneId;
    public byte[] sessionInfo = new byte[0];

    public int getCategoryId() {
        return this.categoryId;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public int getSceneId() {
        return this.sceneId;
    }

    public byte[] getSessionInfo() {
        return this.sessionInfo;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setSceneId(int i) {
        this.sceneId = i;
    }

    public void setSessionInfo(byte[] bArr) {
        this.sessionInfo = bArr;
    }

    public String toString() {
        return "GroupRobotStoreCategoryListReq{groupId=" + this.groupId + ",categoryId=" + this.categoryId + ",sessionInfo=" + this.sessionInfo + ",sceneId=" + this.sceneId + ",}";
    }
}
