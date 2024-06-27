package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendV2Channel.class */
public final class GProRecommendV2Channel implements Serializable {
    static IPatchRedirector $redirector_;
    public long browseTimeStamp;
    public String coverUrl;
    public String guildIcon;
    public long guildId;
    public String guildName;
    public String guildProfile;
    public String joinGuildSig;
    public int joinedGuild;
    public ArrayList<GProRecommendV2Label> labelList;
    public int memberRole;
    public long ownerUin;
    long serialVersionUID;
    public ArrayList<GProRecommendGuildState> stateList;
    public ArrayList<String> tagList;
    public long uniqueId;

    public GProRecommendV2Channel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildProfile = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.stateList = new ArrayList<>();
        this.tagList = new ArrayList<>();
        this.coverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinGuildSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labelList = new ArrayList<>();
    }

    public long getBrowseTimeStamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.browseTimeStamp : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public String getCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.coverUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getGuildIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildIcon : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getGuildProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildProfile : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getJoinedGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.joinedGuild : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public ArrayList<GProRecommendV2Label> getLabelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.labelList : (ArrayList) iPatchRedirector.redirect((short) 16, this);
    }

    public int getMemberRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.memberRole : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public long getOwnerUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.ownerUin : ((Long) iPatchRedirector.redirect((short) 14, this)).longValue();
    }

    public ArrayList<GProRecommendGuildState> getStateList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.stateList : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<String> getTagList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.tagList : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public long getUniqueId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.uniqueId : ((Long) iPatchRedirector.redirect((short) 15, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 17)) {
            return (String) iPatchRedirector.redirect((short) 17, this);
        }
        return "GProRecommendV2Channel{guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildProfile=" + this.guildProfile + ",guildIcon=" + this.guildIcon + ",stateList=" + this.stateList + ",tagList=" + this.tagList + ",joinedGuild=" + this.joinedGuild + ",coverUrl=" + this.coverUrl + ",joinGuildSig=" + this.joinGuildSig + ",memberRole=" + this.memberRole + ",browseTimeStamp=" + this.browseTimeStamp + ",ownerUin=" + this.ownerUin + ",uniqueId=" + this.uniqueId + ",labelList=" + this.labelList + ",}";
    }

    public GProRecommendV2Channel(long j, String str, String str2, String str3, ArrayList<GProRecommendGuildState> arrayList, ArrayList<String> arrayList2, int i, String str4, String str5, int i2, long j2, long j3, long j4, ArrayList<GProRecommendV2Label> arrayList3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, str3, arrayList, arrayList2, Integer.valueOf(i), str4, str5, Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), arrayList3});
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildProfile = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.stateList = new ArrayList<>();
        this.tagList = new ArrayList<>();
        this.coverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinGuildSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labelList = new ArrayList<>();
        this.guildId = j;
        this.guildName = str;
        this.guildProfile = str2;
        this.guildIcon = str3;
        this.stateList = arrayList;
        this.tagList = arrayList2;
        this.joinedGuild = i;
        this.coverUrl = str4;
        this.joinGuildSig = str5;
        this.memberRole = i2;
        this.browseTimeStamp = j2;
        this.ownerUin = j3;
        this.uniqueId = j4;
        this.labelList = arrayList3;
    }
}
