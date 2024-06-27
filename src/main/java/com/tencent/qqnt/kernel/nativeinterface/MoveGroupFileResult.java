package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MoveGroupFileResult.class */
public final class MoveGroupFileResult {
    public ArrayList<String> failFileIdList;
    public GroupFileCommonResult result;
    public ArrayList<String> successFileIdList;

    public MoveGroupFileResult() {
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
        return "MoveGroupFileResult{result=" + this.result + ",successFileIdList=" + this.successFileIdList + ",failFileIdList=" + this.failFileIdList + ",}";
    }

    public MoveGroupFileResult(GroupFileCommonResult groupFileCommonResult, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.result = new GroupFileCommonResult();
        this.successFileIdList = new ArrayList<>();
        this.failFileIdList = new ArrayList<>();
        this.result = groupFileCommonResult;
        this.successFileIdList = arrayList;
        this.failFileIdList = arrayList2;
    }
}
