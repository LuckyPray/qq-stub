package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProURLTYPE.class */
public final class GProURLTYPE {
    static IPatchRedirector $redirector_;
    public static final int DEFAULT = 0;
    public static final int URL_TYPE_BILIBILI = 1;
    public static final int URL_TYPE_TENCENT_DOCS = 3;
    public static final int URL_TYPE_TENCENT_MEETING = 4;
    public static final int URL_TYPE_WEIXIN_OFFICIAL_ACCOUNTS = 2;

    public GProURLTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProURLTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
