package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNavigationType.class */
public final class GProNavigationType implements Serializable {
    static IPatchRedirector $redirector_;
    public static final int NAVIGATION_DEFAULT = 0;
    public static final int NAVIGATION_FEATURED = 2;
    public static final int NAVIGATION_FRIEND = 3;
    public static final int NAVIGATION_LINK = 4;
    public static final int NAVIGATION_MY = 1;
    long serialVersionUID;

    public GProNavigationType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProNavigationType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
