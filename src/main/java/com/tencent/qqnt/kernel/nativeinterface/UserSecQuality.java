package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UserSecQuality.class */
public final class UserSecQuality {
    public boolean allowGuild;

    public UserSecQuality() {
    }

    public boolean getAllowGuild() {
        return this.allowGuild;
    }

    public String toString() {
        return "UserSecQuality{allowGuild=" + this.allowGuild + ",}";
    }

    public UserSecQuality(boolean z) {
        this.allowGuild = z;
    }
}
