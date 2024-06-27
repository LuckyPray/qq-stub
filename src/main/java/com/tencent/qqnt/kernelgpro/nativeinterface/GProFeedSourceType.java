package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedSourceType.class */
public final class GProFeedSourceType {
    static IPatchRedirector $redirector_;
    public static final int AIGC = 8;
    public static final int BANNER = 6;
    public static final int GROUPBACKEND = 2;
    public static final int GROUPCLIENT = 1;
    public static final int GROUPHISTORY = 3;
    public static final int GUILD = 0;
    public static final int QQREAD = 9;
    public static final int REPTILE = 5;
    public static final int ROBOT = 4;
    public static final int WEIXINMINIPROGRAM = 7;

    public GProFeedSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProFeedSourceType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
