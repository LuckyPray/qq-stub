package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSlowModeInfo.class */
public final class GProSlowModeInfo implements Serializable {
    static IPatchRedirector $redirector_;
    long serialVersionUID;
    public int slowModeCircle;
    public int slowModeKey;
    public String slowModeText;
    public int speakFrequency;

    public GProSlowModeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.slowModeText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public int getSlowModeCircle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.slowModeCircle : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getSlowModeKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.slowModeKey : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getSlowModeText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.slowModeText : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getSpeakFrequency() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.speakFrequency : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProSlowModeInfo{slowModeKey=" + this.slowModeKey + ",speakFrequency=" + this.speakFrequency + ",slowModeCircle=" + this.slowModeCircle + ",slowModeText=" + this.slowModeText + ",}";
    }
}
