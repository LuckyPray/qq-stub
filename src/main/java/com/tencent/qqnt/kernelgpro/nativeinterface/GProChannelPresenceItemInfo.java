package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelPresenceItemInfo.class */
public final class GProChannelPresenceItemInfo {
    static IPatchRedirector $redirector_;
    public int jumpType;
    public String jumpUrl;
    public String text;

    public GProChannelPresenceItemInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public int getJumpType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.jumpType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.text : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProChannelPresenceItemInfo{text=" + this.text + ",jumpUrl=" + this.jumpUrl + ",jumpType=" + this.jumpType + ",}";
    }
}
