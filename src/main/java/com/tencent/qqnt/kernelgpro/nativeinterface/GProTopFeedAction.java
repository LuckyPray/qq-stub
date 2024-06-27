package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopFeedAction.class */
public final class GProTopFeedAction {
    static IPatchRedirector $redirector_;
    public static final int TOP_FEED_ACTION_CANCEL = 2;
    public static final int TOP_FEED_ACTION_RESERVE = 0;
    public static final int TOP_FEED_ACTION_TOP = 1;

    public GProTopFeedAction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProTopFeedAction{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
