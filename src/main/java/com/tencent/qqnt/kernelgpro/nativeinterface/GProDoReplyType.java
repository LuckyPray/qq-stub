package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDoReplyType.class */
public final class GProDoReplyType {
    static IPatchRedirector $redirector_;
    public static final int DEL_REPLY_TYPE = 0;
    public static final int DEL_REPLY_TYPE_OWNER = 2;
    public static final int REPLY_TYPE = 1;

    public GProDoReplyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProDoReplyType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
