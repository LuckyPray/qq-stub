package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJoinGuildResult.class */
public final class GProJoinGuildResult implements Serializable {
    static IPatchRedirector $redirector_;
    public GProCmd0xf5dGuildInfo guildChannels;
    public long guildId;
    public GProGuild guildInfo;
    public int openTab;
    public int qqMsgInList;
    public int retCode;
    public GProSecurityResult secRet;
    long serialVersionUID;

    public GProJoinGuildResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.secRet = new GProSecurityResult();
        this.guildChannels = new GProCmd0xf5dGuildInfo();
        this.guildInfo = new GProGuild();
    }

    public GProCmd0xf5dGuildInfo getGuildChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildChannels : (GProCmd0xf5dGuildInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public GProGuild getGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildInfo : (GProGuild) iPatchRedirector.redirect((short) 6, this);
    }

    public int getOpenTab() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.openTab : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getQqMsgInList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.qqMsgInList : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getRetCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.retCode : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public GProSecurityResult getSecRet() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.secRet : (GProSecurityResult) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProJoinGuildResult{secRet=" + this.secRet + ",guildId=" + this.guildId + ",retCode=" + this.retCode + ",guildChannels=" + this.guildChannels + ",guildInfo=" + this.guildInfo + ",qqMsgInList=" + this.qqMsgInList + ",openTab=" + this.openTab + ",}";
    }
}
