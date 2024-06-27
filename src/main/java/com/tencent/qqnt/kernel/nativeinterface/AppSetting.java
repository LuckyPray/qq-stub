package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AppSetting.class */
public final class AppSetting {
    public boolean colorUser;
    public boolean debugVersion;
    public boolean grayVersion;
    public boolean publicVersion;

    public AppSetting() {
    }

    public boolean getColorUser() {
        return this.colorUser;
    }

    public boolean getDebugVersion() {
        return this.debugVersion;
    }

    public boolean getGrayVersion() {
        return this.grayVersion;
    }

    public boolean getPublicVersion() {
        return this.publicVersion;
    }

    public String toString() {
        return "AppSetting{colorUser=" + this.colorUser + ",debugVersion=" + this.debugVersion + ",publicVersion=" + this.publicVersion + ",grayVersion=" + this.grayVersion + ",}";
    }

    public AppSetting(boolean z, boolean z2, boolean z3, boolean z4) {
        this.colorUser = z;
        this.debugVersion = z2;
        this.publicVersion = z3;
        this.grayVersion = z4;
    }
}
