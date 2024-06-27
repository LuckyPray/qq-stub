package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPreferAction.class */
public final class GProPreferAction {
    static IPatchRedirector $redirector_;
    public static final int PREFER_ACTION_CANCEL_PREFER = 3;
    public static final int PREFER_ACTION_CANCEL_UNPREFER = 4;
    public static final int PREFER_ACTION_PREFER = 1;
    public static final int PREFER_ACTION_REVERSE = 0;
    public static final int PREFER_ACTION_UNPREFER = 2;

    public GProPreferAction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProPreferAction{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
