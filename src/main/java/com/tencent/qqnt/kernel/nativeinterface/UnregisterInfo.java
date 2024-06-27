package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UnregisterInfo.class */
public final class UnregisterInfo {
    public DeviceInfo deviceInfo;

    public UnregisterInfo() {
        this.deviceInfo = new DeviceInfo();
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public String toString() {
        return "UnregisterInfo{deviceInfo=" + this.deviceInfo + ",}";
    }

    public UnregisterInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = new DeviceInfo();
        this.deviceInfo = deviceInfo;
    }
}
