package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRICHTEXTCONTENTTYPE.class */
public final class GProRICHTEXTCONTENTTYPE {
    static IPatchRedirector $redirector_;
    public static final int AT_CONTENT = 2;
    public static final int CHANNEL_CONTENT = 5;
    public static final int EMOJI_CONTENT = 4;
    public static final int GROUP_CONTENT = 9;
    public static final int GUILD_CONTENT = 6;
    public static final int ICON_URL = 7;
    public static final int TEXT_CONTENT = 1;
    public static final int TOPIC_CONTENT = 8;
    public static final int UNKNOWN_CONTENT_TYPE = 0;
    public static final int URL_CONTENT = 3;

    public GProRICHTEXTCONTENTTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProRICHTEXTCONTENTTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
