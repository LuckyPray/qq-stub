package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSYNCSTATUS.class */
public final class GProSYNCSTATUS {
    static IPatchRedirector $redirector_;
    public static final int SYNC_FROM_QZONE = 2;
    public static final int SYNC_SHARE_TO_QZONE = 3;
    public static final int SYNC_TO_QZONE = 1;

    public GProSYNCSTATUS() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProSYNCSTATUS{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
