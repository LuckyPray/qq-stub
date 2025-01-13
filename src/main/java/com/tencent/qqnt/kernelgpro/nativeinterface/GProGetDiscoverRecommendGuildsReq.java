package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetDiscoverRecommendGuildsReq.class */
public final class GProGetDiscoverRecommendGuildsReq {
    static IPatchRedirector $redirector_;
    public int businessType;
    public byte[] cookies;
    public GProBottomTabSourceInfo source;
    public int topN;

    public GProGetDiscoverRecommendGuildsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.cookies = new byte[0];
            this.source = new GProBottomTabSourceInfo();
        }
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public int getTopN() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.topN : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public void setBusinessType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.businessType = i;
        } else {
            iPatchRedirector.redirect((short) 7, this, i);
        }
    }

    public void setCookies(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.cookies = bArr;
        } else {
            iPatchRedirector.redirect((short) 8, this, bArr);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 9, this, gProBottomTabSourceInfo);
        }
    }

    public void setTopN(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.topN = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProGetDiscoverRecommendGuildsReq{businessType=" + this.businessType + ",cookies=" + this.cookies + ",source=" + this.source + ",topN=" + this.topN + ",}";
    }

    public GProGetDiscoverRecommendGuildsReq(int i, byte[] bArr, GProBottomTabSourceInfo gProBottomTabSourceInfo, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), bArr, gProBottomTabSourceInfo, Integer.valueOf(i2));
            return;
        }
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.businessType = i;
        this.cookies = bArr;
        this.source = gProBottomTabSourceInfo;
        this.topN = i2;
    }
}
