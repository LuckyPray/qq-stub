package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProReviewStatus.class */
public final class GProReviewStatus {
    static IPatchRedirector $redirector_;
    public static final int STATUSAPPROVED = 3;
    public static final int STATUSINREVIEW = 1;
    public static final int STATUSNOTAPPROVED = 2;
    public static final int UNKNOWNSTATUS = 0;

    public GProReviewStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProReviewStatus{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
