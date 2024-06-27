package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OpenIDInfo.class */
public final class OpenIDInfo {
    public int appid;
    public byte[] openid = new byte[0];
    public long uin;

    public int getAppid() {
        return this.appid;
    }

    public byte[] getOpenid() {
        return this.openid;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "OpenIDInfo{uin=" + this.uin + ",appid=" + this.appid + ",openid=" + this.openid + ",}";
    }
}
