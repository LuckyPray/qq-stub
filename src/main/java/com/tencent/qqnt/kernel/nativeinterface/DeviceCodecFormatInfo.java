package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DeviceCodecFormatInfo.class */
public final class DeviceCodecFormatInfo {
    public String deviceName;
    public String osVersion;
    public String platformChipInfo;

    public DeviceCodecFormatInfo() {
        this.platformChipInfo = "";
        this.osVersion = "";
        this.deviceName = "";
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getPlatformChipInfo() {
        return this.platformChipInfo;
    }

    public String toString() {
        return "DeviceCodecFormatInfo{platformChipInfo=" + this.platformChipInfo + ",osVersion=" + this.osVersion + ",deviceName=" + this.deviceName + ",}";
    }

    public DeviceCodecFormatInfo(String str, String str2, String str3) {
        this.platformChipInfo = "";
        this.osVersion = "";
        this.deviceName = "";
        this.platformChipInfo = str;
        this.osVersion = str2;
        this.deviceName = str3;
    }
}
