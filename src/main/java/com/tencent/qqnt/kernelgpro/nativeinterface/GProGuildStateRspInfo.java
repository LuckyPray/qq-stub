package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildStateRspInfo.class */
public final class GProGuildStateRspInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProGuildState> guildStatusList;
    public long nextTs;
    public GProUserChannelState userStateInfo;

    public GProGuildStateRspInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.guildStatusList = new ArrayList<>();
            this.userStateInfo = new GProUserChannelState();
        }
    }

    public ArrayList<GProGuildState> getGuildStatusList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildStatusList : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public long getNextTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.nextTs : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public GProUserChannelState getUserStateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.userStateInfo : (GProUserChannelState) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProGuildStateRspInfo{guildStatusList=" + this.guildStatusList + ",nextTs=" + this.nextTs + ",userStateInfo=" + this.userStateInfo + ",}";
    }
}
