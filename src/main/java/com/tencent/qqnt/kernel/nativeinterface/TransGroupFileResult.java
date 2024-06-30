package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TransGroupFileResult.class */
public final class TransGroupFileResult {
    public GroupFileCommonResult result;
    public int saveBusId;
    public String saveFilePath;

    public TransGroupFileResult() {
        this.result = new GroupFileCommonResult();
        this.saveFilePath = "";
    }

    public GroupFileCommonResult getResult() {
        return this.result;
    }

    public int getSaveBusId() {
        return this.saveBusId;
    }

    public String getSaveFilePath() {
        return this.saveFilePath;
    }

    public String toString() {
        return "TransGroupFileResult{result=" + this.result + ",saveBusId=" + this.saveBusId + ",saveFilePath=" + this.saveFilePath + ",}";
    }

    public TransGroupFileResult(GroupFileCommonResult groupFileCommonResult, int i, String str) {
        this.result = new GroupFileCommonResult();
        this.saveFilePath = "";
        this.result = groupFileCommonResult;
        this.saveBusId = i;
        this.saveFilePath = str;
    }
}
