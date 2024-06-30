package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAvChannelStateMsg.class */
public final class GProAvChannelStateMsg {
    static IPatchRedirector $redirector_;
    public long appid;
    public int atType;
    public long channelId;
    public long fromTinyId;
    public long guildId;
    public String msg;
    public boolean needNotify;
    public long roomId;
    public String summary;
    public long timestamp;

    public GProAvChannelStateMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.summary = "";
            this.msg = "";
        }
    }

    public long getAppid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.appid : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getAtType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.atType : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getFromTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.fromTinyId : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.msg : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public boolean getNeedNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.needNotify : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String getSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.summary : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.timestamp : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProAvChannelStateMsg{guildId=" + this.guildId + ",channelId=" + this.channelId + ",timestamp=" + this.timestamp + ",appid=" + this.appid + ",roomId=" + this.roomId + ",summary=" + this.summary + ",msg=" + this.msg + ",needNotify=" + this.needNotify + ",atType=" + this.atType + ",fromTinyId=" + this.fromTinyId + ",}";
    }
}
