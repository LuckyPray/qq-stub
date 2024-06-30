package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPersonalSignatureTemplate.class */
public final class GProPersonalSignatureTemplate {
    static IPatchRedirector $redirector_;
    public String avatarUrl;
    public String sampleText;

    public GProPersonalSignatureTemplate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.avatarUrl = "";
            this.sampleText = "";
        }
    }

    public String getAvatarUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.avatarUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getSampleText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.sampleText : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProPersonalSignatureTemplate{avatarUrl=" + this.avatarUrl + ",sampleText=" + this.sampleText + ",}";
    }

    public GProPersonalSignatureTemplate(String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2);
            return;
        }
        this.avatarUrl = "";
        this.sampleText = "";
        this.avatarUrl = str;
        this.sampleText = str2;
    }
}
