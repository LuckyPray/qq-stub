package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFetchDiscoverRedRsp.class */
public final class GProFetchDiscoverRedRsp {
    static IPatchRedirector $redirector_;
    public int businessType;
    public byte[] cookies;
    public GProDiscoverStatus discoverStatus;
    public int flag;
    public int pointType;
    public long seq;

    public GProFetchDiscoverRedRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.discoverStatus = new GProDiscoverStatus();
            this.cookies = new byte[0];
        }
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public GProDiscoverStatus getDiscoverStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.discoverStatus : (GProDiscoverStatus) iPatchRedirector.redirect((short) 6, this);
    }

    public int getFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.flag : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getPointType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.pointType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.seq : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProFetchDiscoverRedRsp{flag=" + this.flag + ",seq=" + this.seq + ",businessType=" + this.businessType + ",discoverStatus=" + this.discoverStatus + ",cookies=" + this.cookies + ",pointType=" + this.pointType + ",}";
    }

    public GProFetchDiscoverRedRsp(int i, long j, int i2, GProDiscoverStatus gProDiscoverStatus, byte[] bArr, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), gProDiscoverStatus, bArr, Integer.valueOf(i3));
            return;
        }
        this.discoverStatus = new GProDiscoverStatus();
        this.cookies = new byte[0];
        this.flag = i;
        this.seq = j;
        this.businessType = i2;
        this.discoverStatus = gProDiscoverStatus;
        this.cookies = bArr;
        this.pointType = i3;
    }
}
