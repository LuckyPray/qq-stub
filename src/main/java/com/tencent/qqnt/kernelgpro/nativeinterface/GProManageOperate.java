package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProManageOperate.class */
public final class GProManageOperate {
    static IPatchRedirector $redirector_;
    public static final int DELETE_FEED = 2;
    public static final int MOVE_FEED = 1;
    public static final int UNKNOWN = 0;

    public GProManageOperate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProManageOperate{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
