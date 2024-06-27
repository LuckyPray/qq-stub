package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPopupConfig.class */
public final class GProPopupConfig {
    static IPatchRedirector $redirector_;
    public String picUrl;
    public String wording1;
    public String wording2;

    public GProPopupConfig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.wording1 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.wording2 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.picUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getPicUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.picUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getWording1() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.wording1 : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getWording2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.wording2 : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProPopupConfig{wording1=" + this.wording1 + ",wording2=" + this.wording2 + ",picUrl=" + this.picUrl + ",}";
    }
}
