package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProInteractType.class */
public final class GProInteractType {
    static IPatchRedirector $redirector_;
    public static final int INTERACT_TYPE_COMMENT = 1;
    public static final int INTERACT_TYPE_FEED_LIKE = 3;
    public static final int INTERACT_TYPE_REPLY = 2;
    public static final int INTERACT_TYPE_RESERVE = 0;

    public GProInteractType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProInteractType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
