package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotStoreSearchReq.class */
public final class GroupRobotStoreSearchReq {
    public long groupId;
    public int sceneId;
    public String traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String keywords = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public byte[] sessionInfo = new byte[0];

    public long getGroupId() {
        return this.groupId;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public int getSceneId() {
        return this.sceneId;
    }

    public byte[] getSessionInfo() {
        return this.sessionInfo;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setKeywords(String str) {
        this.keywords = str;
    }

    public void setSceneId(int i) {
        this.sceneId = i;
    }

    public void setSessionInfo(byte[] bArr) {
        this.sessionInfo = bArr;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public String toString() {
        return "GroupRobotStoreSearchReq{traceId=" + this.traceId + ",keywords=" + this.keywords + ",groupId=" + this.groupId + ",sessionInfo=" + this.sessionInfo + ",sceneId=" + this.sceneId + ",}";
    }
}
