package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDELETESCENE.class */
public final class GProDELETESCENE {
    static IPatchRedirector $redirector_;
    public static final int DELETE_IN_GUILD = 0;
    public static final int DELETE_IN_PERSONAL_CENTER = 1;

    public GProDELETESCENE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProDELETESCENE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
