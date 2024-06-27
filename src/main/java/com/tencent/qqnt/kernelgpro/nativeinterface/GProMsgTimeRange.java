package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMsgTimeRange.class */
public final class GProMsgTimeRange {
    static IPatchRedirector $redirector_;
    public String endDate;
    public String startDate;

    public GProMsgTimeRange() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.startDate = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.endDate = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getEndDate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.endDate : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getStartDate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.startDate : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public void setEndDate(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.endDate = str;
        } else {
            iPatchRedirector.redirect((short) 6, this, str);
        }
    }

    public void setStartDate(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.startDate = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProMsgTimeRange{startDate=" + this.startDate + ",endDate=" + this.endDate + ",}";
    }

    public GProMsgTimeRange(String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2);
            return;
        }
        this.startDate = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.endDate = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.startDate = str;
        this.endDate = str2;
    }
}
