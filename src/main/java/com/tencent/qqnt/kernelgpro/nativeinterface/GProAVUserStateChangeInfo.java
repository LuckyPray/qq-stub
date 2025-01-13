package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVUserStateChangeInfo.class */
public final class GProAVUserStateChangeInfo {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long guildId;
    public String msg;
    public GProAVShowMsgInfo showInfo;
    public long tinyId;
    public GProUserCtlInfo userCtlInfo;

    public GProAVUserStateChangeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.userCtlInfo = new GProUserCtlInfo();
        this.msg = "";
        this.showInfo = new GProAVShowMsgInfo();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.msg : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public GProAVShowMsgInfo getShowInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.showInfo : (GProAVShowMsgInfo) iPatchRedirector.redirect((short) 8, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProUserCtlInfo getUserCtlInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.userCtlInfo : (GProUserCtlInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProAVUserStateChangeInfo{guildId=" + this.guildId + ",channelId=" + this.channelId + ",tinyId=" + this.tinyId + ",userCtlInfo=" + this.userCtlInfo + ",msg=" + this.msg + ",showInfo=" + this.showInfo + ",}";
    }

    public GProAVUserStateChangeInfo(long j, long j2, long j3, GProUserCtlInfo gProUserCtlInfo, String str, GProAVShowMsgInfo gProAVShowMsgInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), gProUserCtlInfo, str, gProAVShowMsgInfo);
            return;
        }
        this.userCtlInfo = new GProUserCtlInfo();
        this.msg = "";
        this.showInfo = new GProAVShowMsgInfo();
        this.guildId = j;
        this.channelId = j2;
        this.tinyId = j3;
        this.userCtlInfo = gProUserCtlInfo;
        this.msg = str;
        this.showInfo = gProAVShowMsgInfo;
    }
}
