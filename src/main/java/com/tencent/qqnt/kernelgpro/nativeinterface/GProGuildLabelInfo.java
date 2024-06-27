package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildLabelInfo.class */
public final class GProGuildLabelInfo {
    static IPatchRedirector $redirector_;
    public String guildCover;
    public String guildIcon;
    public long guildId;
    public String guildName;
    public ArrayList<GProGuildLabel> labels;
    public ArrayList<GProMedalInfo> medals;
    public String profile;
    public ArrayList<GProRecommendGuildState> stateList;

    public GProGuildLabelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.profile = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildCover = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labels = new ArrayList<>();
        this.medals = new ArrayList<>();
        this.stateList = new ArrayList<>();
    }

    public String getGuildCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildCover : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getGuildIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildIcon : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProGuildLabel> getLabels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.labels : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProMedalInfo> getMedals() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.medals : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public String getProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.profile : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProRecommendGuildState> getStateList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.stateList : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProGuildLabelInfo{guildId=" + this.guildId + ",guildName=" + this.guildName + ",profile=" + this.profile + ",guildCover=" + this.guildCover + ",guildIcon=" + this.guildIcon + ",labels=" + this.labels + ",medals=" + this.medals + ",stateList=" + this.stateList + ",}";
    }
}
