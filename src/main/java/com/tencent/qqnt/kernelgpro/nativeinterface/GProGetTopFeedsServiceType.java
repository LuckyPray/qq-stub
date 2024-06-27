package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetTopFeedsServiceType.class */
public final class GProGetTopFeedsServiceType {
    static IPatchRedirector $redirector_;
    public static final int KCLIENT = 1;
    public static final int KGAMECENTER = 3;
    public static final int KGUILDSHARE = 2;

    public GProGetTopFeedsServiceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProGetTopFeedsServiceType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
