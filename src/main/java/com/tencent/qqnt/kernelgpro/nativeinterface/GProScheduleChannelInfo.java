package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProScheduleChannelInfo.class */
public final class GProScheduleChannelInfo {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String channelName;
    public long guildId;
    public boolean hasJoin;
    public boolean isPrivate;
    public int type;

    public GProScheduleChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public boolean getHasJoin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.hasJoin : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public boolean getIsPrivate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.isPrivate : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProScheduleChannelInfo{channelId=" + this.channelId + ",type=" + this.type + ",guildId=" + this.guildId + ",channelName=" + this.channelName + ",isPrivate=" + this.isPrivate + ",hasJoin=" + this.hasJoin + ",}";
    }

    public GProScheduleChannelInfo(long j, int i, long j2, String str, boolean z, boolean z2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Long.valueOf(j2), str, Boolean.valueOf(z), Boolean.valueOf(z2)});
            return;
        }
        this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelId = j;
        this.type = i;
        this.guildId = j2;
        this.channelName = str;
        this.isPrivate = z;
        this.hasJoin = z2;
    }
}
