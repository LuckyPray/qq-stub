package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GproXWorldInfo.class */
public final class GproXWorldInfo {
    static IPatchRedirector $redirector_;
    public boolean allowDisplay;
    public long bindTime;
    public long guildId;
    public String guildName;
    public String guildUrl;

    public GproXWorldInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.guildUrl = "";
            this.guildName = "";
        }
    }

    public boolean getAllowDisplay() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.allowDisplay : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public long getBindTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.bindTime : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getGuildUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GproXWorldInfo{allowDisplay=" + this.allowDisplay + ",guildId=" + this.guildId + ",guildUrl=" + this.guildUrl + ",bindTime=" + this.bindTime + ",guildName=" + this.guildName + ",}";
    }

    public GproXWorldInfo(boolean z, long j, String str, long j2, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Boolean.valueOf(z), Long.valueOf(j), str, Long.valueOf(j2), str2);
            return;
        }
        this.guildUrl = "";
        this.guildName = "";
        this.allowDisplay = z;
        this.guildId = j;
        this.guildUrl = str;
        this.bindTime = j2;
        this.guildName = str2;
    }
}
