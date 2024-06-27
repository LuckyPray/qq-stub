package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStFeed.class */
public final class GProStFeed {
    static IPatchRedirector $redirector_;
    public byte[] busiReport;
    public GProStBusinessCard businessCard;
    public GProStChannelInfo channelInfo;
    public int commentCount;
    public GProStRichText contents;
    public GProStImage cover;
    public long createTime;
    public long createTimeNs;
    public String defaultBackgroundImg;
    public long discussionNum;
    public GProStEmotionReactionInfo emotionReaction;
    public ArrayList<GProFeedEntry> extInfoList;
    public int feedSourceType;
    public int feedType;
    public ArrayList<Integer> functionList;
    public long groupCode;
    public ArrayList<GProStRichTextGroupContent> groupContentList;
    public String idd;
    public ArrayList<GProStImage> images;
    public GProInteraction latestInteraction;
    public GProFeedMetaData meta;
    public boolean needWebview;
    public ArrayList<Integer> opMaskList;
    public GProStOpinfo opinfo;
    public String patternInfo;
    public GProStPoiInfoV2 poiInfo;
    public GProStUser poster;
    public GProStRecomInfo recomInfo;
    public ArrayList<GProStChannelSign> recommendChannels;
    public GProStShare share;
    public GProStRichText subtitle;
    public GProStFeedSummary summary;
    public ArrayList<GProStTagInfo> tagInfos;
    public GProStRichText title;
    public GProTopInfo topInfo;
    public ArrayList<GProStRichTextTopicContent> topicContents;
    public GProTotalLike totalLike;
    public GProTotalPrefer totalPrefer;
    public long updateTime;
    public ArrayList<GProStComment> vecCommentList;
    public ArrayList<GProStVideo> videos;
    public GProStVisitor visitorInfo;

    public GProStFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.idd = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = new GProStRichText();
        this.subtitle = new GProStRichText();
        this.poster = new GProStUser();
        this.videos = new ArrayList<>();
        this.contents = new GProStRichText();
        this.emotionReaction = new GProStEmotionReactionInfo();
        this.vecCommentList = new ArrayList<>();
        this.share = new GProStShare();
        this.visitorInfo = new GProStVisitor();
        this.images = new ArrayList<>();
        this.poiInfo = new GProStPoiInfoV2();
        this.tagInfos = new ArrayList<>();
        this.busiReport = new byte[0];
        this.opMaskList = new ArrayList<>();
        this.opinfo = new GProStOpinfo();
        this.extInfoList = new ArrayList<>();
        this.patternInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelInfo = new GProStChannelInfo();
        this.summary = new GProStFeedSummary();
        this.recomInfo = new GProStRecomInfo();
        this.meta = new GProFeedMetaData();
        this.topInfo = new GProTopInfo();
        this.recommendChannels = new ArrayList<>();
        this.totalLike = new GProTotalLike();
        this.latestInteraction = new GProInteraction();
        this.totalPrefer = new GProTotalPrefer();
        this.defaultBackgroundImg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cover = new GProStImage();
        this.topicContents = new ArrayList<>();
        this.groupContentList = new ArrayList<>();
        this.businessCard = new GProStBusinessCard();
        this.functionList = new ArrayList<>();
    }

    public byte[] getBusiReport() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.busiReport : (byte[]) iPatchRedirector.redirect((short) 17, this);
    }

    public GProStBusinessCard getBusinessCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 42)) ? this.businessCard : (GProStBusinessCard) iPatchRedirector.redirect((short) 42, this);
    }

    public GProStChannelInfo getChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.channelInfo : (GProStChannelInfo) iPatchRedirector.redirect((short) 22, this);
    }

    public int getCommentCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.commentCount : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public GProStRichText getContents() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.contents : (GProStRichText) iPatchRedirector.redirect((short) 7, this);
    }

    public GProStImage getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) ? this.cover : (GProStImage) iPatchRedirector.redirect((short) 38, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public long getCreateTimeNs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.createTimeNs : ((Long) iPatchRedirector.redirect((short) 23, this)).longValue();
    }

    public String getDefaultBackgroundImg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) ? this.defaultBackgroundImg : (String) iPatchRedirector.redirect((short) 35, this);
    }

    public long getDiscussionNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) ? this.discussionNum : ((Long) iPatchRedirector.redirect((short) 32, this)).longValue();
    }

    public GProStEmotionReactionInfo getEmotionReaction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.emotionReaction : (GProStEmotionReactionInfo) iPatchRedirector.redirect((short) 9, this);
    }

    public ArrayList<GProFeedEntry> getExtInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.extInfoList : (ArrayList) iPatchRedirector.redirect((short) 20, this);
    }

    public int getFeedSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) ? this.feedSourceType : ((Integer) iPatchRedirector.redirect((short) 37, this)).intValue();
    }

    public int getFeedType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) ? this.feedType : ((Integer) iPatchRedirector.redirect((short) 33, this)).intValue();
    }

    public ArrayList<Integer> getFunctionList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 43)) ? this.functionList : (ArrayList) iPatchRedirector.redirect((short) 43, this);
    }

    public long getGroupCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) ? this.groupCode : ((Long) iPatchRedirector.redirect((short) 36, this)).longValue();
    }

    public ArrayList<GProStRichTextGroupContent> getGroupContentList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 41)) ? this.groupContentList : (ArrayList) iPatchRedirector.redirect((short) 41, this);
    }

    public String getIdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.idd : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProStImage> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 14, this);
    }

    public GProInteraction getLatestInteraction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) ? this.latestInteraction : (GProInteraction) iPatchRedirector.redirect((short) 31, this);
    }

    public GProFeedMetaData getMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.meta : (GProFeedMetaData) iPatchRedirector.redirect((short) 26, this);
    }

    public boolean getNeedWebview() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 39)) ? this.needWebview : ((Boolean) iPatchRedirector.redirect((short) 39, this)).booleanValue();
    }

    public ArrayList<Integer> getOpMaskList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.opMaskList : (ArrayList) iPatchRedirector.redirect((short) 18, this);
    }

    public GProStOpinfo getOpinfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.opinfo : (GProStOpinfo) iPatchRedirector.redirect((short) 19, this);
    }

    public String getPatternInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.patternInfo : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public GProStPoiInfoV2 getPoiInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.poiInfo : (GProStPoiInfoV2) iPatchRedirector.redirect((short) 15, this);
    }

    public GProStUser getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.poster : (GProStUser) iPatchRedirector.redirect((short) 5, this);
    }

    public GProStRecomInfo getRecomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.recomInfo : (GProStRecomInfo) iPatchRedirector.redirect((short) 25, this);
    }

    public ArrayList<GProStChannelSign> getRecommendChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) ? this.recommendChannels : (ArrayList) iPatchRedirector.redirect((short) 28, this);
    }

    public GProStShare getShare() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.share : (GProStShare) iPatchRedirector.redirect((short) 12, this);
    }

    public GProStRichText getSubtitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.subtitle : (GProStRichText) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStFeedSummary getSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.summary : (GProStFeedSummary) iPatchRedirector.redirect((short) 24, this);
    }

    public ArrayList<GProStTagInfo> getTagInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.tagInfos : (ArrayList) iPatchRedirector.redirect((short) 16, this);
    }

    public GProStRichText getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (GProStRichText) iPatchRedirector.redirect((short) 3, this);
    }

    public GProTopInfo getTopInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.topInfo : (GProTopInfo) iPatchRedirector.redirect((short) 27, this);
    }

    public ArrayList<GProStRichTextTopicContent> getTopicContents() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 40)) ? this.topicContents : (ArrayList) iPatchRedirector.redirect((short) 40, this);
    }

    public GProTotalLike getTotalLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) ? this.totalLike : (GProTotalLike) iPatchRedirector.redirect((short) 30, this);
    }

    public GProTotalPrefer getTotalPrefer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) ? this.totalPrefer : (GProTotalPrefer) iPatchRedirector.redirect((short) 34, this);
    }

    public long getUpdateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) ? this.updateTime : ((Long) iPatchRedirector.redirect((short) 29, this)).longValue();
    }

    public ArrayList<GProStComment> getVecCommentList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.vecCommentList : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public ArrayList<GProStVideo> getVideos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.videos : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public GProStVisitor getVisitorInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.visitorInfo : (GProStVisitor) iPatchRedirector.redirect((short) 13, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 44)) {
            return (String) iPatchRedirector.redirect((short) 44, this);
        }
        return "GProStFeed{idd=" + this.idd + ",title=" + this.title + ",subtitle=" + this.subtitle + ",poster=" + this.poster + ",videos=" + this.videos + ",contents=" + this.contents + ",createTime=" + this.createTime + ",emotionReaction=" + this.emotionReaction + ",commentCount=" + this.commentCount + ",vecCommentList=" + this.vecCommentList + ",share=" + this.share + ",visitorInfo=" + this.visitorInfo + ",images=" + this.images + ",poiInfo=" + this.poiInfo + ",tagInfos=" + this.tagInfos + ",busiReport=" + this.busiReport + ",opMaskList=" + this.opMaskList + ",opinfo=" + this.opinfo + ",extInfoList=" + this.extInfoList + ",patternInfo=" + this.patternInfo + ",channelInfo=" + this.channelInfo + ",createTimeNs=" + this.createTimeNs + ",summary=" + this.summary + ",recomInfo=" + this.recomInfo + ",meta=" + this.meta + ",topInfo=" + this.topInfo + ",recommendChannels=" + this.recommendChannels + ",updateTime=" + this.updateTime + ",totalLike=" + this.totalLike + ",latestInteraction=" + this.latestInteraction + ",discussionNum=" + this.discussionNum + ",feedType=" + this.feedType + ",totalPrefer=" + this.totalPrefer + ",defaultBackgroundImg=" + this.defaultBackgroundImg + ",groupCode=" + this.groupCode + ",feedSourceType=" + this.feedSourceType + ",cover=" + this.cover + ",needWebview=" + this.needWebview + ",topicContents=" + this.topicContents + ",groupContentList=" + this.groupContentList + ",businessCard=" + this.businessCard + ",functionList=" + this.functionList + ",}";
    }
}
