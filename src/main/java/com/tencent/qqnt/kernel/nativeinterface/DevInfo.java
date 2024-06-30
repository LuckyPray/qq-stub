package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DevInfo.class */
public final class DevInfo implements IKernelModel {
    public int clientType;
    public String devUid;
    public int instanceId;

    public DevInfo() {
        this.devUid = "";
    }

    public int getClientType() {
        return this.clientType;
    }

    public String getDevUid() {
        return this.devUid;
    }

    public int getInstanceId() {
        return this.instanceId;
    }

    public void setClientType(int i) {
        this.clientType = i;
    }

    public void setDevUid(String str) {
        this.devUid = str;
    }

    public void setInstanceId(int i) {
        this.instanceId = i;
    }

    public String toString() {
        return "DevInfo{instanceId=" + this.instanceId + ",clientType=" + this.clientType + ",devUid=" + this.devUid + ",}";
    }

    public DevInfo(int i, int i2, String str) {
        this.devUid = "";
        this.instanceId = i;
        this.clientType = i2;
        this.devUid = str;
    }
}
