package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStGPSV2.class */
public final class GProStGPSV2 {
    static IPatchRedirector $redirector_;
    public long alt;
    public long eType;
    public long lat;
    public long lon;

    public GProStGPSV2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getAlt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.alt : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getEType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.eType : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getLat() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.lat : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getLon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.lon : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStGPSV2{lat=" + this.lat + ",lon=" + this.lon + ",eType=" + this.eType + ",alt=" + this.alt + ",}";
    }
}
