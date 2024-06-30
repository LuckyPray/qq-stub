package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildBannerBizId.class */
public final class GProGuildBannerBizId {
    static IPatchRedirector $redirector_;
    public int bannerType;
    public long channelId;
    public long feedCreateTime;
    public long feedCreateTinyId;
    public String feedId;
    public long msgSeq;
    public String thirdRecommendId;

    public GProGuildBannerBizId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.feedId = "";
            this.thirdRecommendId = "";
        }
    }

    public int getBannerType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.bannerType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getFeedCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feedCreateTime : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getFeedCreateTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.feedCreateTinyId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.feedId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msgSeq : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getThirdRecommendId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.thirdRecommendId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGuildBannerBizId{bannerType=" + this.bannerType + ",channelId=" + this.channelId + ",msgSeq=" + this.msgSeq + ",feedId=" + this.feedId + ",feedCreateTime=" + this.feedCreateTime + ",feedCreateTinyId=" + this.feedCreateTinyId + ",thirdRecommendId=" + this.thirdRecommendId + ",}";
    }
}
