package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPrefetchRecommendGuildInfo.class */
public final class GProPrefetchRecommendGuildInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String category;
    public String guildIcon;
    public long guildId;
    long serialVersionUID;

    public GProPrefetchRecommendGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.category = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCategory() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.category : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getGuildIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildIcon : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProPrefetchRecommendGuildInfo{guildId=" + this.guildId + ",guildIcon=" + this.guildIcon + ",category=" + this.category + ",}";
    }

    public GProPrefetchRecommendGuildInfo(long j, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2});
            return;
        }
        this.serialVersionUID = 1L;
        this.guildIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.category = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = j;
        this.guildIcon = str;
        this.category = str2;
    }
}
