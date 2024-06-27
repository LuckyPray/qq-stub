package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetBannersReq.class */
public final class GProGetBannersReq {
    static IPatchRedirector $redirector_;
    public int getNum;
    public int serviceType;

    public GProGetBannersReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getGetNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.getNum : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getServiceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.serviceType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public void setGetNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.getNum = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setServiceType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.serviceType = i;
        } else {
            iPatchRedirector.redirect((short) 5, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetBannersReq{serviceType=" + this.serviceType + ",getNum=" + this.getNum + ",}";
    }

    public GProGetBannersReq(int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2)});
        } else {
            this.serviceType = i;
            this.getNum = i2;
        }
    }
}
