package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBriefAppInfo.class */
public final class GProBriefAppInfo {
    static IPatchRedirector $redirector_;
    public String appAvatarUrl;
    public String appId;
    public String appName;

    public GProBriefAppInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.appId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.appName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.appAvatarUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAppAvatarUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.appAvatarUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.appId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getAppName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.appName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProBriefAppInfo{appId=" + this.appId + ",appName=" + this.appName + ",appAvatarUrl=" + this.appAvatarUrl + ",}";
    }
}
