package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMsgRouttingHead.class */
public final class GProMsgRouttingHead {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int directMsgFlag;
    public long fromTinyid;
    public long fromUin;
    public long guildCode;
    public long guildId;

    public GProMsgRouttingHead() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getDirectMsgFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.directMsgFlag : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getFromTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.fromTinyid : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getFromUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.fromUin : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getGuildCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildCode : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProMsgRouttingHead{guildId=" + this.guildId + ",channelId=" + this.channelId + ",fromUin=" + this.fromUin + ",fromTinyid=" + this.fromTinyid + ",guildCode=" + this.guildCode + ",directMsgFlag=" + this.directMsgFlag + ",}";
    }

    public GProMsgRouttingHead(long j, long j2, long j3, long j4, long j5, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i));
            return;
        }
        this.guildId = j;
        this.channelId = j2;
        this.fromUin = j3;
        this.fromTinyid = j4;
        this.guildCode = j5;
        this.directMsgFlag = i;
    }
}
