package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPersonalMedal.class */
public final class GProPersonalMedal {
    static IPatchRedirector $redirector_;
    public long endTime;
    public long startTime;
    public String url;

    public GProPersonalMedal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.url = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getEndTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.endTime : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getStartTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.startTime : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.url : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProPersonalMedal{startTime=" + this.startTime + ",endTime=" + this.endTime + ",url=" + this.url + ",}";
    }
}
