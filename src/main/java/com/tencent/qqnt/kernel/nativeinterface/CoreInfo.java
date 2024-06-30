package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CoreInfo.class */
public final class CoreInfo {
    public String nick;
    public String remark;
    public String uid;
    public long uin;

    public CoreInfo() {
        this.uid = "";
    }

    public String getNick() {
        return this.nick;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "CoreInfo{uid=" + this.uid + ",uin=" + this.uin + ",nick=" + this.nick + ",remark=" + this.remark + ",}";
    }

    public CoreInfo(String str, long j, String str2, String str3) {
        this.uid = "";
        this.uid = str;
        this.uin = j;
        this.nick = str2;
        this.remark = str3;
    }
}
