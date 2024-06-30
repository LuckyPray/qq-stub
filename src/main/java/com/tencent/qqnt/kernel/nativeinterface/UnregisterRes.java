package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UnregisterRes.class */
public final class UnregisterRes {
    public String msg;
    public int result;

    public UnregisterRes() {
        this.msg = "";
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResult() {
        return this.result;
    }

    public String toString() {
        return "UnregisterRes{result=" + this.result + ",msg=" + this.msg + ",}";
    }

    public UnregisterRes(int i, String str) {
        this.msg = "";
        this.result = i;
        this.msg = str;
    }
}
