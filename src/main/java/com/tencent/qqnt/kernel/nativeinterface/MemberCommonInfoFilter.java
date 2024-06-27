package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MemberCommonInfoFilter.class */
public final class MemberCommonInfoFilter {
    public int memberUin;
    public int privilege;
    public int shutUpTime;
    public int uinFlag;
    public int uinFlagExt;
    public int uinMobileFlag;

    public int getMemberUin() {
        return this.memberUin;
    }

    public int getPrivilege() {
        return this.privilege;
    }

    public int getShutUpTime() {
        return this.shutUpTime;
    }

    public int getUinFlag() {
        return this.uinFlag;
    }

    public int getUinFlagExt() {
        return this.uinFlagExt;
    }

    public int getUinMobileFlag() {
        return this.uinMobileFlag;
    }

    public void setMemberUin(int i) {
        this.memberUin = i;
    }

    public void setPrivilege(int i) {
        this.privilege = i;
    }

    public void setShutUpTime(int i) {
        this.shutUpTime = i;
    }

    public void setUinFlag(int i) {
        this.uinFlag = i;
    }

    public void setUinFlagExt(int i) {
        this.uinFlagExt = i;
    }

    public void setUinMobileFlag(int i) {
        this.uinMobileFlag = i;
    }

    public String toString() {
        return "MemberCommonInfoFilter{memberUin=" + this.memberUin + ",uinFlag=" + this.uinFlag + ",uinFlagExt=" + this.uinFlagExt + ",uinMobileFlag=" + this.uinMobileFlag + ",shutUpTime=" + this.shutUpTime + ",privilege=" + this.privilege + ",}";
    }
}
