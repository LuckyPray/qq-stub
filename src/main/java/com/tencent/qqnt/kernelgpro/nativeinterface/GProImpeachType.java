package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProImpeachType.class */
public final class GProImpeachType {
    static IPatchRedirector $redirector_;
    public static final int IMPEACHCMTTYPE = 1;
    public static final int IMPEACHFEEDTYPE = 0;
    public static final int IMPEACHREPLYTYPE = 2;

    public GProImpeachType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProImpeachType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
