package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBussiSource.class */
public final class GProBussiSource {
    static IPatchRedirector $redirector_;
    public static final int SOURCE_BOTTOM_TAB_DIFFRED = 4;
    public static final int SOURCE_BOTTOM_TAB_NOSTATUS = 1;
    public static final int SOURCE_BOTTOM_TAB_NUMRED = 2;
    public static final int SOURCE_BOTTOM_TAB_RED = 3;
    public static final int SOURCE_HALF_SCREEN = 8;
    public static final int SOURCE_HOME_PAGE = 9;
    public static final int SOURCE_NEW_USER_TO_HOT_REC = 10;
    public static final int SOURCE_PUSH = 7;
    public static final int SOURCE_SIDEBAR_BLUE = 6;
    public static final int SOURCE_SIDEBAR_NOSTATUS = 5;
    public static final int SOURCE_UNKOWN = 0;

    public GProBussiSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProBussiSource{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
