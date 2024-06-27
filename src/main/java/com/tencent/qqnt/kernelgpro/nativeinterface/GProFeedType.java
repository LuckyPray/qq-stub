package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedType.class */
public final class GProFeedType {
    static IPatchRedirector $redirector_;
    public static final int FEED_TYPE_DEFAULT_TYPE = 0;
    public static final int FEED_TYPE_RICH_TYPE = 2;
    public static final int FEED_TYPE_SIMPLE_TYPE = 1;

    public GProFeedType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProFeedType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
