package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ThirdPartySigResult.class */
public final class ThirdPartySigResult {
    public ThirdPartySigInfo sigInfo = new ThirdPartySigInfo();
    public ThirdPartySigSvrErrorInfo errorInfo = new ThirdPartySigSvrErrorInfo();

    public ThirdPartySigSvrErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    public ThirdPartySigInfo getSigInfo() {
        return this.sigInfo;
    }

    public String toString() {
        return "ThirdPartySigResult{sigInfo=" + this.sigInfo + ",errorInfo=" + this.errorInfo + ",}";
    }
}
