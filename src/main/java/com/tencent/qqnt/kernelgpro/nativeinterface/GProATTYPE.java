package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProATTYPE.class */
public final class GProATTYPE {
    static IPatchRedirector $redirector_;
    public static final int AT_EXPLICIT_USER = 1;
    public static final int AT_GUILD = 3;
    public static final int AT_ONLINE = 4;
    public static final int AT_ROLE_GROUP = 2;
    public static final int UNKNOWN_AT_TYPE = 0;

    public GProATTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProATTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
