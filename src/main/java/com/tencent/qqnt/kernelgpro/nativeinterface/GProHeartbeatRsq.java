package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProHeartbeatRsq.class */
public final class GProHeartbeatRsq implements Serializable {
    static IPatchRedirector $redirector_;
    public GProAVChannelConfig avChannelConfig;
    public long channelId;
    public int forceExit;
    public long guildId;
    public long nextHeartBeatInterval;
    public long noStreamDisconnectTrtcSecond;
    long serialVersionUID;
    public String showTips;

    public GProHeartbeatRsq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.showTips = "";
        this.avChannelConfig = new GProAVChannelConfig();
    }

    public GProAVChannelConfig getAvChannelConfig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.avChannelConfig : (GProAVChannelConfig) iPatchRedirector.redirect((short) 8, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getForceExit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.forceExit : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getNextHeartBeatInterval() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.nextHeartBeatInterval : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getNoStreamDisconnectTrtcSecond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.noStreamDisconnectTrtcSecond : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public String getShowTips() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.showTips : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProHeartbeatRsq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",nextHeartBeatInterval=" + this.nextHeartBeatInterval + ",forceExit=" + this.forceExit + ",showTips=" + this.showTips + ",avChannelConfig=" + this.avChannelConfig + ",noStreamDisconnectTrtcSecond=" + this.noStreamDisconnectTrtcSecond + ",}";
    }

    public GProHeartbeatRsq(long j, long j2, long j3, int i, String str, GProAVChannelConfig gProAVChannelConfig, long j4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), str, gProAVChannelConfig, Long.valueOf(j4));
            return;
        }
        this.serialVersionUID = 1L;
        this.showTips = "";
        this.avChannelConfig = new GProAVChannelConfig();
        this.guildId = j;
        this.channelId = j2;
        this.nextHeartBeatInterval = j3;
        this.forceExit = i;
        this.showTips = str;
        this.avChannelConfig = gProAVChannelConfig;
        this.noStreamDisconnectTrtcSecond = j4;
    }
}
