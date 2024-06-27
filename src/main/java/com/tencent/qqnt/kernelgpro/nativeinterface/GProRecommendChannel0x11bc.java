package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendChannel0x11bc.class */
public final class GProRecommendChannel0x11bc implements Serializable {
    static IPatchRedirector $redirector_;
    public GProChannelPresence channelPresence;
    public GProEssenceChannel essenceInfo;
    public int recommendType;
    long serialVersionUID;

    public GProRecommendChannel0x11bc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.essenceInfo = new GProEssenceChannel();
        this.channelPresence = new GProChannelPresence();
    }

    public GProChannelPresence getChannelPresence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelPresence : (GProChannelPresence) iPatchRedirector.redirect((short) 4, this);
    }

    public GProEssenceChannel getEssenceInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.essenceInfo : (GProEssenceChannel) iPatchRedirector.redirect((short) 3, this);
    }

    public int getRecommendType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.recommendType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRecommendChannel0x11bc{essenceInfo=" + this.essenceInfo + ",channelPresence=" + this.channelPresence + ",recommendType=" + this.recommendType + ",}";
    }

    public GProRecommendChannel0x11bc(GProEssenceChannel gProEssenceChannel, GProChannelPresence gProChannelPresence, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProEssenceChannel, gProChannelPresence, Integer.valueOf(i)});
            return;
        }
        this.serialVersionUID = 1L;
        this.essenceInfo = new GProEssenceChannel();
        this.channelPresence = new GProChannelPresence();
        this.essenceInfo = gProEssenceChannel;
        this.channelPresence = gProChannelPresence;
        this.recommendType = i;
    }
}
