package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TargetFileInfo.class */
public final class TargetFileInfo {
    public CommonFileInfo commonFileInfo;
    public long targetElemId;
    public long targetMsgId;

    public TargetFileInfo() {
        this.commonFileInfo = new CommonFileInfo();
    }

    public CommonFileInfo getCommonFileInfo() {
        return this.commonFileInfo;
    }

    public long getTargetElemId() {
        return this.targetElemId;
    }

    public long getTargetMsgId() {
        return this.targetMsgId;
    }

    public String toString() {
        return "TargetFileInfo{targetMsgId=" + this.targetMsgId + ",targetElemId=" + this.targetElemId + ",commonFileInfo=" + this.commonFileInfo + ",}";
    }

    public TargetFileInfo(long j, long j2, CommonFileInfo commonFileInfo) {
        this.commonFileInfo = new CommonFileInfo();
        this.targetMsgId = j;
        this.targetElemId = j2;
        this.commonFileInfo = commonFileInfo;
    }
}
