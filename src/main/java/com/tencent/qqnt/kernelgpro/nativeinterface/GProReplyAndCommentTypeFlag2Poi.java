package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProReplyAndCommentTypeFlag2Poi.class */
public final class GProReplyAndCommentTypeFlag2Poi {
    static IPatchRedirector $redirector_;
    public static final int HOT = 2;
    public static final int LIKED = 1;
    public static final int TOP = 0;

    public GProReplyAndCommentTypeFlag2Poi() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProReplyAndCommentTypeFlag2Poi{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
