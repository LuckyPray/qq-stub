package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDoModifyType.class */
public final class GProDoModifyType {
    static IPatchRedirector $redirector_;
    public static final int SECURITY_BEAT_ROLL_BACK_TYPE = 6;
    public static final int SECURITY_BEAT_TYPE = 2;
    public static final int UPDATE_TYPE_TYPE = 5;

    public GProDoModifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProDoModifyType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
