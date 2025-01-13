package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IntroductoryGuildInfo.class */
public final class IntroductoryGuildInfo {
    static IPatchRedirector $redirector_;
    public String guildAvatar;
    public String guildCover;
    public long guildId;
    public String guildName;
    public String guildProfile;
    public String joinGuildSig;
    public ArrayList<GProRecommendLabel> labelInfos;
    public ArrayList<GProMedalInfo> medalInfos;

    public IntroductoryGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildName = "";
        this.guildAvatar = "";
        this.guildProfile = "";
        this.guildCover = "";
        this.medalInfos = new ArrayList<>();
        this.labelInfos = new ArrayList<>();
        this.joinGuildSig = "";
    }

    public String getGuildAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildAvatar : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getGuildCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildCover : (String) iPatchRedirector.redirect((short) 7, this);
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
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildProfile : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public ArrayList<GProRecommendLabel> getLabelInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.labelInfos : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public ArrayList<GProMedalInfo> getMedalInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.medalInfos : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "IntroductoryGuildInfo{guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildAvatar=" + this.guildAvatar + ",guildProfile=" + this.guildProfile + ",guildCover=" + this.guildCover + ",medalInfos=" + this.medalInfos + ",labelInfos=" + this.labelInfos + ",joinGuildSig=" + this.joinGuildSig + ",}";
    }

    public IntroductoryGuildInfo(long j, String str, String str2, String str3, String str4, ArrayList<GProMedalInfo> arrayList, ArrayList<GProRecommendLabel> arrayList2, String str5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, str2, str3, str4, arrayList, arrayList2, str5);
            return;
        }
        this.guildName = "";
        this.guildAvatar = "";
        this.guildProfile = "";
        this.guildCover = "";
        this.medalInfos = new ArrayList<>();
        this.labelInfos = new ArrayList<>();
        this.joinGuildSig = "";
        this.guildId = j;
        this.guildName = str;
        this.guildAvatar = str2;
        this.guildProfile = str3;
        this.guildCover = str4;
        this.medalInfos = arrayList;
        this.labelInfos = arrayList2;
        this.joinGuildSig = str5;
    }
}
