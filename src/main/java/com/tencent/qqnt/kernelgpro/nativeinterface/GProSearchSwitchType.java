package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSearchSwitchType.class */
public final class GProSearchSwitchType {
    static IPatchRedirector $redirector_;
    public static final int TYPE_CLOSE = 0;
    public static final int TYPE_INVALID = 2;
    public static final int TYPE_VALID = 1;

    public GProSearchSwitchType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProSearchSwitchType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
