package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameDissmissRoomReq.class */
public final class GProVoiceSmobaGameDissmissRoomReq {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long guildId;
    public long roomId;
    public int source;

    public GProVoiceSmobaGameDissmissRoomReq() {
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

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.source : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 9, this, j);
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

    public void setSource(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.source = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProVoiceSmobaGameDissmissRoomReq{roomId=" + this.roomId + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",source=" + this.source + ",}";
    }

    public GProVoiceSmobaGameDissmissRoomReq(long j, long j2, long j3, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i));
            return;
        }
        this.roomId = j;
        this.guildId = j2;
        this.channelId = j3;
        this.source = i;
    }
}
