package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFEEDOPERATIONMASK.class */
public final class GProFEEDOPERATIONMASK {
    static IPatchRedirector $redirector_;
    public static final int FORBID_ALTER_FEED = 3;
    public static final int FORBID_COMMENT = 1;
    public static final int FORBID_LIKE = 2;
    public static final int FORBID_MANAGE = 6;
    public static final int FORBID_SHARE = 5;
    public static final int HIDDEN_TITLE_BAR = 4;

    public GProFEEDOPERATIONMASK() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProFEEDOPERATIONMASK{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
