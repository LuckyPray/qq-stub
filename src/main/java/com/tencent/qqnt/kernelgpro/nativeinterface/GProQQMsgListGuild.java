package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProQQMsgListGuild.class */
public final class GProQQMsgListGuild {
    static IPatchRedirector $redirector_;
    public long avatarSeq;
    public long guildId;
    public String guildName;
    public long topTimestamp;

    public GProQQMsgListGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.guildName = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getAvatarSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.avatarSeq : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getTopTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.topTimestamp : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProQQMsgListGuild{guildId=" + this.guildId + ",topTimestamp=" + this.topTimestamp + ",guildName=" + this.guildName + ",avatarSeq=" + this.avatarSeq + ",}";
    }

    public GProQQMsgListGuild(long j, long j2, String str, long j3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), str, Long.valueOf(j3));
            return;
        }
        this.guildName = "";
        this.guildId = j;
        this.topTimestamp = j2;
        this.guildName = str;
        this.avatarSeq = j3;
    }
}
