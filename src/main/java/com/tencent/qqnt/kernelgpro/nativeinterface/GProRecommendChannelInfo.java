package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendChannelInfo.class */
public final class GProRecommendChannelInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String channelName;
    public int channelType;
    public String coverUrl;
    public String guildIcon;
    public long guildId;
    public String guildName;
    public String guildNumber;
    public String guildProfile;
    public int isWhole;
    public String itemId;
    public String joinGuildSig;
    public int joinedGuild;
    public ArrayList<GProMedalInfo> medalInfoList;
    public int medalLevel;
    public int memberRole;
    public GProRecommendSeqInfo seqInfo;
    long serialVersionUID;
    public String shareLink;
    public int shareTag;
    public ArrayList<GProRecommendGuildState> stateList;
    public ArrayList<GProRecommendLabel> tagList;
    public String titleName;
    public long unreadAtMeCount;

    public GProRecommendChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = "";
        this.guildIcon = "";
        this.guildProfile = "";
        this.stateList = new ArrayList<>();
        this.shareLink = "";
        this.coverUrl = "";
        this.joinGuildSig = "";
        this.channelName = "";
        this.itemId = "";
        this.tagList = new ArrayList<>();
        this.seqInfo = new GProRecommendSeqInfo();
        this.guildNumber = "";
        this.titleName = "";
        this.medalInfoList = new ArrayList<>();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.channelName : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public String getCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.coverUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getGuildIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildIcon : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getGuildNumber() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.guildNumber : (String) iPatchRedirector.redirect((short) 19, this);
    }

    public String getGuildProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildProfile : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getIsWhole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.isWhole : ((Integer) iPatchRedirector.redirect((short) 23, this)).intValue();
    }

    public String getItemId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.itemId : (String) iPatchRedirector.redirect((short) 16, this);
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getJoinedGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.joinedGuild : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public ArrayList<GProMedalInfo> getMedalInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.medalInfoList : (ArrayList) iPatchRedirector.redirect((short) 25, this);
    }

    public int getMedalLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.medalLevel : ((Integer) iPatchRedirector.redirect((short) 20, this)).intValue();
    }

    public int getMemberRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.memberRole : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public GProRecommendSeqInfo getSeqInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.seqInfo : (GProRecommendSeqInfo) iPatchRedirector.redirect((short) 18, this);
    }

    public String getShareLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.shareLink : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public int getShareTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.shareTag : ((Integer) iPatchRedirector.redirect((short) 22, this)).intValue();
    }

    public ArrayList<GProRecommendGuildState> getStateList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.stateList : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProRecommendLabel> getTagList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.tagList : (ArrayList) iPatchRedirector.redirect((short) 17, this);
    }

    public String getTitleName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.titleName : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public long getUnreadAtMeCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.unreadAtMeCount : ((Long) iPatchRedirector.redirect((short) 24, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 26)) {
            return (String) iPatchRedirector.redirect((short) 26, this);
        }
        return "GProRecommendChannelInfo{guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildIcon=" + this.guildIcon + ",guildProfile=" + this.guildProfile + ",stateList=" + this.stateList + ",shareLink=" + this.shareLink + ",joinedGuild=" + this.joinedGuild + ",coverUrl=" + this.coverUrl + ",joinGuildSig=" + this.joinGuildSig + ",memberRole=" + this.memberRole + ",channelId=" + this.channelId + ",channelName=" + this.channelName + ",channelType=" + this.channelType + ",itemId=" + this.itemId + ",tagList=" + this.tagList + ",seqInfo=" + this.seqInfo + ",guildNumber=" + this.guildNumber + ",medalLevel=" + this.medalLevel + ",titleName=" + this.titleName + ",shareTag=" + this.shareTag + ",isWhole=" + this.isWhole + ",unreadAtMeCount=" + this.unreadAtMeCount + ",medalInfoList=" + this.medalInfoList + ",}";
    }

    public GProRecommendChannelInfo(long j, String str, String str2, String str3, ArrayList<GProRecommendGuildState> arrayList, String str4, int i, String str5, String str6, int i2, long j2, String str7, int i3, String str8, ArrayList<GProRecommendLabel> arrayList2, GProRecommendSeqInfo gProRecommendSeqInfo, String str9, int i4, String str10, int i5, int i6, long j3, ArrayList<GProMedalInfo> arrayList3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, str2, str3, arrayList, str4, Integer.valueOf(i), str5, str6, Integer.valueOf(i2), Long.valueOf(j2), str7, Integer.valueOf(i3), str8, arrayList2, gProRecommendSeqInfo, str9, Integer.valueOf(i4), str10, Integer.valueOf(i5), Integer.valueOf(i6), Long.valueOf(j3), arrayList3);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = "";
        this.guildIcon = "";
        this.guildProfile = "";
        this.stateList = new ArrayList<>();
        this.shareLink = "";
        this.coverUrl = "";
        this.joinGuildSig = "";
        this.channelName = "";
        this.itemId = "";
        this.tagList = new ArrayList<>();
        this.seqInfo = new GProRecommendSeqInfo();
        this.guildNumber = "";
        this.titleName = "";
        this.medalInfoList = new ArrayList<>();
        this.guildId = j;
        this.guildName = str;
        this.guildIcon = str2;
        this.guildProfile = str3;
        this.stateList = arrayList;
        this.shareLink = str4;
        this.joinedGuild = i;
        this.coverUrl = str5;
        this.joinGuildSig = str6;
        this.memberRole = i2;
        this.channelId = j2;
        this.channelName = str7;
        this.channelType = i3;
        this.itemId = str8;
        this.tagList = arrayList2;
        this.seqInfo = gProRecommendSeqInfo;
        this.guildNumber = str9;
        this.medalLevel = i4;
        this.titleName = str10;
        this.shareTag = i5;
        this.isWhole = i6;
        this.unreadAtMeCount = j3;
        this.medalInfoList = arrayList3;
    }
}
