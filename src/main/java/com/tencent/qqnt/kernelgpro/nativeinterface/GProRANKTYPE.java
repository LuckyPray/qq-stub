package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRANKTYPE.class */
public final class GProRANKTYPE {
    static IPatchRedirector $redirector_;
    public static final int DEFAULT = 0;
    public static final int TIMELINE = 1;
    public static final int TIMELINE_REVERSED = 2;

    public GProRANKTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProRANKTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
