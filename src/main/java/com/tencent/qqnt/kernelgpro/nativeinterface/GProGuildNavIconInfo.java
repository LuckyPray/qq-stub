package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildNavIconInfo.class */
public final class GProGuildNavIconInfo {
    static IPatchRedirector $redirector_;
    public long iconId;
    public String iconName;
    public String iconUrl;

    public GProGuildNavIconInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.iconUrl = "";
            this.iconName = "";
        }
    }

    public long getIconId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.iconId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getIconName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.iconName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGuildNavIconInfo{iconId=" + this.iconId + ",iconUrl=" + this.iconUrl + ",iconName=" + this.iconName + ",}";
    }

    public GProGuildNavIconInfo(long j, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2});
            return;
        }
        this.iconUrl = "";
        this.iconName = "";
        this.iconId = j;
        this.iconUrl = str;
        this.iconName = str2;
    }
}
