package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProKeywordSearchSwitch.class */
public final class GProKeywordSearchSwitch {
    static IPatchRedirector $redirector_;
    public static final int CLOSE = 2;
    public static final int DEFAULT = 0;
    public static final int OPEN = 1;

    public GProKeywordSearchSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProKeywordSearchSwitch{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
