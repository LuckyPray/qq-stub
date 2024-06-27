package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetSelectChannelIDRsp.class */
public final class GProGetSelectChannelIDRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> guildIds;
    public ArrayList<GProGuildInfoInLabel> guildInfos;

    public GProGetSelectChannelIDRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.guildIds = new ArrayList<>();
            this.guildInfos = new ArrayList<>();
        }
    }

    public ArrayList<Long> getGuildIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildIds : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProGuildInfoInLabel> getGuildInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildInfos : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProGetSelectChannelIDRsp{guildIds=" + this.guildIds + ",guildInfos=" + this.guildInfos + ",}";
    }

    public GProGetSelectChannelIDRsp(ArrayList<Long> arrayList, ArrayList<GProGuildInfoInLabel> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, arrayList2);
            return;
        }
        this.guildIds = new ArrayList<>();
        this.guildInfos = new ArrayList<>();
        this.guildIds = arrayList;
        this.guildInfos = arrayList2;
    }
}
