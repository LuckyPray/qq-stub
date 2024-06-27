package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCommentSourceType.class */
public final class GProCommentSourceType {
    static IPatchRedirector $redirector_;
    public static final int COMMENTCORAL = 2;
    public static final int COMMENTGAMECENTER = 3;
    public static final int COMMENTMACHINECARE = 1;
    public static final int COMMENTNORMAL = 0;

    public GProCommentSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProCommentSourceType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
