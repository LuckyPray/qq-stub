package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProScene.class */
public final class GProScene {
    static IPatchRedirector $redirector_;
    public static final int BOTTOM_TAB_RECOMMEND = 8;
    public static final int GUILD_EXTENDED_PAGE = 12;
    public static final int JB_FEED = 2;
    public static final int MOBILE_QQ_INIT = 9;
    public static final int NATIVE_DISOVER = 10;
    public static final int NEW_USER_DISCOVER = 13;
    public static final int OA_RECOMMEND = 7;
    public static final int PC_DISOVER = 11;
    public static final int PD_DISCOVER = 0;
    public static final int PD_FEEDS_DISCOVER = 14;
    public static final int PD_FEEDS_PUBLICK = 15;
    public static final int PD_GUILD_HOT_FEEDS = 6;
    public static final int PD_RECOMMEND = 4;
    public static final int PD_ROOM_RECOMMEND = 5;
    public static final int XSJ_FEED = 1;
    public static final int XSJ_HOMEPAGE = 3;

    public GProScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProScene{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
