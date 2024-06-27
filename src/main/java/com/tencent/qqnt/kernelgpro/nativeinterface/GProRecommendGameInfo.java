package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendGameInfo.class */
public final class GProRecommendGameInfo {
    static IPatchRedirector $redirector_;
    public String icon;

    /* renamed from: id */
    public int f74id;
    public GProRecommendModeInfo modeInfo;
    public String name;

    public GProRecommendGameInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.modeInfo = new GProRecommendModeInfo();
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.icon : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.f74id : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProRecommendModeInfo getModeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.modeInfo : (GProRecommendModeInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.name : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProRecommendGameInfo{id=" + this.f74id + ",name=" + this.name + ",icon=" + this.icon + ",modeInfo=" + this.modeInfo + ",}";
    }

    public GProRecommendGameInfo(int i, String str, String str2, GProRecommendModeInfo gProRecommendModeInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, str2, gProRecommendModeInfo});
            return;
        }
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.modeInfo = new GProRecommendModeInfo();
        this.f74id = i;
        this.name = str;
        this.icon = str2;
        this.modeInfo = gProRecommendModeInfo;
    }
}
