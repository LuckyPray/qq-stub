package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDoCommentType.class */
public final class GProDoCommentType {
    static IPatchRedirector $redirector_;
    public static final int COMMENT_TYPE = 1;
    public static final int DEL_COMMENT_TYPE = 0;
    public static final int DEL_COMMENT_TYPE_OWNER = 2;

    public GProDoCommentType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProDoCommentType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
