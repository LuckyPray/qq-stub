package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMODIFYFEEDBIT.class */
public final class GProMODIFYFEEDBIT {
    static IPatchRedirector $redirector_;
    public static final int MODIFY_FEED_APPROVAL_STATUS = 3;
    public static final int MODIFY_FEED_CONTENT = 2;
    public static final int MODIFY_FEED_EXTENT_INFO = 5;
    public static final int MODIFY_FEED_STATUS = 1;
    public static final int MODIFY_FEED_TAG_INFO = 4;

    public GProMODIFYFEEDBIT() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProMODIFYFEEDBIT{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
