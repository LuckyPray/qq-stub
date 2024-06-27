package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameKickOutRoomReq.class */
public final class GProVoiceSmobaGameKickOutRoomReq {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int forceExit;
    public long guildId;
    public long roomId;
    public long second;
    public long tinyId;

    public GProVoiceSmobaGameKickOutRoomReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public int getForceExit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.forceExit : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getSecond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.second : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 12, this, j);
        }
    }

    public void setForceExit(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.forceExit = i;
        } else {
            iPatchRedirector.redirect((short) 13, this, i);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 11, this, j);
        }
    }

    public void setRoomId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.roomId = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public void setSecond(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.second = j;
        } else {
            iPatchRedirector.redirect((short) 14, this, j);
        }
    }

    public void setTinyId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.tinyId = j;
        } else {
            iPatchRedirector.redirect((short) 9, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProVoiceSmobaGameKickOutRoomReq{tinyId=" + this.tinyId + ",roomId=" + this.roomId + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",forceExit=" + this.forceExit + ",second=" + this.second + ",}";
    }

    public GProVoiceSmobaGameKickOutRoomReq(long j, long j2, long j3, long j4, int i, long j5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), Long.valueOf(j5)});
            return;
        }
        this.tinyId = j;
        this.roomId = j2;
        this.guildId = j3;
        this.channelId = j4;
        this.forceExit = i;
        this.second = j5;
    }
}
