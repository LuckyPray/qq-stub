package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameQuitRoomReq.class */
public final class GProVoiceSmobaGameQuitRoomReq {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int forceExit;
    public long guildId;
    public long roomId;

    public GProVoiceSmobaGameQuitRoomReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getForceExit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.forceExit : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 9, this, j);
        }
    }

    public void setForceExit(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.forceExit = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public void setRoomId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.roomId = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProVoiceSmobaGameQuitRoomReq{roomId=" + this.roomId + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",forceExit=" + this.forceExit + ",}";
    }

    public GProVoiceSmobaGameQuitRoomReq(long j, long j2, long j3, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i)});
            return;
        }
        this.roomId = j;
        this.guildId = j2;
        this.channelId = j3;
        this.forceExit = i;
    }
}
