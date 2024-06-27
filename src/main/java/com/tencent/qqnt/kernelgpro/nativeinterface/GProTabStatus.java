package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTabStatus.class */
public final class GProTabStatus {
    static IPatchRedirector $redirector_;
    public static final int INVALID = 0;
    public static final int NOT_OPEN_TAB = 2;
    public static final int OPEN_TAB = 1;

    public GProTabStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProTabStatus{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
