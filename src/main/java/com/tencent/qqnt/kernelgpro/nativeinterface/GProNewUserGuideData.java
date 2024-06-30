package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNewUserGuideData.class */
public final class GProNewUserGuideData implements Serializable {
    static IPatchRedirector $redirector_;
    public String animationUrl;
    long serialVersionUID;
    public int tabExposeFlag;

    public GProNewUserGuideData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.animationUrl = "";
        }
    }

    public String getAnimationUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.animationUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getTabExposeFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tabExposeFlag : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProNewUserGuideData{animationUrl=" + this.animationUrl + ",tabExposeFlag=" + this.tabExposeFlag + ",}";
    }

    public GProNewUserGuideData(String str, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, i);
            return;
        }
        this.serialVersionUID = 1L;
        this.animationUrl = "";
        this.animationUrl = str;
        this.tabExposeFlag = i;
    }
}
