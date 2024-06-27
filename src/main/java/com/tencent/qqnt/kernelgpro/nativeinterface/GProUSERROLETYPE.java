package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUSERROLETYPE.class */
public final class GProUSERROLETYPE {
    static IPatchRedirector $redirector_;
    public static final int ROLE_ADMIN = 1;
    public static final int ROLE_CHANNEL_ADMIN = 3;
    public static final int ROLE_MANAGE_CHANNEL_CONTENT = 4;
    public static final int ROLE_NORMAL = 0;
    public static final int ROLE_OWNER = 2;

    public GProUSERROLETYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProUSERROLETYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
