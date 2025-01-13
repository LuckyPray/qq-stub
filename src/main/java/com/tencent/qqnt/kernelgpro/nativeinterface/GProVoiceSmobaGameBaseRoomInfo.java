package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameBaseRoomInfo.class */
public final class GProVoiceSmobaGameBaseRoomInfo {
    static IPatchRedirector $redirector_;
    public long captainTinyId;
    public long channelId;
    public long guildId;
    public long roomId;
    public int roomType;

    public GProVoiceSmobaGameBaseRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getCaptainTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.captainTinyId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getRoomType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.roomType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProVoiceSmobaGameBaseRoomInfo{roomId=" + this.roomId + ",roomType=" + this.roomType + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",captainTinyId=" + this.captainTinyId + ",}";
    }

    public GProVoiceSmobaGameBaseRoomInfo(long j, int i, long j2, long j3, long j4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
            return;
        }
        this.roomId = j;
        this.roomType = i;
        this.guildId = j2;
        this.channelId = j3;
        this.captainTinyId = j4;
    }
}
