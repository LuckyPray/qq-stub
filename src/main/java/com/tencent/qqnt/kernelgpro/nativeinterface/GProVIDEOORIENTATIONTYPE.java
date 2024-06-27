package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVIDEOORIENTATIONTYPE.class */
public final class GProVIDEOORIENTATIONTYPE {
    static IPatchRedirector $redirector_;
    public static final int LANDSCAPE_VIDEO = 2;
    public static final int PORTRAIT_VIDEO = 1;
    public static final int UNKNOWN_VIDEO_ORIENTATION = 0;

    public GProVIDEOORIENTATIONTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProVIDEOORIENTATIONTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
