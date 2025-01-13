package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFetchDiscoverRedReq.class */
public final class GProFetchDiscoverRedReq {
    static IPatchRedirector $redirector_;
    public int businessType;
    public byte[] cookies;
    public int hitTabType;
    public long seq;

    public GProFetchDiscoverRedReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.cookies = new byte[0];
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public int getHitTabType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.hitTabType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.seq : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public void setBusinessType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.businessType = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public void setCookies(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.cookies = bArr;
        } else {
            iPatchRedirector.redirect((short) 10, this, bArr);
        }
    }

    public void setHitTabType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.hitTabType = i;
        } else {
            iPatchRedirector.redirect((short) 9, this, i);
        }
    }

    public void setSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.seq = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProFetchDiscoverRedReq{seq=" + this.seq + ",businessType=" + this.businessType + ",hitTabType=" + this.hitTabType + ",cookies=" + this.cookies + ",}";
    }

    public GProFetchDiscoverRedReq(long j, int i, int i2, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), bArr);
            return;
        }
        this.cookies = new byte[0];
        this.seq = j;
        this.businessType = i;
        this.hitTabType = i2;
        this.cookies = bArr;
    }
}
