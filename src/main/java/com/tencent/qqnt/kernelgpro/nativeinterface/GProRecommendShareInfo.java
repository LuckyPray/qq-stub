package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendShareInfo.class */
public final class GProRecommendShareInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProBusinessData bizData;
    public long channelId;
    public String guildCoverUrl;
    public String guildIcon;
    public long guildId;
    public String guildName;
    public String joinGuildSig;
    public int joinedGuild;
    public int memberRole;
    long serialVersionUID;
    public String shareLink;
    public GProRecommendShareLive shareLive;
    public int shareTag;
    public int shareType;

    public GProRecommendShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.shareLink = "";
        this.guildName = "";
        this.guildIcon = "";
        this.shareLive = new GProRecommendShareLive();
        this.guildCoverUrl = "";
        this.joinGuildSig = "";
        this.bizData = new GProBusinessData();
    }

    public GProBusinessData getBizData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.bizData : (GProBusinessData) iPatchRedirector.redirect((short) 13, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public String getGuildCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildCoverUrl : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getGuildIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildIcon : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getJoinedGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.joinedGuild : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public int getMemberRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.memberRole : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public String getShareLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.shareLink : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRecommendShareLive getShareLive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.shareLive : (GProRecommendShareLive) iPatchRedirector.redirect((short) 7, this);
    }

    public int getShareTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.shareTag : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public int getShareType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.shareType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
            return (String) iPatchRedirector.redirect((short) 16, this);
        }
        return "GProRecommendShareInfo{shareLink=" + this.shareLink + ",guildName=" + this.guildName + ",guildIcon=" + this.guildIcon + ",shareType=" + this.shareType + ",shareLive=" + this.shareLive + ",guildId=" + this.guildId + ",guildCoverUrl=" + this.guildCoverUrl + ",joinedGuild=" + this.joinedGuild + ",joinGuildSig=" + this.joinGuildSig + ",channelId=" + this.channelId + ",bizData=" + this.bizData + ",memberRole=" + this.memberRole + ",shareTag=" + this.shareTag + ",}";
    }

    public GProRecommendShareInfo(String str, String str2, String str3, int i, GProRecommendShareLive gProRecommendShareLive, long j, String str4, int i2, String str5, long j2, GProBusinessData gProBusinessData, int i3, int i4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, Integer.valueOf(i), gProRecommendShareLive, Long.valueOf(j), str4, Integer.valueOf(i2), str5, Long.valueOf(j2), gProBusinessData, Integer.valueOf(i3), Integer.valueOf(i4)});
            return;
        }
        this.serialVersionUID = 1L;
        this.shareLink = "";
        this.guildName = "";
        this.guildIcon = "";
        this.shareLive = new GProRecommendShareLive();
        this.guildCoverUrl = "";
        this.joinGuildSig = "";
        this.bizData = new GProBusinessData();
        this.shareLink = str;
        this.guildName = str2;
        this.guildIcon = str3;
        this.shareType = i;
        this.shareLive = gProRecommendShareLive;
        this.guildId = j;
        this.guildCoverUrl = str4;
        this.joinedGuild = i2;
        this.joinGuildSig = str5;
        this.channelId = j2;
        this.bizData = gProBusinessData;
        this.memberRole = i3;
        this.shareTag = i4;
    }
}
