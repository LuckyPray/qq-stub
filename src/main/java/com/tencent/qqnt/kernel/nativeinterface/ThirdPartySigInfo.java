package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ThirdPartySigInfo.class */
public final class ThirdPartySigInfo {
    public int appid;
    public long expireTime;
    public long generateTime;
    public long uin;
    public byte[] sig = new byte[0];
    public byte[] sigkey = new byte[0];
    public ThirdPartySigType sigType = ThirdPartySigType.values()[0];

    public int getAppid() {
        return this.appid;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public long getGenerateTime() {
        return this.generateTime;
    }

    public byte[] getSig() {
        return this.sig;
    }

    public ThirdPartySigType getSigType() {
        return this.sigType;
    }

    public byte[] getSigkey() {
        return this.sigkey;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "ThirdPartySigInfo{uin=" + this.uin + ",appid=" + this.appid + ",sig=" + this.sig + ",sigkey=" + this.sigkey + ",sigType=" + this.sigType + ",generateTime=" + this.generateTime + ",expireTime=" + this.expireTime + ",}";
    }
}
