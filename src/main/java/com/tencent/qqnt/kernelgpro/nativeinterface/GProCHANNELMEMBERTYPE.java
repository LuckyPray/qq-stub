package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCHANNELMEMBERTYPE.class */
public final class GProCHANNELMEMBERTYPE {
    static IPatchRedirector $redirector_;
    public static final int ADMIN_MEMBER = 3;
    public static final int NORMAL_MEMBER = 2;
    public static final int NOT_MEMBER = 1;
    public static final int NOT_WHITE_LIST_USER = 0;
    public static final int VISITOR = 4;

    public GProCHANNELMEMBERTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProCHANNELMEMBERTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
