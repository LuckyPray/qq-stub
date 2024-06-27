package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFEEDFROMTYPE.class */
public final class GProFEEDFROMTYPE {
    static IPatchRedirector $redirector_;
    public static final int FROM_FEED_CLOUD = 1;
    public static final int FROM_MACHINE_CARE = 3;
    public static final int FROM_RECOMM = 2;

    public GProFEEDFROMTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProFEEDFROMTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
