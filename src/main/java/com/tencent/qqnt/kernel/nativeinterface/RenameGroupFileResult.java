package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RenameGroupFileResult.class */
public final class RenameGroupFileResult {
    public String fileId;
    public GroupFileCommonResult result;

    public RenameGroupFileResult() {
        this.result = new GroupFileCommonResult();
        this.fileId = "";
    }

    public String getFileId() {
        return this.fileId;
    }

    public GroupFileCommonResult getResult() {
        return this.result;
    }

    public String toString() {
        return "RenameGroupFileResult{result=" + this.result + ",fileId=" + this.fileId + ",}";
    }

    public RenameGroupFileResult(GroupFileCommonResult groupFileCommonResult, String str) {
        this.result = new GroupFileCommonResult();
        this.fileId = "";
        this.result = groupFileCommonResult;
        this.fileId = str;
    }
}
