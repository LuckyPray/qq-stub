package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTagStatus.class */
public final class GProTagStatus {
    static IPatchRedirector $redirector_;
    public static final int NONE = 0;
    public static final int TOADD = 1;
    public static final int TODEL = 2;

    public GProTagStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProTagStatus{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
