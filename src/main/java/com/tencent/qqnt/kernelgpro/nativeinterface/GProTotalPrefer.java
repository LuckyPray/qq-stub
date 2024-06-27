package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTotalPrefer.class */
public final class GProTotalPrefer {
    static IPatchRedirector $redirector_;
    public int preferCount;
    public int preferCountWithoutLike;
    public int preferStatus;

    public GProTotalPrefer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getPreferCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.preferCount : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getPreferCountWithoutLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.preferCountWithoutLike : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getPreferStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.preferStatus : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProTotalPrefer{preferCount=" + this.preferCount + ",preferStatus=" + this.preferStatus + ",preferCountWithoutLike=" + this.preferCountWithoutLike + ",}";
    }
}
