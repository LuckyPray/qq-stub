package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSetJoinGuildOptionReq.class */
public final class GProSetJoinGuildOptionReq {
    static IPatchRedirector $redirector_;
    public long guildId;
    public GProJoinGuildSetting settingInfo;

    public GProSetJoinGuildOptionReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.settingInfo = new GProJoinGuildSetting();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public GProJoinGuildSetting getSettingInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.settingInfo : (GProJoinGuildSetting) iPatchRedirector.redirect((short) 4, this);
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 5, this, j);
        }
    }

    public void setSettingInfo(GProJoinGuildSetting gProJoinGuildSetting) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.settingInfo = gProJoinGuildSetting;
        } else {
            iPatchRedirector.redirect((short) 6, this, gProJoinGuildSetting);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProSetJoinGuildOptionReq{guildId=" + this.guildId + ",settingInfo=" + this.settingInfo + ",}";
    }

    public GProSetJoinGuildOptionReq(long j, GProJoinGuildSetting gProJoinGuildSetting) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), gProJoinGuildSetting});
            return;
        }
        this.settingInfo = new GProJoinGuildSetting();
        this.guildId = j;
        this.settingInfo = gProJoinGuildSetting;
    }
}
