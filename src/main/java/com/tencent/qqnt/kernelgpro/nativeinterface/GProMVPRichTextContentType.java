package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPRichTextContentType.class */
public final class GProMVPRichTextContentType {
    static IPatchRedirector $redirector_;
    public static final int RICH_TEXT_CONTENT_TYPE_AT = 2;
    public static final int RICH_TEXT_CONTENT_TYPE_CHANNEL = 5;
    public static final int RICH_TEXT_CONTENT_TYPE_EMOJI = 4;
    public static final int RICH_TEXT_CONTENT_TYPE_GROUP = 9;
    public static final int RICH_TEXT_CONTENT_TYPE_RESERVE = 0;
    public static final int RICH_TEXT_CONTENT_TYPE_TEXT = 1;
    public static final int RICH_TEXT_CONTENT_TYPE_TOPIC = 8;
    public static final int RICH_TEXT_CONTENT_TYPE_URL = 3;

    public GProMVPRichTextContentType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProMVPRichTextContentType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
