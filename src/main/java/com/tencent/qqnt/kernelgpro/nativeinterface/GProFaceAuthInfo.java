package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFaceAuthInfo.class */
public final class GProFaceAuthInfo {
    static IPatchRedirector $redirector_;
    public int faceAuthStatus;
    public String verifyUrl;

    public GProFaceAuthInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.verifyUrl = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getFaceAuthStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.faceAuthStatus : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getVerifyUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.verifyUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProFaceAuthInfo{faceAuthStatus=" + this.faceAuthStatus + ",verifyUrl=" + this.verifyUrl + ",}";
    }

    public GProFaceAuthInfo(int i, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, str);
            return;
        }
        this.verifyUrl = "";
        this.faceAuthStatus = i;
        this.verifyUrl = str;
    }
}
