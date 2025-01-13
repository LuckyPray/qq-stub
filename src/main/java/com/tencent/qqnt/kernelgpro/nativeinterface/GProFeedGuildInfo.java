package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedGuildInfo.class */
public final class GProFeedGuildInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String guildIcon;
    public long guildId;
    public String guildName;
    public String joinGuildSig;
    public ArrayList<GProMedalInfo> medals;
    long serialVersionUID;

    public GProFeedGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = "";
        this.guildIcon = "";
        this.joinGuildSig = "";
        this.medals = new ArrayList<>();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getGuildIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildIcon : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<GProMedalInfo> getMedals() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.medals : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProFeedGuildInfo{guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildIcon=" + this.guildIcon + ",joinGuildSig=" + this.joinGuildSig + ",channelId=" + this.channelId + ",medals=" + this.medals + ",}";
    }

    public GProFeedGuildInfo(long j, String str, String str2, String str3, long j2, ArrayList<GProMedalInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, str2, str3, Long.valueOf(j2), arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = "";
        this.guildIcon = "";
        this.joinGuildSig = "";
        this.medals = new ArrayList<>();
        this.guildId = j;
        this.guildName = str;
        this.guildIcon = str2;
        this.joinGuildSig = str3;
        this.channelId = j2;
        this.medals = arrayList;
    }
}
