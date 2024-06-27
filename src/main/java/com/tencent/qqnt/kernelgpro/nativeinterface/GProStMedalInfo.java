package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStMedalInfo.class */
public final class GProStMedalInfo {
    static IPatchRedirector $redirector_;
    public String backgroundUrl;
    public String describe;
    public String iconUrl;
    public boolean isHighLight;
    public boolean isNew;
    public String jumpUrl;
    public String medalID;
    public String medalName;
    public int rank;
    public int reportValue;
    public int type;

    public GProStMedalInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.medalName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.medalID = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.backgroundUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.describe = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getBackgroundUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.backgroundUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getDescribe() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.describe : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public boolean getIsHighLight() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isHighLight : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public boolean getIsNew() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.isNew : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getMedalID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.medalID : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getMedalName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.medalName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getRank() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.rank : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getReportValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.reportValue : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProStMedalInfo{type=" + this.type + ",medalName=" + this.medalName + ",medalID=" + this.medalID + ",rank=" + this.rank + ",isHighLight=" + this.isHighLight + ",isNew=" + this.isNew + ",jumpUrl=" + this.jumpUrl + ",iconUrl=" + this.iconUrl + ",backgroundUrl=" + this.backgroundUrl + ",describe=" + this.describe + ",reportValue=" + this.reportValue + ",}";
    }
}
