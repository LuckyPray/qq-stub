package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDETAILTYPE.class */
public final class GProDETAILTYPE {
    static IPatchRedirector $redirector_;
    public static final int FULL_DETAIL = 1;
    public static final int SUMMARY_DETAIL = 2;
    public static final int UNKONWN_DETAIL_TYPE = 0;

    public GProDETAILTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProDETAILTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
