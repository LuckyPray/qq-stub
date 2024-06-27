package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEditScheduleReq.class */
public final class GProEditScheduleReq {
    static IPatchRedirector $redirector_;
    public int chanelType;
    public long channelId;
    public int editType;
    public long guildId;
    public GProScheduleInfo scheduleInfo;

    public GProEditScheduleReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.scheduleInfo = new GProScheduleInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getChanelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.chanelType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getEditType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.editType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProScheduleInfo getScheduleInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.scheduleInfo : (GProScheduleInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProEditScheduleReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",chanelType=" + this.chanelType + ",scheduleInfo=" + this.scheduleInfo + ",editType=" + this.editType + ",}";
    }
}
