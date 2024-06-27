package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecentVisitChannelList.class */
public final class GProRecentVisitChannelList {
    static IPatchRedirector $redirector_;
    public long guildId;
    public int maxRecentVisitConfigCount;
    public ArrayList<GProRecentVisitChannelInfo> recentList;

    public GProRecentVisitChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.recentList = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public int getMaxRecentVisitConfigCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.maxRecentVisitConfigCount : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProRecentVisitChannelInfo> getRecentList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recentList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRecentVisitChannelList{guildId=" + this.guildId + ",recentList=" + this.recentList + ",maxRecentVisitConfigCount=" + this.maxRecentVisitConfigCount + ",}";
    }
}
