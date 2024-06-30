package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/LastTofu.class */
public final class LastTofu {
    public long busiID;
    public String busiUUID;
    public DeleteStatus deleteFlag;

    public LastTofu() {
        this.busiUUID = "";
    }

    public long getBusiID() {
        return this.busiID;
    }

    public String getBusiUUID() {
        return this.busiUUID;
    }

    public DeleteStatus getDeleteFlag() {
        return this.deleteFlag;
    }

    public String toString() {
        return "LastTofu{busiID=" + this.busiID + ",busiUUID=" + this.busiUUID + ",deleteFlag=" + this.deleteFlag + ",}";
    }

    public LastTofu(long j, String str, DeleteStatus deleteStatus) {
        this.busiUUID = "";
        this.busiID = j;
        this.busiUUID = str;
        this.deleteFlag = deleteStatus;
    }
}
