package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PT4tokenResult.class */
public final class PT4tokenResult {
    public ArrayList<PT4tokenInfo> pt4tokens = new ArrayList<>();
    public ThirdPartySigSvrErrorInfo errorInfo = new ThirdPartySigSvrErrorInfo();

    public ThirdPartySigSvrErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    public ArrayList<PT4tokenInfo> getPt4tokens() {
        return this.pt4tokens;
    }

    public String toString() {
        return "PT4tokenResult{pt4tokens=" + this.pt4tokens + ",errorInfo=" + this.errorInfo + ",}";
    }
}
