package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BdhUploadReq.class */
public final class BdhUploadReq {
    public long commandId;
    public byte[] extInfo;
    public Integer priority;
    public byte[] upKey;
    public Long uploadTimeout;
    public String uuid;
    public String filePath = "";
    public byte[] bizInfo = new byte[0];

    public byte[] getBizInfo() {
        return this.bizInfo;
    }

    public long getCommandId() {
        return this.commandId;
    }

    public byte[] getExtInfo() {
        return this.extInfo;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public byte[] getUpKey() {
        return this.upKey;
    }

    public Long getUploadTimeout() {
        return this.uploadTimeout;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String toString() {
        return "BdhUploadReq{commandId=" + this.commandId + ",filePath=" + this.filePath + ",bizInfo=" + this.bizInfo + ",priority=" + this.priority + ",uploadTimeout=" + this.uploadTimeout + ",uuid=" + this.uuid + ",extInfo=" + this.extInfo + ",upKey=" + this.upKey + ",}";
    }
}
