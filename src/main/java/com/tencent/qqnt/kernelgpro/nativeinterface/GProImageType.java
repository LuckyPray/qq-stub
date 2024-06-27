package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProImageType.class */
public final class GProImageType {
    static IPatchRedirector $redirector_;
    public static final int IMAGE_TYPE_GIF = 1;
    public static final int IMAGE_TYPE_UNKNOWN = 0;

    public GProImageType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProImageType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
