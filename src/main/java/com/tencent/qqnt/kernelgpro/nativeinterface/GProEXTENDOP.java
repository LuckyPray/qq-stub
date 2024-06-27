package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEXTENDOP.class */
public final class GProEXTENDOP {
    static IPatchRedirector $redirector_;
    public static final int EXTEND_OP_CREATE_CATEGORY = 1;
    public static final int EXTEND_OP_UNDEFINED = 0;

    public GProEXTENDOP() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProEXTENDOP{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
