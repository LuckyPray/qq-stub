package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPFunctionType.class */
public final class GProMVPFunctionType {
    static IPatchRedirector $redirector_;
    public static final int FUNCTION_TYPE_BUSINESS_CARD = 3;
    public static final int FUNCTION_TYPE_PRESERVE = 0;
    public static final int FUNCTION_TYPE_TENCENT_DOCUMENT = 2;
    public static final int FUNCTION_TYPE_THIRD_PARTY_VIDEO = 1;
    public static final int FUNCTION_TYPE_WEIXIN_OFFICIAL_ACCOUNT = 4;

    public GProMVPFunctionType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProMVPFunctionType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
