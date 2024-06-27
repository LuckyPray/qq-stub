package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendChannelExtendInfo.class */
public final class GProRecommendChannelExtendInfo {
    static IPatchRedirector $redirector_;
    public int areaType;
    public long channelId;
    public String channelLink;
    public int channelLinkType;
    public String guildFace;
    public int hideVisitorStyle;

    public GProRecommendChannelExtendInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.channelLink = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.guildFace = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public int getAreaType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.areaType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getChannelLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelLink : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getChannelLinkType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelLinkType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getGuildFace() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildFace : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getHideVisitorStyle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.hideVisitorStyle : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProRecommendChannelExtendInfo{channelId=" + this.channelId + ",channelLink=" + this.channelLink + ",guildFace=" + this.guildFace + ",areaType=" + this.areaType + ",channelLinkType=" + this.channelLinkType + ",hideVisitorStyle=" + this.hideVisitorStyle + ",}";
    }

    public GProRecommendChannelExtendInfo(long j, String str, String str2, int i, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        this.channelLink = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildFace = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelId = j;
        this.channelLink = str;
        this.guildFace = str2;
        this.areaType = i;
        this.channelLinkType = i2;
        this.hideVisitorStyle = i3;
    }
}
