package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProIdentityType.class */
public final class GProIdentityType {
    static IPatchRedirector $redirector_;
    public static final int IDENTITY_SVIP = 2;
    public static final int IDENTITY_UNKNOW = 0;

    public GProIdentityType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProIdentityType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
