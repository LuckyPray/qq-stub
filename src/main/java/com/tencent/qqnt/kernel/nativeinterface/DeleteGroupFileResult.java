package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DeleteGroupFileResult.class */
public final class DeleteGroupFileResult {
    public ArrayList<String> failFileIdList;
    public GroupFileCommonResult result;
    public ArrayList<String> successFileIdList;

    public DeleteGroupFileResult() {
        this.result = new GroupFileCommonResult();
        this.successFileIdList = new ArrayList<>();
        this.failFileIdList = new ArrayList<>();
    }

    public ArrayList<String> getFailFileIdList() {
        return this.failFileIdList;
    }

    public GroupFileCommonResult getResult() {
        return this.result;
    }

    public ArrayList<String> getSuccessFileIdList() {
        return this.successFileIdList;
    }

    public String toString() {
        return "DeleteGroupFileResult{result=" + this.result + ",successFileIdList=" + this.successFileIdList + ",failFileIdList=" + this.failFileIdList + ",}";
    }

    public DeleteGroupFileResult(GroupFileCommonResult groupFileCommonResult, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.result = new GroupFileCommonResult();
        this.successFileIdList = new ArrayList<>();
        this.failFileIdList = new ArrayList<>();
        this.result = groupFileCommonResult;
        this.successFileIdList = arrayList;
        this.failFileIdList = arrayList2;
    }
}
