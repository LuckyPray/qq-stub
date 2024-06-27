package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPollingChannelState.class */
public final class GProPollingChannelState {
    static IPatchRedirector $redirector_;
    public GProActiveChannelInfo activeChannelInfo;
    public GProAppChnnPreInfo appChannelPresence;
    public long channelId;
    public GProChannel channelInfo;
    public GProCreateGuildGuideInfo createGuildGuideInfo;
    public GProFeedSquareData feedSquareData;
    public GProGlobalBanner guildGlobalBanner;
    public long guildId;
    public GProGuildNavigationInfo guildNavigation;
    public ArrayList<GProStickyChannel> guildStickyChannelList;
    public GProLiveRoomInfo liveChannelPresence;
    public GProOnlineMemberInfo onlineMemberInfo;
    public GProRealTimeChannels realTimeChannelList;
    public GProRecentVisitChannelList recentVisitChannelList;
    public GProRecommendEssenceSvrRsp recommendEssence;
    public int source;
    public int type;
    public long updateTime;
    public GProChannelMemberInfos voiceChannelPresence;

    public GProPollingChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.voiceChannelPresence = new GProChannelMemberInfos();
        this.liveChannelPresence = new GProLiveRoomInfo();
        this.appChannelPresence = new GProAppChnnPreInfo();
        this.guildGlobalBanner = new GProGlobalBanner();
        this.createGuildGuideInfo = new GProCreateGuildGuideInfo();
        this.onlineMemberInfo = new GProOnlineMemberInfo();
        this.guildStickyChannelList = new ArrayList<>();
        this.recommendEssence = new GProRecommendEssenceSvrRsp();
        this.activeChannelInfo = new GProActiveChannelInfo();
        this.channelInfo = new GProChannel();
        this.guildNavigation = new GProGuildNavigationInfo();
        this.recentVisitChannelList = new GProRecentVisitChannelList();
        this.feedSquareData = new GProFeedSquareData();
        this.realTimeChannelList = new GProRealTimeChannels();
    }

    public GProActiveChannelInfo getActiveChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.activeChannelInfo : (GProActiveChannelInfo) iPatchRedirector.redirect((short) 15, this);
    }

    public GProAppChnnPreInfo getAppChannelPresence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.appChannelPresence : (GProAppChnnPreInfo) iPatchRedirector.redirect((short) 9, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public GProChannel getChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.channelInfo : (GProChannel) iPatchRedirector.redirect((short) 16, this);
    }

    public GProCreateGuildGuideInfo getCreateGuildGuideInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.createGuildGuideInfo : (GProCreateGuildGuideInfo) iPatchRedirector.redirect((short) 11, this);
    }

    public GProFeedSquareData getFeedSquareData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.feedSquareData : (GProFeedSquareData) iPatchRedirector.redirect((short) 19, this);
    }

    public GProGlobalBanner getGuildGlobalBanner() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.guildGlobalBanner : (GProGlobalBanner) iPatchRedirector.redirect((short) 10, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProGuildNavigationInfo getGuildNavigation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.guildNavigation : (GProGuildNavigationInfo) iPatchRedirector.redirect((short) 17, this);
    }

    public ArrayList<GProStickyChannel> getGuildStickyChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.guildStickyChannelList : (ArrayList) iPatchRedirector.redirect((short) 13, this);
    }

    public GProLiveRoomInfo getLiveChannelPresence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.liveChannelPresence : (GProLiveRoomInfo) iPatchRedirector.redirect((short) 8, this);
    }

    public GProOnlineMemberInfo getOnlineMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.onlineMemberInfo : (GProOnlineMemberInfo) iPatchRedirector.redirect((short) 12, this);
    }

    public GProRealTimeChannels getRealTimeChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.realTimeChannelList : (GProRealTimeChannels) iPatchRedirector.redirect((short) 20, this);
    }

    public GProRecentVisitChannelList getRecentVisitChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.recentVisitChannelList : (GProRecentVisitChannelList) iPatchRedirector.redirect((short) 18, this);
    }

    public GProRecommendEssenceSvrRsp getRecommendEssence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.recommendEssence : (GProRecommendEssenceSvrRsp) iPatchRedirector.redirect((short) 14, this);
    }

    public int getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.source : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getUpdateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.updateTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProChannelMemberInfos getVoiceChannelPresence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.voiceChannelPresence : (GProChannelMemberInfos) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 21)) {
            return (String) iPatchRedirector.redirect((short) 21, this);
        }
        return "GProPollingChannelState{guildId=" + this.guildId + ",channelId=" + this.channelId + ",type=" + this.type + ",updateTime=" + this.updateTime + ",source=" + this.source + ",voiceChannelPresence=" + this.voiceChannelPresence + ",liveChannelPresence=" + this.liveChannelPresence + ",appChannelPresence=" + this.appChannelPresence + ",guildGlobalBanner=" + this.guildGlobalBanner + ",createGuildGuideInfo=" + this.createGuildGuideInfo + ",onlineMemberInfo=" + this.onlineMemberInfo + ",guildStickyChannelList=" + this.guildStickyChannelList + ",recommendEssence=" + this.recommendEssence + ",activeChannelInfo=" + this.activeChannelInfo + ",channelInfo=" + this.channelInfo + ",guildNavigation=" + this.guildNavigation + ",recentVisitChannelList=" + this.recentVisitChannelList + ",feedSquareData=" + this.feedSquareData + ",realTimeChannelList=" + this.realTimeChannelList + ",}";
    }
}
