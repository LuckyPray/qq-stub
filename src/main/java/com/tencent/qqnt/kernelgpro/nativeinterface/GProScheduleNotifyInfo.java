package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProScheduleNotifyInfo.class */
public final class GProScheduleNotifyInfo {
    static IPatchRedirector $redirector_;
    public int atType;
    public long channelId;
    public long guildId;
    public boolean needNotify;
    public GProScheduleInfo scheduleInfo;

    public GProScheduleNotifyInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.scheduleInfo = new GProScheduleInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getAtType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.atType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public boolean getNeedNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.needNotify : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public GProScheduleInfo getScheduleInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.scheduleInfo : (GProScheduleInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProScheduleNotifyInfo{scheduleInfo=" + this.scheduleInfo + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",needNotify=" + this.needNotify + ",atType=" + this.atType + ",}";
    }
}
