package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProClientIdentityBytesType.class */
public final class GProClientIdentityBytesType {
    static IPatchRedirector $redirector_;
    public static final int ICON = 1;
    public static final int WORD = 0;

    public GProClientIdentityBytesType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProClientIdentityBytesType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
