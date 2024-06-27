package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProScheduleGuildSurface.class */
public final class GProScheduleGuildSurface {
    static IPatchRedirector $redirector_;
    public String channelName;
    public String coverUrl;
    public int fontColor;
    public String guildName;
    public String iconUrl;

    public GProScheduleGuildSurface() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.coverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.coverUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getFontColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.fontColor : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildName : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProScheduleGuildSurface{guildName=" + this.guildName + ",coverUrl=" + this.coverUrl + ",iconUrl=" + this.iconUrl + ",fontColor=" + this.fontColor + ",channelName=" + this.channelName + ",}";
    }
}
