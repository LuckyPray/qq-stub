package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetNavigationRsp.class */
public final class GProGetNavigationRsp {
    static IPatchRedirector $redirector_;
    public GProGuildNavigationInfo guildNavigation;

    public GProGetNavigationRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.guildNavigation = new GProGuildNavigationInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProGuildNavigationInfo getGuildNavigation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildNavigation : (GProGuildNavigationInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProGetNavigationRsp{guildNavigation=" + this.guildNavigation + ",}";
    }

    public GProGetNavigationRsp(GProGuildNavigationInfo gProGuildNavigationInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProGuildNavigationInfo);
        } else {
            this.guildNavigation = new GProGuildNavigationInfo();
            this.guildNavigation = gProGuildNavigationInfo;
        }
    }
}
