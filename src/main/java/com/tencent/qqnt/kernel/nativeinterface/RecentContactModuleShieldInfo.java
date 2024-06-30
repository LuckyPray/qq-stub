package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentContactModuleShieldInfo.class */
public final class RecentContactModuleShieldInfo {
    public int chatType;
    public boolean isShow;
    public int module;
    public String uid;
    public String uin;

    public RecentContactModuleShieldInfo() {
        this.uid = "";
        this.uin = "";
    }

    public int getChatType() {
        return this.chatType;
    }

    public boolean getIsShow() {
        return this.isShow;
    }

    public int getModule() {
        return this.module;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUin() {
        return this.uin;
    }

    public String toString() {
        return "RecentContactModuleShieldInfo{uid=" + this.uid + ",uin=" + this.uin + ",chatType=" + this.chatType + ",isShow=" + this.isShow + ",module=" + this.module + ",}";
    }

    public RecentContactModuleShieldInfo(String str, String str2, int i, boolean z, int i2) {
        this.uid = "";
        this.uin = "";
        this.uid = str;
        this.uin = str2;
        this.chatType = i;
        this.isShow = z;
        this.module = i2;
    }
}
