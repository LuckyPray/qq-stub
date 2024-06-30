package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStIconInfo.class */
public final class GProStIconInfo {
    static IPatchRedirector $redirector_;
    public byte[] avatarMeta;
    public String iconUrl;
    public String iconUrl100;
    public String iconUrl140;
    public String iconUrl40;
    public String iconUrl640;

    public GProStIconInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.iconUrl40 = "";
        this.iconUrl100 = "";
        this.iconUrl140 = "";
        this.iconUrl640 = "";
        this.iconUrl = "";
        this.avatarMeta = new byte[0];
    }

    public byte[] getAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.avatarMeta : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getIconUrl100() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.iconUrl100 : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getIconUrl140() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.iconUrl140 : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getIconUrl40() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.iconUrl40 : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getIconUrl640() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.iconUrl640 : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProStIconInfo{iconUrl40=" + this.iconUrl40 + ",iconUrl100=" + this.iconUrl100 + ",iconUrl140=" + this.iconUrl140 + ",iconUrl640=" + this.iconUrl640 + ",iconUrl=" + this.iconUrl + ",avatarMeta=" + this.avatarMeta + ",}";
    }
}
