package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProOpenSdkUrl.class */
public final class GProOpenSdkUrl {
    static IPatchRedirector $redirector_;
    public String h265;

    /* renamed from: hd */
    public String f69hd;

    /* renamed from: ld */
    public String f70ld;
    public String raw;

    /* renamed from: sd */
    public String f71sd;

    /* renamed from: sg */
    public String f72sg;
    public String sound;

    public GProOpenSdkUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getH265() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.h265 : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getHd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.f69hd : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getLd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.f70ld : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getRaw() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.raw : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getSd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.f71sd : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getSg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.f72sg : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getSound() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.sound : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProOpenSdkUrl{raw=" + this.raw + ",hd=" + this.f69hd + ",sd=" + this.f71sd + ",ld=" + this.f70ld + ",sound=" + this.sound + ",h265=" + this.h265 + ",sg=" + this.f72sg + ",}";
    }
}
