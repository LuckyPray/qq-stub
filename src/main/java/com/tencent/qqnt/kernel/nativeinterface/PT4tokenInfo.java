package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PT4tokenInfo.class */
public final class PT4tokenInfo {
    public int appid;
    public long expireTime;
    public long generateTime;
    public long nextrefreshTime;
    public long uin;
    public byte[] sig = new byte[0];
    public String domain = "";

    public int getAppid() {
        return this.appid;
    }

    public String getDomain() {
        return this.domain;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public long getGenerateTime() {
        return this.generateTime;
    }

    public long getNextrefreshTime() {
        return this.nextrefreshTime;
    }

    public byte[] getSig() {
        return this.sig;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "PT4tokenInfo{uin=" + this.uin + ",appid=" + this.appid + ",sig=" + this.sig + ",domain=" + this.domain + ",generateTime=" + this.generateTime + ",expireTime=" + this.expireTime + ",nextrefreshTime=" + this.nextrefreshTime + ",}";
    }
}
