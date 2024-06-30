package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSpeakModeRsp.class */
public final class GProVoiceSpeakModeRsp {
    static IPatchRedirector $redirector_;
    public String confirmExt;
    public String confirmMsg;
    public int modCode;

    public GProVoiceSpeakModeRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.confirmMsg = "";
            this.confirmExt = "";
        }
    }

    public String getConfirmExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.confirmExt : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getConfirmMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.confirmMsg : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getModCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.modCode : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProVoiceSpeakModeRsp{modCode=" + this.modCode + ",confirmMsg=" + this.confirmMsg + ",confirmExt=" + this.confirmExt + ",}";
    }
}
