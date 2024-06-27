package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFDLStChannelInfo.class */
public final class GProFDLStChannelInfo {
    static IPatchRedirector $redirector_;
    public GProFDLStSign sign;

    public GProFDLStChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.sign = new GProFDLStSign();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProFDLStSign getSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.sign : (GProFDLStSign) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProFDLStChannelInfo{sign=" + this.sign + ",}";
    }

    public GProFDLStChannelInfo(GProFDLStSign gProFDLStSign) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProFDLStSign);
        } else {
            this.sign = new GProFDLStSign();
            this.sign = gProFDLStSign;
        }
    }
}
