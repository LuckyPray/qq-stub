package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserJoinedGuildSummary.class */
public final class GProUserJoinedGuildSummary {
    static IPatchRedirector $redirector_;
    public ArrayList<GProRecommendChannelInfo> guildList;
    public String joinedCountStr;

    public GProUserJoinedGuildSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.joinedCountStr = "";
            this.guildList = new ArrayList<>();
        }
    }

    public ArrayList<GProRecommendChannelInfo> getGuildList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getJoinedCountStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.joinedCountStr : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProUserJoinedGuildSummary{joinedCountStr=" + this.joinedCountStr + ",guildList=" + this.guildList + ",}";
    }
}
