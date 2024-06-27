package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildTopFeedMsg.class */
public final class GProGuildTopFeedMsg {
    static IPatchRedirector $redirector_;
    public int action;
    public long channelId;
    public long guildId;
    public long readTimestamp;
    public String recallFeedId;
    public GProTopFeedMsg topFeedMsg;

    public GProGuildTopFeedMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.topFeedMsg = new GProTopFeedMsg();
            this.recallFeedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public int getAction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.action : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getReadTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.readTimestamp : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getRecallFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.recallFeedId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProTopFeedMsg getTopFeedMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.topFeedMsg : (GProTopFeedMsg) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProGuildTopFeedMsg{guildId=" + this.guildId + ",action=" + this.action + ",readTimestamp=" + this.readTimestamp + ",topFeedMsg=" + this.topFeedMsg + ",recallFeedId=" + this.recallFeedId + ",channelId=" + this.channelId + ",}";
    }
}
