package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProOfficialMedalInfoExt.class */
public final class GProOfficialMedalInfoExt implements Serializable {
    static IPatchRedirector $redirector_;
    public String iconUrl;
    public boolean isOffical;
    long serialVersionUID;

    public GProOfficialMedalInfoExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.iconUrl = "";
        }
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getIsOffical() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isOffical : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public void setIconUrl(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.iconUrl = str;
        } else {
            iPatchRedirector.redirect((short) 6, this, str);
        }
    }

    public void setIsOffical(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.isOffical = z;
        } else {
            iPatchRedirector.redirect((short) 5, this, z);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProOfficialMedalInfoExt{isOffical=" + this.isOffical + ",iconUrl=" + this.iconUrl + ",}";
    }

    public GProOfficialMedalInfoExt(boolean z, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Boolean.valueOf(z), str});
            return;
        }
        this.serialVersionUID = 1L;
        this.iconUrl = "";
        this.isOffical = z;
        this.iconUrl = str;
    }
}
