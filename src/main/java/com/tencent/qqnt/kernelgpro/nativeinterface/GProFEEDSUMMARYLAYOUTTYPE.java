package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFEEDSUMMARYLAYOUTTYPE.class */
public final class GProFEEDSUMMARYLAYOUTTYPE {
    static IPatchRedirector $redirector_;
    public static final int MIXED_MEDIA_LAYOUT = 4;
    public static final int PLAIN_TEXT_LAYOUT = 1;
    public static final int SINGLE_PIC_LAYOUT = 2;
    public static final int SINGLE_VIDEO_LAYOUT = 3;
    public static final int TENCENT_DOCS_LAYOUT = 7;
    public static final int THIRD_PLATFORM_VIDEO_LAYOUT = 5;
    public static final int UNKNOWN_SUMMARY_LAYOUT_TYPE = 0;
    public static final int WEIXIN_OFFICIAL_ACCOUNT_LAYOUT = 6;

    public GProFEEDSUMMARYLAYOUTTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProFEEDSUMMARYLAYOUTTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
