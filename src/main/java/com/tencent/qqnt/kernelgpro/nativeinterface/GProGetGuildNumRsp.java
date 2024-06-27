package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetGuildNumRsp.class */
public final class GProGetGuildNumRsp {
    static IPatchRedirector $redirector_;
    public GProGuildNumInfo guildNumInfo;

    public GProGetGuildNumRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.guildNumInfo = new GProGuildNumInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProGuildNumInfo getGuildNumInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildNumInfo : (GProGuildNumInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
            return (String) iPatchRedirector.redirect((short) 3, this);
        }
        return "GProGetGuildNumRsp{guildNumInfo=" + this.guildNumInfo + ",}";
    }
}
