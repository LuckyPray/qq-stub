package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCHANNELPRIVATETYPE.class */
public final class GProCHANNELPRIVATETYPE {
    static IPatchRedirector $redirector_;
    public static final int ADMIN_PRIVATE = 1;
    public static final int PUBLIC_CHANNEL = 0;
    public static final int SPECMEMBERS_PRIVATE = 2;

    public GProCHANNELPRIVATETYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProCHANNELPRIVATETYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
