package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCreateScheduleReq.class */
public final class GProCreateScheduleReq {
    static IPatchRedirector $redirector_;
    public int atMemberType;
    public ArrayList<Long> atRoleIds;
    public int chanelType;
    public long channelId;
    public long guildId;
    public GProScheduleInfo scheduleInfo;

    public GProCreateScheduleReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.scheduleInfo = new GProScheduleInfo();
            this.atRoleIds = new ArrayList<>();
        }
    }

    public int getAtMemberType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.atMemberType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public ArrayList<Long> getAtRoleIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.atRoleIds : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public int getChanelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.chanelType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProScheduleInfo getScheduleInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.scheduleInfo : (GProScheduleInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProCreateScheduleReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",scheduleInfo=" + this.scheduleInfo + ",chanelType=" + this.chanelType + ",atMemberType=" + this.atMemberType + ",atRoleIds=" + this.atRoleIds + ",}";
    }
}
