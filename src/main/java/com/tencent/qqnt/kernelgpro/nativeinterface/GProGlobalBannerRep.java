package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGlobalBannerRep.class */
public final class GProGlobalBannerRep {
    static IPatchRedirector $redirector_;
    public String bannerId;
    public int bannerType;
    public long channelId;
    public long guildId;
    public long msgSeq;

    public GProGlobalBannerRep() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.bannerId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String getBannerId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.bannerId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getBannerType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.bannerType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.msgSeq : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public void setBannerId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.bannerId = str;
        } else {
            iPatchRedirector.redirect((short) 12, this, str);
        }
    }

    public void setBannerType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.bannerType = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 9, this, j);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public void setMsgSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.msgSeq = j;
        } else {
            iPatchRedirector.redirect((short) 11, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProGlobalBannerRep{guildId=" + this.guildId + ",channelId=" + this.channelId + ",bannerType=" + this.bannerType + ",msgSeq=" + this.msgSeq + ",bannerId=" + this.bannerId + ",}";
    }

    public GProGlobalBannerRep(long j, long j2, int i, long j3, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Long.valueOf(j3), str});
            return;
        }
        this.bannerId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = j;
        this.channelId = j2;
        this.bannerType = i;
        this.msgSeq = j3;
        this.bannerId = str;
    }
}
