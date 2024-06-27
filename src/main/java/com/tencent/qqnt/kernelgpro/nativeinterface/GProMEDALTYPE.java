package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMEDALTYPE.class */
public final class GProMEDALTYPE {
    static IPatchRedirector $redirector_;
    public static final int FANS = 3;
    public static final int FANS_FRIEND = 4;
    public static final int FUEL = 1;
    public static final int FUEL_FRIEND = 2;
    public static final int TOPIC = 5;
    public static final int UNKNOWN = 0;

    public GProMEDALTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProMEDALTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
