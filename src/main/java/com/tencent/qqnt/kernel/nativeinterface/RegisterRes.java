package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RegisterRes.class */
public final class RegisterRes {
    public int batteryInterval;
    public int extStatus;
    public int helloInterval;
    public String msg;
    public int result;
    public long serverTime;
    public int status;
    public int statusInterval;

    public RegisterRes() {
        this.msg = "";
    }

    public int getBatteryInterval() {
        return this.batteryInterval;
    }

    public int getExtStatus() {
        return this.extStatus;
    }

    public int getHelloInterval() {
        return this.helloInterval;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResult() {
        return this.result;
    }

    public long getServerTime() {
        return this.serverTime;
    }

    public int getStatus() {
        return this.status;
    }

    public int getStatusInterval() {
        return this.statusInterval;
    }

    public String toString() {
        return "RegisterRes{result=" + this.result + ",msg=" + this.msg + ",serverTime=" + this.serverTime + ",helloInterval=" + this.helloInterval + ",status=" + this.status + ",extStatus=" + this.extStatus + ",batteryInterval=" + this.batteryInterval + ",statusInterval=" + this.statusInterval + ",}";
    }

    public RegisterRes(int i, String str, long j, int i2, int i3, int i4, int i5, int i6) {
        this.msg = "";
        this.result = i;
        this.msg = str;
        this.serverTime = j;
        this.helloInterval = i2;
        this.status = i3;
        this.extStatus = i4;
        this.batteryInterval = i5;
        this.statusInterval = i6;
    }
}
