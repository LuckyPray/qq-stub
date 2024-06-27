package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProThumbLevel.class */
public final class GProThumbLevel {
    static IPatchRedirector $redirector_;
    public static final int THUMB_LEVEL_BIG = 3;
    public static final int THUMB_LEVEL_MIDDLE = 2;
    public static final int THUMB_LEVEL_RESERVE = 0;
    public static final int THUMB_LEVEL_SMALL = 1;

    public GProThumbLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProThumbLevel{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
