package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEncryptTextReq.class */
public final class GProEncryptTextReq {
    static IPatchRedirector $redirector_;
    public String appId;
    public String originalText;

    public GProEncryptTextReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.appId = "";
            this.originalText = "";
        }
    }

    public String getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.appId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getOriginalText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.originalText : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public void setAppId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.appId = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public void setOriginalText(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.originalText = str;
        } else {
            iPatchRedirector.redirect((short) 6, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProEncryptTextReq{appId=" + this.appId + ",originalText=" + this.originalText + ",}";
    }

    public GProEncryptTextReq(String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2);
            return;
        }
        this.appId = "";
        this.originalText = "";
        this.appId = str;
        this.originalText = str2;
    }
}
