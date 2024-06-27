package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendsV2Feed.class */
public final class GProRecommendsV2Feed implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<String> attributeTags;
    public String bannerUrl;
    public String buttonColor;
    public String buttonDesc;
    public String buttonDescColor;
    public String cardBottomColor;
    public long cardId;
    public long cardTank;
    public String cardUrl;
    public long channelId;
    public String channelInfoColor;
    public String contentId;
    public long createTime;
    public int favorCnt;
    public int feedCardType;
    public String feedCoverUrl;
    public String feedId;
    public String feedSubTitle;
    public String feedTitle;
    public String feedVideoCoverUrl;
    public long guildId;
    public int imageRatioType;
    public String inviteCode;
    public int isMore;
    public long posterTinyId;
    long serialVersionUID;
    public String titleColor;

    public GProRecommendsV2Feed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedCoverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedSubTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.titleColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cardBottomColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelInfoColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedVideoCoverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cardUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.inviteCode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.contentId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.bannerUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.attributeTags = new ArrayList<>();
        this.buttonDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.buttonColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.buttonDescColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public ArrayList<String> getAttributeTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.attributeTags : (ArrayList) iPatchRedirector.redirect((short) 23, this);
    }

    public String getBannerUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.bannerUrl : (String) iPatchRedirector.redirect((short) 20, this);
    }

    public String getButtonColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.buttonColor : (String) iPatchRedirector.redirect((short) 26, this);
    }

    public String getButtonDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.buttonDesc : (String) iPatchRedirector.redirect((short) 25, this);
    }

    public String getButtonDescColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.buttonDescColor : (String) iPatchRedirector.redirect((short) 27, this);
    }

    public String getCardBottomColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.cardBottomColor : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public long getCardId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.cardId : ((Long) iPatchRedirector.redirect((short) 21, this)).longValue();
    }

    public long getCardTank() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.cardTank : ((Long) iPatchRedirector.redirect((short) 24, this)).longValue();
    }

    public String getCardUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.cardUrl : (String) iPatchRedirector.redirect((short) 17, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getChannelInfoColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.channelInfoColor : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getContentId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.contentId : (String) iPatchRedirector.redirect((short) 19, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public int getFavorCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.favorCnt : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public int getFeedCardType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.feedCardType : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
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

    public int getImageRatioType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.imageRatioType : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public String getInviteCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.inviteCode : (String) iPatchRedirector.redirect((short) 18, this);
    }

    public int getIsMore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.isMore : ((Integer) iPatchRedirector.redirect((short) 22, this)).intValue();
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
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 28)) {
            return (String) iPatchRedirector.redirect((short) 28, this);
        }
        return "GProRecommendsV2Feed{feedId=" + this.feedId + ",feedTitle=" + this.feedTitle + ",feedCoverUrl=" + this.feedCoverUrl + ",posterTinyId=" + this.posterTinyId + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",createTime=" + this.createTime + ",feedSubTitle=" + this.feedSubTitle + ",titleColor=" + this.titleColor + ",cardBottomColor=" + this.cardBottomColor + ",channelInfoColor=" + this.channelInfoColor + ",feedVideoCoverUrl=" + this.feedVideoCoverUrl + ",imageRatioType=" + this.imageRatioType + ",favorCnt=" + this.favorCnt + ",feedCardType=" + this.feedCardType + ",cardUrl=" + this.cardUrl + ",inviteCode=" + this.inviteCode + ",contentId=" + this.contentId + ",bannerUrl=" + this.bannerUrl + ",cardId=" + this.cardId + ",isMore=" + this.isMore + ",attributeTags=" + this.attributeTags + ",cardTank=" + this.cardTank + ",buttonDesc=" + this.buttonDesc + ",buttonColor=" + this.buttonColor + ",buttonDescColor=" + this.buttonDescColor + ",}";
    }
}
