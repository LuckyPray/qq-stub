package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StatusReq.class */
public final class StatusReq {
    public int batteryStatus;
    public CustomStatus customStatus;
    public int extStatus;
    public int status;

    public StatusReq() {
    }

    public int getBatteryStatus() {
        return this.batteryStatus;
    }

    public CustomStatus getCustomStatus() {
        return this.customStatus;
    }

    public int getExtStatus() {
        return this.extStatus;
    }

    public int getStatus() {
        return this.status;
    }

    public void setBatteryStatus(int i) {
        this.batteryStatus = i;
    }

    public void setCustomStatus(CustomStatus customStatus) {
        this.customStatus = customStatus;
    }

    public void setExtStatus(int i) {
        this.extStatus = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        return "StatusReq{status=" + this.status + ",extStatus=" + this.extStatus + ",batteryStatus=" + this.batteryStatus + ",customStatus=" + this.customStatus + ",}";
    }

    public StatusReq(int i, int i2, int i3, CustomStatus customStatus) {
        this.status = i;
        this.extStatus = i2;
        this.batteryStatus = i3;
        this.customStatus = customStatus;
    }
}
