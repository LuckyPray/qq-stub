package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetPreviewNavigationRsp.class */
public final class GProGetPreviewNavigationRsp {
    static IPatchRedirector $redirector_;
    public GProGuildNavigationInfo guildNavigation;
    public ArrayList<GProGuildNavIconTheme> iconThemes;
    public int total;

    public GProGetPreviewNavigationRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.guildNavigation = new GProGuildNavigationInfo();
            this.iconThemes = new ArrayList<>();
        }
    }

    public GProGuildNavigationInfo getGuildNavigation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildNavigation : (GProGuildNavigationInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProGuildNavIconTheme> getIconThemes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.iconThemes : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public int getTotal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.total : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProGetPreviewNavigationRsp{guildNavigation=" + this.guildNavigation + ",iconThemes=" + this.iconThemes + ",total=" + this.total + ",}";
    }
}
