package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSRCAPP.class */
public final class GProSRCAPP {
    static IPatchRedirector $redirector_;
    public static final int CIRCLE = 0;
    public static final int KUAISHAN = 1;

    public GProSRCAPP() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProSRCAPP{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
