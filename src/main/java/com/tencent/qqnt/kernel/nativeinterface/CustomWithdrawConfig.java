package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CustomWithdrawConfig.class */
public final class CustomWithdrawConfig {
    public int configVersion;
    public long msgBegin;
    public long msgEnd;
    public long withdrawBegin;
    public long withdrawEnd;

    public CustomWithdrawConfig() {
    }

    public int getConfigVersion() {
        return this.configVersion;
    }

    public long getMsgBegin() {
        return this.msgBegin;
    }

    public long getMsgEnd() {
        return this.msgEnd;
    }

    public long getWithdrawBegin() {
        return this.withdrawBegin;
    }

    public long getWithdrawEnd() {
        return this.withdrawEnd;
    }

    public String toString() {
        return "CustomWithdrawConfig{withdrawBegin=" + this.withdrawBegin + ",withdrawEnd=" + this.withdrawEnd + ",msgBegin=" + this.msgBegin + ",msgEnd=" + this.msgEnd + ",configVersion=" + this.configVersion + ",}";
    }

    public CustomWithdrawConfig(long j, long j2, long j3, long j4, int i) {
        this.withdrawBegin = j;
        this.withdrawEnd = j2;
        this.msgBegin = j3;
        this.msgEnd = j4;
        this.configVersion = i;
    }
}
