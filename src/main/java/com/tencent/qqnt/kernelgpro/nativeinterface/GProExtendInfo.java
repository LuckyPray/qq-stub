package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProExtendInfo.class */
public final class GProExtendInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProGray gray;
    long serialVersionUID;

    public GProExtendInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.gray = new GProGray();
        }
    }

    public GProGray getGray() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.gray : (GProGray) iPatchRedirector.redirect((short) 2, this);
    }

    public void setGray(GProGray gProGray) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) {
            this.gray = gProGray;
        } else {
            iPatchRedirector.redirect((short) 3, this, gProGray);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProExtendInfo{gray=" + this.gray + ",}";
    }
}
