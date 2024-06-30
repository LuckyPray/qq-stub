package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRetentionChannelInfo.class */
public final class GProRetentionChannelInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String guildCover;
    public String guildIcon;
    public long guildId;
    public String guildName;
    public String guildProfile;
    public String joinSig;
    long serialVersionUID;
    public ArrayList<GProRetentionChannelLabel> tagList;

    public GProRetentionChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = "";
        this.guildIcon = "";
        this.guildProfile = "";
        this.guildCover = "";
        this.joinSig = "";
        this.tagList = new ArrayList<>();
    }

    public String getGuildCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildCover : (String) iPatchRedirector.redirect((short) 7, this);
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

    public String getGuildProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildProfile : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getJoinSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.joinSig : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public ArrayList<GProRetentionChannelLabel> getTagList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.tagList : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProRetentionChannelInfo{guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildIcon=" + this.guildIcon + ",guildProfile=" + this.guildProfile + ",guildCover=" + this.guildCover + ",joinSig=" + this.joinSig + ",tagList=" + this.tagList + ",}";
    }

    public GProRetentionChannelInfo(long j, String str, String str2, String str3, String str4, String str5, ArrayList<GProRetentionChannelLabel> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, str3, str4, str5, arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = "";
        this.guildIcon = "";
        this.guildProfile = "";
        this.guildCover = "";
        this.joinSig = "";
        this.tagList = new ArrayList<>();
        this.guildId = j;
        this.guildName = str;
        this.guildIcon = str2;
        this.guildProfile = str3;
        this.guildCover = str4;
        this.joinSig = str5;
        this.tagList = arrayList;
    }
}
