package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDoFeedPreferReq.class */
public final class GProDoFeedPreferReq {
    static IPatchRedirector $redirector_;
    public int action;
    public long channelId;
    public GProStCommonExt extInfo;
    public String feedId;
    public int from;
    public long guildId;

    public GProDoFeedPreferReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.extInfo = new GProStCommonExt();
        }
    }

    public int getAction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.action : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 6, this);
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProDoFeedPreferReq{feedId=" + this.feedId + ",action=" + this.action + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",extInfo=" + this.extInfo + ",from=" + this.from + ",}";
    }
}
