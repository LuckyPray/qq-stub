package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendNewCardReq.class */
public final class GProRecommendNewCardReq {
    static IPatchRedirector $redirector_;
    public int businessType;
    public byte[] cookies;
    public GProBottomTabSourceInfo source;
    public int tabType;

    public GProRecommendNewCardReq() {
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

    public int getTabType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.tabType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
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

    public void setTabType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.tabType = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProRecommendNewCardReq{businessType=" + this.businessType + ",cookies=" + this.cookies + ",source=" + this.source + ",tabType=" + this.tabType + ",}";
    }

    public GProRecommendNewCardReq(int i, byte[] bArr, GProBottomTabSourceInfo gProBottomTabSourceInfo, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), bArr, gProBottomTabSourceInfo, Integer.valueOf(i2)});
            return;
        }
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.businessType = i;
        this.cookies = bArr;
        this.source = gProBottomTabSourceInfo;
        this.tabType = i2;
    }
}
