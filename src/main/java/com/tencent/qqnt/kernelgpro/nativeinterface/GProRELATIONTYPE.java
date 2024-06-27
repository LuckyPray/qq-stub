package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRELATIONTYPE.class */
public final class GProRELATIONTYPE {
    static IPatchRedirector $redirector_;
    public static final int FOLLOW = 1;
    public static final int FOLLOWED = 4;
    public static final int MUTUAL_FOLLOW = 2;
    public static final int NO_RELATION = 0;
    public static final int UNCARE = 3;

    public GProRELATIONTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProRELATIONTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
