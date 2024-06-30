package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProConfigItem.class */
public final class GProConfigItem {
    static IPatchRedirector $redirector_;
    public int configID;
    public int configStatus;
    public String desc;

    public GProConfigItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.desc = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getConfigID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.configID : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getConfigStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.configStatus : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.desc : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProConfigItem{configID=" + this.configID + ",configStatus=" + this.configStatus + ",desc=" + this.desc + ",}";
    }
}
