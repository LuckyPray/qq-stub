package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStWearingMedalInfo.class */
public final class GProStWearingMedalInfo {
    static IPatchRedirector $redirector_;
    public String medalID;
    public String medalName;
    public int type;

    public GProStWearingMedalInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.medalName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.medalID = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getMedalID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.medalID : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getMedalName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.medalName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProStWearingMedalInfo{type=" + this.type + ",medalName=" + this.medalName + ",medalID=" + this.medalID + ",}";
    }
}
