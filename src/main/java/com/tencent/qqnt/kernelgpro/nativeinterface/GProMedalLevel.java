package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMedalLevel.class */
public final class GProMedalLevel {
    static IPatchRedirector $redirector_;
    public static final int BETA = 1;
    public static final int ENTERPRISE = 2;
    public static final int INDIVIDUAL = 3;
    public static final int NONE = 0;

    public GProMedalLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProMedalLevel{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
