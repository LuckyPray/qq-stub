package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RegisterInfo.class */
public final class RegisterInfo {
    public DeviceInfo deviceInfo;
    public OnLineBusinessInfo onLineBusinessInfo;
    public boolean userTrigger;

    public RegisterInfo() {
        this.deviceInfo = new DeviceInfo();
        this.onLineBusinessInfo = new OnLineBusinessInfo();
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public OnLineBusinessInfo getOnLineBusinessInfo() {
        return this.onLineBusinessInfo;
    }

    public boolean getUserTrigger() {
        return this.userTrigger;
    }

    public String toString() {
        return "RegisterInfo{userTrigger=" + this.userTrigger + ",deviceInfo=" + this.deviceInfo + ",onLineBusinessInfo=" + this.onLineBusinessInfo + ",}";
    }

    public RegisterInfo(boolean z, DeviceInfo deviceInfo, OnLineBusinessInfo onLineBusinessInfo) {
        this.deviceInfo = new DeviceInfo();
        this.onLineBusinessInfo = new OnLineBusinessInfo();
        this.userTrigger = z;
        this.deviceInfo = deviceInfo;
        this.onLineBusinessInfo = onLineBusinessInfo;
    }
}
