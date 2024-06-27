package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStTagMedalInfo.class */
public final class GProStTagMedalInfo {
    static IPatchRedirector $redirector_;
    public long rank;
    public String tagID;
    public String tagName;

    public GProStTagMedalInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.tagID = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.tagName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public long getRank() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.rank : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getTagID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.tagID : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getTagName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tagName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProStTagMedalInfo{tagID=" + this.tagID + ",tagName=" + this.tagName + ",rank=" + this.rank + ",}";
    }
}
