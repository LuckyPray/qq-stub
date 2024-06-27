package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetChannelActivityRsp.class */
public final class GProGetChannelActivityRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProChannelActivity> channelActivities;
    public int closeOption;
    public long guildId;
    public boolean isShow;

    public GProGetChannelActivityRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.channelActivities = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProChannelActivity> getChannelActivities() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelActivities : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public int getCloseOption() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.closeOption : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public boolean getIsShow() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isShow : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetChannelActivityRsp{guildId=" + this.guildId + ",channelActivities=" + this.channelActivities + ",isShow=" + this.isShow + ",closeOption=" + this.closeOption + ",}";
    }

    public GProGetChannelActivityRsp(long j, ArrayList<GProChannelActivity> arrayList, boolean z, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), arrayList, Boolean.valueOf(z), Integer.valueOf(i)});
            return;
        }
        this.channelActivities = new ArrayList<>();
        this.guildId = j;
        this.channelActivities = arrayList;
        this.isShow = z;
        this.closeOption = i;
    }
}
