package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNOTICEPATTONTYPE.class */
public final class GProNOTICEPATTONTYPE {
    static IPatchRedirector $redirector_;
    public static final int NOTICE_PATTON_TYPE_PLAIN_TXT = 1;

    public GProNOTICEPATTONTYPE() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProNOTICEPATTONTYPE{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
