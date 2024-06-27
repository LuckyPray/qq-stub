package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BdhUploadRsp.class */
public final class BdhUploadRsp {
    public Float process;
    public byte[] rspBuf;
    public Long sendFileSize;
    public int status;
    public long taskId;

    public Float getProcess() {
        return this.process;
    }

    public byte[] getRspBuf() {
        return this.rspBuf;
    }

    public Long getSendFileSize() {
        return this.sendFileSize;
    }

    public int getStatus() {
        return this.status;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String toString() {
        return "BdhUploadRsp{status=" + this.status + ",taskId=" + this.taskId + ",sendFileSize=" + this.sendFileSize + ",process=" + this.process + ",rspBuf=" + this.rspBuf + ",}";
    }
}
