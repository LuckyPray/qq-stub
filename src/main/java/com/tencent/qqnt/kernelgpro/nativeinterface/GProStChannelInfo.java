package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStChannelInfo.class */
public final class GProStChannelInfo {
    static IPatchRedirector $redirector_;
    public String guildName;
    public String hotIcon;
    public int hotIndex;
    public String iconUrl;
    public boolean isSquare;
    public GProStGuildLabel label;
    public ArrayList<GProMedalInfo> medals;
    public String memberCount;
    public int movePostSection;
    public String name;
    public int privateType;
    public GProStChannelSign sign;

    public GProStChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.sign = new GProStChannelSign();
        this.name = "";
        this.iconUrl = "";
        this.guildName = "";
        this.hotIcon = "";
        this.memberCount = "";
        this.medals = new ArrayList<>();
        this.label = new GProStGuildLabel();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getHotIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.hotIcon : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getHotIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.hotIndex : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getIsSquare() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.isSquare : ((Boolean) iPatchRedirector.redirect((short) 10, this)).booleanValue();
    }

    public GProStGuildLabel getLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.label : (GProStGuildLabel) iPatchRedirector.redirect((short) 13, this);
    }

    public ArrayList<GProMedalInfo> getMedals() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.medals : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public String getMemberCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.memberCount : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getMovePostSection() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.movePostSection : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getPrivateType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.privateType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public GProStChannelSign getSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.sign : (GProStChannelSign) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProStChannelInfo{sign=" + this.sign + ",name=" + this.name + ",iconUrl=" + this.iconUrl + ",privateType=" + this.privateType + ",guildName=" + this.guildName + ",hotIcon=" + this.hotIcon + ",hotIndex=" + this.hotIndex + ",movePostSection=" + this.movePostSection + ",isSquare=" + this.isSquare + ",memberCount=" + this.memberCount + ",medals=" + this.medals + ",label=" + this.label + ",}";
    }
}
