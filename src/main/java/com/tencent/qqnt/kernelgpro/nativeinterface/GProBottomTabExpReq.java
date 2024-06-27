package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBottomTabExpReq.class */
public final class GProBottomTabExpReq {
    static IPatchRedirector $redirector_;
    public int businessType;
    public GProBottomTabSourceInfo source;

    public GProBottomTabExpReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.source = new GProBottomTabSourceInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public void setBusinessType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.businessType = i;
        } else {
            iPatchRedirector.redirect((short) 5, this, i);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 6, this, gProBottomTabSourceInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProBottomTabExpReq{businessType=" + this.businessType + ",source=" + this.source + ",}";
    }

    public GProBottomTabExpReq(int i, GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, gProBottomTabSourceInfo);
            return;
        }
        this.source = new GProBottomTabSourceInfo();
        this.businessType = i;
        this.source = gProBottomTabSourceInfo;
    }
}
