package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSendNoticeRspCode.class */
public final class GProSendNoticeRspCode {
    static IPatchRedirector $redirector_;
    public static final int NOT_ALLOW_USE = 2;

    /* renamed from: OK */
    public static final int f77OK = 1;
    public static final int UNKNOWN = 0;

    public GProSendNoticeRspCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProSendNoticeRspCode{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
