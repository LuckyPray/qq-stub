package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuideType.class */
public final class GProGuideType {
    static IPatchRedirector $redirector_;
    public static final int GUIDE_TYPE_FRIEND = 4;
    public static final int GUIDE_TYPE_GAME = 3;
    public static final int GUIDE_TYPE_NORMAL = 1;
    public static final int GUIDE_TYPE_RESERVE = 0;
    public static final int GUIDE_TYPE_SCHOOL = 2;

    public GProGuideType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProGuideType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
