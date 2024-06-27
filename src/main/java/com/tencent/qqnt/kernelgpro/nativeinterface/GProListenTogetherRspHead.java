package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProListenTogetherRspHead.class */
public final class GProListenTogetherRspHead {
    static IPatchRedirector $redirector_;
    public GProConfirmOption confirmOption;
    public int modCode;

    public GProListenTogetherRspHead() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.confirmOption = new GProConfirmOption();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProConfirmOption getConfirmOption() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.confirmOption : (GProConfirmOption) iPatchRedirector.redirect((short) 3, this);
    }

    public int getModCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.modCode : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProListenTogetherRspHead{modCode=" + this.modCode + ",confirmOption=" + this.confirmOption + ",}";
    }
}
