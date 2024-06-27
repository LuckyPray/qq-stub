package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMedalInfo.class */
public final class GProMedalInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long expireTime;
    public String iconUrl;
    public String name;
    public GProOfficialMedalInfoExt officialMedalInfoExt;
    long serialVersionUID;

    public GProMedalInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.officialMedalInfoExt = new GProOfficialMedalInfoExt();
    }

    public long getExpireTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.expireTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.name : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public GProOfficialMedalInfoExt getOfficialMedalInfoExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.officialMedalInfoExt : (GProOfficialMedalInfoExt) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProMedalInfo{iconUrl=" + this.iconUrl + ",name=" + this.name + ",expireTime=" + this.expireTime + ",officialMedalInfoExt=" + this.officialMedalInfoExt + ",}";
    }

    public GProMedalInfo(String str, String str2, long j, GProOfficialMedalInfoExt gProOfficialMedalInfoExt) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, Long.valueOf(j), gProOfficialMedalInfoExt});
            return;
        }
        this.serialVersionUID = 1L;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.officialMedalInfoExt = new GProOfficialMedalInfoExt();
        this.iconUrl = str;
        this.name = str2;
        this.expireTime = j;
        this.officialMedalInfoExt = gProOfficialMedalInfoExt;
    }
}
