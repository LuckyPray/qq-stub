package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProREQFROMTYPE.class */
public final class GProREQFROMTYPE {
    static IPatchRedirector $redirector_;
    public static final int FEED_DETAIL_RECOMMEND = 9;
    public static final int GAME_CENTER = 8;
    public static final int GROUP_ZONE = 5;

    /* renamed from: H5 */
    public static final int f73H5 = 2;
    public static final int IMMERSIVE_REQ_FROM = 6;
    public static final int NATIVE_APP = 1;
    public static final int QQCHANNEL_SVR = 3;
    public static final int REPORT_VERIFY_SVR = 4;
    public static final int UNKONWN_REQ_FROM_TYPE = 0;
    public static final int WECHAT_FROM = 7;

    public GProREQFROMTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProREQFROMTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
