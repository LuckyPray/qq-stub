package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopicShowStatus.class */
public final class GProTopicShowStatus {
    static IPatchRedirector $redirector_;
    public static final int GRAY_SHOW = 2;
    public static final int HIGH_LIGHT_SHOW = 1;
    public static final int NOT_SHOW = 3;
    public static final int TOPIC_SHOW_UNKNOWN = 0;

    public GProTopicShowStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProTopicShowStatus{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
