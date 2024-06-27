package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFunctionType.class */
public final class GProFunctionType {
    static IPatchRedirector $redirector_;
    public static final int FUNCTION_TYPE_ARTICLE_TEXT_FEED = 5;
    public static final int FUNCTION_TYPE_BUSINESS_CARD = 3;
    public static final int FUNCTION_TYPE_PRESERVE = 0;
    public static final int FUNCTION_TYPE_TENCENT_DOCUMENT = 2;
    public static final int FUNCTION_TYPE_THIRD_PARTY_VIDEO = 1;
    public static final int FUNCTION_TYPE_WEIXIN_OFFICIAL_ACCOUNT = 4;

    public GProFunctionType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProFunctionType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
