package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProOtherJumpAddressType.class */
public final class GProOtherJumpAddressType {
    static IPatchRedirector $redirector_;
    public static final int TYPE_FEED_SHARE_URL = 1;
    public static final int TYPE_INVALID = 0;
    public static final int TYPE_OFFLINE_ADDR = 2;

    public GProOtherJumpAddressType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProOtherJumpAddressType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
