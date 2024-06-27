package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEncryptTextRsp.class */
public final class GProEncryptTextRsp {
    static IPatchRedirector $redirector_;
    public String encryptedText;
    public boolean isPassed;

    public GProEncryptTextRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.encryptedText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String getEncryptedText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.encryptedText : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getIsPassed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isPassed : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProEncryptTextRsp{isPassed=" + this.isPassed + ",encryptedText=" + this.encryptedText + ",}";
    }

    public GProEncryptTextRsp(boolean z, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Boolean.valueOf(z), str});
            return;
        }
        this.encryptedText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.isPassed = z;
        this.encryptedText = str;
    }
}
