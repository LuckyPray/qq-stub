package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStChannelShareInfo.class */
public final class GProStChannelShareInfo {
    static IPatchRedirector $redirector_;
    public GProStChannelSign channelSign;
    public String feedID;
    public long feedPublishAt;
    public String posterID;
    public GProStChannelShareSign sign;
    public long updateDurationMs;

    public GProStChannelShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedID = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.posterID = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelSign = new GProStChannelSign();
        this.sign = new GProStChannelShareSign();
    }

    public GProStChannelSign getChannelSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelSign : (GProStChannelSign) iPatchRedirector.redirect((short) 5, this);
    }

    public String getFeedID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedID : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public long getFeedPublishAt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feedPublishAt : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getPosterID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.posterID : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStChannelShareSign getSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sign : (GProStChannelShareSign) iPatchRedirector.redirect((short) 7, this);
    }

    public long getUpdateDurationMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.updateDurationMs : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProStChannelShareInfo{feedID=" + this.feedID + ",posterID=" + this.posterID + ",feedPublishAt=" + this.feedPublishAt + ",channelSign=" + this.channelSign + ",updateDurationMs=" + this.updateDurationMs + ",sign=" + this.sign + ",}";
    }
}
