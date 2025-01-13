package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRedPointRsp.class */
public final class GProGetRedPointRsp {
    static IPatchRedirector $redirector_;
    public String avatar;
    public int businessType;
    public long channelId;
    public long guildId;
    public boolean hasRedPoint;
    public String iconUrl;
    public boolean isJoinGuild;
    public String transBuffer;
    public int watchCycle;

    public GProGetRedPointRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.avatar = "";
        this.iconUrl = "";
        this.transBuffer = "";
    }

    public String getAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.avatar : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public boolean getHasRedPoint() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.hasRedPoint : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public boolean getIsJoinGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.isJoinGuild : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public String getTransBuffer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.transBuffer : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getWatchCycle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.watchCycle : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProGetRedPointRsp{hasRedPoint=" + this.hasRedPoint + ",businessType=" + this.businessType + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",avatar=" + this.avatar + ",isJoinGuild=" + this.isJoinGuild + ",watchCycle=" + this.watchCycle + ",iconUrl=" + this.iconUrl + ",transBuffer=" + this.transBuffer + ",}";
    }

    public GProGetRedPointRsp(boolean z, int i, long j, long j2, String str, boolean z2, int i2, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Boolean.valueOf(z), Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), str, Boolean.valueOf(z2), Integer.valueOf(i2), str2, str3);
            return;
        }
        this.avatar = "";
        this.iconUrl = "";
        this.transBuffer = "";
        this.hasRedPoint = z;
        this.businessType = i;
        this.guildId = j;
        this.channelId = j2;
        this.avatar = str;
        this.isJoinGuild = z2;
        this.watchCycle = i2;
        this.iconUrl = str2;
        this.transBuffer = str3;
    }
}
