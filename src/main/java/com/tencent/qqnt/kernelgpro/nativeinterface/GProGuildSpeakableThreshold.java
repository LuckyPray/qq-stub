package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildSpeakableThreshold.class */
public final class GProGuildSpeakableThreshold implements Serializable {
    static IPatchRedirector $redirector_;
    public boolean guildNeedJoinRole;
    public long guildNeedJoinTime;
    public boolean guildNeedRealName;
    public boolean privateNeedJoinRole;
    public long privateNeedJoinTime;
    public boolean privateNeedRealName;
    long serialVersionUID;

    public GProGuildSpeakableThreshold() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public boolean getGuildNeedJoinRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildNeedJoinRole : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public long getGuildNeedJoinTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildNeedJoinTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public boolean getGuildNeedRealName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildNeedRealName : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public boolean getPrivateNeedJoinRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.privateNeedJoinRole : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public long getPrivateNeedJoinTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.privateNeedJoinTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public boolean getPrivateNeedRealName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.privateNeedRealName : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGuildSpeakableThreshold{guildNeedRealName=" + this.guildNeedRealName + ",guildNeedJoinRole=" + this.guildNeedJoinRole + ",guildNeedJoinTime=" + this.guildNeedJoinTime + ",privateNeedRealName=" + this.privateNeedRealName + ",privateNeedJoinRole=" + this.privateNeedJoinRole + ",privateNeedJoinTime=" + this.privateNeedJoinTime + ",}";
    }

    public GProGuildSpeakableThreshold(boolean z, boolean z2, long j, boolean z3, boolean z4, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j), Boolean.valueOf(z3), Boolean.valueOf(z4), Long.valueOf(j2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.guildNeedRealName = z;
        this.guildNeedJoinRole = z2;
        this.guildNeedJoinTime = j;
        this.privateNeedRealName = z3;
        this.privateNeedJoinRole = z4;
        this.privateNeedJoinTime = j2;
    }
}
