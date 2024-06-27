package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNOTICEOPERATIONTYPE.class */
public final class GProNOTICEOPERATIONTYPE {
    static IPatchRedirector $redirector_;
    public static final int NOTICE_OPERATION_TYPE_DO_SCHEMA = 1;

    public GProNOTICEOPERATIONTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProNOTICEOPERATIONTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
