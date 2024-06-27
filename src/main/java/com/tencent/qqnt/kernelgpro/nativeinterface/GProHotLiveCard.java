package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProHotLiveCard.class */
public final class GProHotLiveCard implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int channelType;
    public String cover;
    public long guildId;
    public String icon;
    public String liveTitle;
    public ArrayList<String> memberAvatarList;
    public long roomId;
    long serialVersionUID;
    public String themeSessionId;
    public int themeType;

    public GProHotLiveCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.cover = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.liveTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberAvatarList = new ArrayList<>();
        this.themeSessionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cover : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.icon : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getLiveTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.liveTitle : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<String> getMemberAvatarList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.memberAvatarList : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public String getThemeSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.themeSessionId : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getThemeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.themeType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProHotLiveCard{guildId=" + this.guildId + ",channelId=" + this.channelId + ",channelType=" + this.channelType + ",cover=" + this.cover + ",liveTitle=" + this.liveTitle + ",icon=" + this.icon + ",memberAvatarList=" + this.memberAvatarList + ",themeType=" + this.themeType + ",roomId=" + this.roomId + ",themeSessionId=" + this.themeSessionId + ",}";
    }
}
