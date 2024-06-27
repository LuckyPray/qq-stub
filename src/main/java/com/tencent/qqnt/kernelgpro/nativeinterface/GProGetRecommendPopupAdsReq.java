package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendPopupAdsReq.class */
public final class GProGetRecommendPopupAdsReq implements Serializable {
    static IPatchRedirector $redirector_;
    public byte[] cookies;
    long serialVersionUID;
    public GProBottomTabSourceInfo source;
    public int tabType;

    public GProGetRecommendPopupAdsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public int getTabType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tabType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public void setCookies(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.cookies = bArr;
        } else {
            iPatchRedirector.redirect((short) 6, this, bArr);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 8, this, gProBottomTabSourceInfo);
        }
    }

    public void setTabType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.tabType = i;
        } else {
            iPatchRedirector.redirect((short) 7, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGetRecommendPopupAdsReq{cookies=" + this.cookies + ",tabType=" + this.tabType + ",source=" + this.source + ",}";
    }

    public GProGetRecommendPopupAdsReq(byte[] bArr, int i, GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, bArr, Integer.valueOf(i), gProBottomTabSourceInfo});
            return;
        }
        this.serialVersionUID = 1L;
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.cookies = bArr;
        this.tabType = i;
        this.source = gProBottomTabSourceInfo;
    }
}
