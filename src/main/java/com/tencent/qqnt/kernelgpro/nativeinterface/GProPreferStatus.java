package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPreferStatus.class */
public final class GProPreferStatus {
    static IPatchRedirector $redirector_;
    public static final int PREFER_STATUS_PREFER = 1;
    public static final int PREFER_STATUS_UNDO = 0;
    public static final int PREFER_STATUS_UNPREFER = 2;

    public GProPreferStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProPreferStatus{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
