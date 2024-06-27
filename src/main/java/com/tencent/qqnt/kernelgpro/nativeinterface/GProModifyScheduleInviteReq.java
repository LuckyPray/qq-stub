package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProModifyScheduleInviteReq.class */
public final class GProModifyScheduleInviteReq {
    static IPatchRedirector $redirector_;
    public int chanelType;
    public long channelId;
    public long guildId;
    public int inviteStatus;
    public long scheduleId;

    public GProModifyScheduleInviteReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getChanelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.chanelType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public int getInviteStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.inviteStatus : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getScheduleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.scheduleId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProModifyScheduleInviteReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",chanelType=" + this.chanelType + ",scheduleId=" + this.scheduleId + ",inviteStatus=" + this.inviteStatus + ",}";
    }
}
