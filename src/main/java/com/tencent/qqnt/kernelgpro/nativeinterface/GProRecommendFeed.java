package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendFeed.class */
public final class GProRecommendFeed implements Serializable {
    static IPatchRedirector $redirector_;
    public String cardBottomColor;
    public long channelId;
    public String channelInfoColor;
    public long createTime;
    public String feedCoverUrl;
    public String feedId;
    public String feedSubTitle;
    public String feedTitle;
    public String feedVideoCoverUrl;
    public long guildId;
    public long posterTinyId;
    long serialVersionUID;
    public String titleColor;

    public GProRecommendFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.feedId = "";
        this.feedTitle = "";
        this.feedCoverUrl = "";
        this.feedSubTitle = "";
        this.titleColor = "";
        this.cardBottomColor = "";
        this.channelInfoColor = "";
        this.feedVideoCoverUrl = "";
    }

    public String getCardBottomColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.cardBottomColor : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getChannelInfoColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.channelInfoColor : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String getFeedCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feedCoverUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getFeedSubTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.feedSubTitle : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getFeedTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feedTitle : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getFeedVideoCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.feedVideoCoverUrl : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getPosterTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.posterTinyId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getTitleColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.titleColor : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProRecommendFeed{feedId=" + this.feedId + ",feedTitle=" + this.feedTitle + ",feedCoverUrl=" + this.feedCoverUrl + ",posterTinyId=" + this.posterTinyId + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",createTime=" + this.createTime + ",feedSubTitle=" + this.feedSubTitle + ",titleColor=" + this.titleColor + ",cardBottomColor=" + this.cardBottomColor + ",channelInfoColor=" + this.channelInfoColor + ",feedVideoCoverUrl=" + this.feedVideoCoverUrl + ",}";
    }
}
