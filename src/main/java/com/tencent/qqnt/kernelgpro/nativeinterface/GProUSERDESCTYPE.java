package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUSERDESCTYPE.class */
public final class GProUSERDESCTYPE {
    static IPatchRedirector $redirector_;
    public static final int CIRCLE_PROFILE_SIGN = 1;
    public static final int QQ_SIGN = 2;
    public static final int UNKONWN = 0;

    public GProUSERDESCTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProUSERDESCTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
