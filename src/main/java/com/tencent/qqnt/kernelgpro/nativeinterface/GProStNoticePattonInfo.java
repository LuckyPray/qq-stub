package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStNoticePattonInfo.class */
public final class GProStNoticePattonInfo {
    static IPatchRedirector $redirector_;
    public int pattonType;
    public GProStPlainTxtInfo plainTxt;

    public GProStNoticePattonInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.plainTxt = new GProStPlainTxtInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getPattonType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.pattonType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public GProStPlainTxtInfo getPlainTxt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.plainTxt : (GProStPlainTxtInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProStNoticePattonInfo{pattonType=" + this.pattonType + ",plainTxt=" + this.plainTxt + ",}";
    }
}
