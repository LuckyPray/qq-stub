package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IOperateResult.class */
public final class IOperateResult {
    public int code;
    public String errMsg;

    public IOperateResult() {
        this.errMsg = "";
    }

    public int getCode() {
        return this.code;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String toString() {
        return "IOperateResult{code=" + this.code + ",errMsg=" + this.errMsg + ",}";
    }

    public IOperateResult(int i, String str) {
        this.errMsg = "";
        this.code = i;
        this.errMsg = str;
    }
}
