package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetGuildFeedsReq.class */
public final class GProGetGuildFeedsReq {
    static IPatchRedirector $redirector_;
    public int count;
    public String feedAttchInfo;
    public int from;
    public int getType;
    public long guildId;
    public boolean needChannelList;
    public boolean needRecommendCard;
    public boolean needTopInfo;
    public int sortOption;
    public long topChannelId;
    public String topFeedId;

    public GProGetGuildFeedsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.feedAttchInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.topFeedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getFeedAttchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feedAttchInfo : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getGetType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.getType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public boolean getNeedChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.needChannelList : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public boolean getNeedRecommendCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.needRecommendCard : ((Boolean) iPatchRedirector.redirect((short) 11, this)).booleanValue();
    }

    public boolean getNeedTopInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.needTopInfo : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public int getSortOption() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sortOption : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getTopChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.topChannelId : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public String getTopFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.topFeedId : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProGetGuildFeedsReq{count=" + this.count + ",from=" + this.from + ",feedAttchInfo=" + this.feedAttchInfo + ",guildId=" + this.guildId + ",getType=" + this.getType + ",sortOption=" + this.sortOption + ",needChannelList=" + this.needChannelList + ",needTopInfo=" + this.needTopInfo + ",topFeedId=" + this.topFeedId + ",needRecommendCard=" + this.needRecommendCard + ",topChannelId=" + this.topChannelId + ",}";
    }
}
