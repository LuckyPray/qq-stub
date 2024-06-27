package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildMainFrameHeaderInfo.class */
public final class GProGuildMainFrameHeaderInfo {
    static IPatchRedirector $redirector_;
    public GProFeedSquareData feedSquareData;
    public GProGlobalBanner globalBannerInfo;
    public GProFaceAuthInfo guildCreatorFaceAuthInfo;
    public GProGuildCreatorTaskInfo guildCreatorTasks;
    public GProGuild guildInfo;
    public GProGuildNavigationInfo guildNavigationInfo;
    public GProRealTimeChannels realTimeChannelInfos;
    public GProRecentVisitChannelList recentVisitChannelList;
    public GProRecommendEssenceSvrRsp recommendEssence;
    public ArrayList<GProStickyChannel> stickyChannelInfos;

    public GProGuildMainFrameHeaderInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.stickyChannelInfos = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProFeedSquareData getFeedSquareData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.feedSquareData : (GProFeedSquareData) iPatchRedirector.redirect((short) 11, this);
    }

    public GProGlobalBanner getGlobalBannerInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.globalBannerInfo : (GProGlobalBanner) iPatchRedirector.redirect((short) 8, this);
    }

    public GProFaceAuthInfo getGuildCreatorFaceAuthInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildCreatorFaceAuthInfo : (GProFaceAuthInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProGuildCreatorTaskInfo getGuildCreatorTasks() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildCreatorTasks : (GProGuildCreatorTaskInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProGuild getGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildInfo : (GProGuild) iPatchRedirector.redirect((short) 3, this);
    }

    public GProGuildNavigationInfo getGuildNavigationInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildNavigationInfo : (GProGuildNavigationInfo) iPatchRedirector.redirect((short) 9, this);
    }

    public GProRealTimeChannels getRealTimeChannelInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.realTimeChannelInfos : (GProRealTimeChannels) iPatchRedirector.redirect((short) 12, this);
    }

    public GProRecentVisitChannelList getRecentVisitChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.recentVisitChannelList : (GProRecentVisitChannelList) iPatchRedirector.redirect((short) 10, this);
    }

    public GProRecommendEssenceSvrRsp getRecommendEssence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.recommendEssence : (GProRecommendEssenceSvrRsp) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<GProStickyChannel> getStickyChannelInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.stickyChannelInfos : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProGuildMainFrameHeaderInfo{guildInfo=" + this.guildInfo + ",guildCreatorTasks=" + this.guildCreatorTasks + ",guildCreatorFaceAuthInfo=" + this.guildCreatorFaceAuthInfo + ",recommendEssence=" + this.recommendEssence + ",stickyChannelInfos=" + this.stickyChannelInfos + ",globalBannerInfo=" + this.globalBannerInfo + ",guildNavigationInfo=" + this.guildNavigationInfo + ",recentVisitChannelList=" + this.recentVisitChannelList + ",feedSquareData=" + this.feedSquareData + ",realTimeChannelInfos=" + this.realTimeChannelInfos + ",}";
    }

    public GProGuildMainFrameHeaderInfo(GProGuild gProGuild, GProGuildCreatorTaskInfo gProGuildCreatorTaskInfo, GProFaceAuthInfo gProFaceAuthInfo, GProRecommendEssenceSvrRsp gProRecommendEssenceSvrRsp, ArrayList<GProStickyChannel> arrayList, GProGlobalBanner gProGlobalBanner, GProGuildNavigationInfo gProGuildNavigationInfo, GProRecentVisitChannelList gProRecentVisitChannelList, GProFeedSquareData gProFeedSquareData, GProRealTimeChannels gProRealTimeChannels) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProGuild, gProGuildCreatorTaskInfo, gProFaceAuthInfo, gProRecommendEssenceSvrRsp, arrayList, gProGlobalBanner, gProGuildNavigationInfo, gProRecentVisitChannelList, gProFeedSquareData, gProRealTimeChannels});
            return;
        }
        this.stickyChannelInfos = new ArrayList<>();
        this.guildInfo = gProGuild;
        this.guildCreatorTasks = gProGuildCreatorTaskInfo;
        this.guildCreatorFaceAuthInfo = gProFaceAuthInfo;
        this.recommendEssence = gProRecommendEssenceSvrRsp;
        this.stickyChannelInfos = arrayList;
        this.globalBannerInfo = gProGlobalBanner;
        this.guildNavigationInfo = gProGuildNavigationInfo;
        this.recentVisitChannelList = gProRecentVisitChannelList;
        this.feedSquareData = gProFeedSquareData;
        this.realTimeChannelInfos = gProRealTimeChannels;
    }
}
