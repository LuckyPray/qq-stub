package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProContentRecommendGuild.class */
public final class GProContentRecommendGuild implements Serializable {
    static IPatchRedirector $redirector_;
    public String cover;
    public String guildAvatar;
    public long guildId;
    public String guildName;
    public String guildProfile;
    public byte[] joinSig;
    public ArrayList<GProMedalInfo> medals;
    long serialVersionUID;
    public ArrayList<GProGuildLabel> tagList;

    public GProContentRecommendGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildAvatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tagList = new ArrayList<>();
        this.medals = new ArrayList<>();
        this.guildProfile = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cover = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinSig = new byte[0];
    }

    public String getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.cover : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getGuildAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildAvatar : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getGuildProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildProfile : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public byte[] getJoinSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.joinSig : (byte[]) iPatchRedirector.redirect((short) 9, this);
    }

    public ArrayList<GProMedalInfo> getMedals() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.medals : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<GProGuildLabel> getTagList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.tagList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProContentRecommendGuild{guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildAvatar=" + this.guildAvatar + ",tagList=" + this.tagList + ",medals=" + this.medals + ",guildProfile=" + this.guildProfile + ",cover=" + this.cover + ",joinSig=" + this.joinSig + ",}";
    }
}
