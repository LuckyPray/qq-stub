package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFetchRecommendChannelRsp.class */
public final class GProFetchRecommendChannelRsp {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String channelName;
    public String guildCoverUrl;
    public String guildIcon;
    public long guildId;
    public String guildName;
    public String guildProfile;

    public GProFetchRecommendChannelRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildName = "";
        this.guildProfile = "";
        this.guildIcon = "";
        this.guildCoverUrl = "";
        this.channelName = "";
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.channelName : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getGuildCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildCoverUrl : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getGuildIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildIcon : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getGuildProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildProfile : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProFetchRecommendChannelRsp{guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildProfile=" + this.guildProfile + ",guildIcon=" + this.guildIcon + ",guildCoverUrl=" + this.guildCoverUrl + ",channelId=" + this.channelId + ",channelName=" + this.channelName + ",}";
    }

    public GProFetchRecommendChannelRsp(long j, String str, String str2, String str3, String str4, long j2, String str5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, str3, str4, Long.valueOf(j2), str5});
            return;
        }
        this.guildName = "";
        this.guildProfile = "";
        this.guildIcon = "";
        this.guildCoverUrl = "";
        this.channelName = "";
        this.guildId = j;
        this.guildName = str;
        this.guildProfile = str2;
        this.guildIcon = str3;
        this.guildCoverUrl = str4;
        this.channelId = j2;
        this.channelName = str5;
    }
}
