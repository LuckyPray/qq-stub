package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildSearchInfo.class */
public final class GProGuildSearchInfo {
    static IPatchRedirector $redirector_;
    public String coverUrl;
    public long guildId;
    public String guildNumber;
    public ArrayList<GProGuildChannelState> guildStates;
    public String headUrl;
    public ArrayList<String> highlightWords;
    public String joinGuildSig;
    public int joinedGuild;
    public ArrayList<GProRecommendLabel> labelList;
    public ArrayList<GProMedalInfo> medalInfoList;
    public int medalLevel;
    public String name;
    public GProRecommendLabel peopleLabel;
    public String profile;
    public ArrayList<GProSearchRankInfo> rankList;
    public GProRecallInfo recallInfo;
    public GProRecommendLabel recommendReason;
    public int showType;
    public GProSuggestedSearch suggestedSearchInfo;
    public ArrayList<String> tags;

    public GProGuildSearchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.profile = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.coverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinGuildSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.headUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildStates = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.guildNumber = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recallInfo = new GProRecallInfo();
        this.medalInfoList = new ArrayList<>();
        this.labelList = new ArrayList<>();
        this.rankList = new ArrayList<>();
        this.peopleLabel = new GProRecommendLabel();
        this.recommendReason = new GProRecommendLabel();
        this.highlightWords = new ArrayList<>();
        this.suggestedSearchInfo = new GProSuggestedSearch();
    }

    public String getCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.coverUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getGuildNumber() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.guildNumber : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public ArrayList<GProGuildChannelState> getGuildStates() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildStates : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String getHeadUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.headUrl : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public ArrayList<String> getHighlightWords() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.highlightWords : (ArrayList) iPatchRedirector.redirect((short) 19, this);
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getJoinedGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.joinedGuild : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public ArrayList<GProRecommendLabel> getLabelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.labelList : (ArrayList) iPatchRedirector.redirect((short) 15, this);
    }

    public ArrayList<GProMedalInfo> getMedalInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.medalInfoList : (ArrayList) iPatchRedirector.redirect((short) 14, this);
    }

    public int getMedalLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.medalLevel : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRecommendLabel getPeopleLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.peopleLabel : (GProRecommendLabel) iPatchRedirector.redirect((short) 17, this);
    }

    public String getProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.profile : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProSearchRankInfo> getRankList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.rankList : (ArrayList) iPatchRedirector.redirect((short) 16, this);
    }

    public GProRecallInfo getRecallInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.recallInfo : (GProRecallInfo) iPatchRedirector.redirect((short) 12, this);
    }

    public GProRecommendLabel getRecommendReason() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.recommendReason : (GProRecommendLabel) iPatchRedirector.redirect((short) 18, this);
    }

    public int getShowType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.showType : ((Integer) iPatchRedirector.redirect((short) 21, this)).intValue();
    }

    public GProSuggestedSearch getSuggestedSearchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.suggestedSearchInfo : (GProSuggestedSearch) iPatchRedirector.redirect((short) 20, this);
    }

    public ArrayList<String> getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.tags : (ArrayList) iPatchRedirector.redirect((short) 10, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 22)) {
            return (String) iPatchRedirector.redirect((short) 22, this);
        }
        return "GProGuildSearchInfo{joinedGuild=" + this.joinedGuild + ",name=" + this.name + ",profile=" + this.profile + ",coverUrl=" + this.coverUrl + ",joinGuildSig=" + this.joinGuildSig + ",guildId=" + this.guildId + ",headUrl=" + this.headUrl + ",guildStates=" + this.guildStates + ",tags=" + this.tags + ",guildNumber=" + this.guildNumber + ",recallInfo=" + this.recallInfo + ",medalLevel=" + this.medalLevel + ",medalInfoList=" + this.medalInfoList + ",labelList=" + this.labelList + ",rankList=" + this.rankList + ",peopleLabel=" + this.peopleLabel + ",recommendReason=" + this.recommendReason + ",highlightWords=" + this.highlightWords + ",suggestedSearchInfo=" + this.suggestedSearchInfo + ",showType=" + this.showType + ",}";
    }
}
