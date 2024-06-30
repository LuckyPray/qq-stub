package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProResult.class */
public final class GProResult {
    static IPatchRedirector $redirector_;
    public String errMsg;
    public long memberTid;
    public int result;

    public GProResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.errMsg = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String getErrMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.errMsg : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getMemberTid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.memberTid : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public int getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.result : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProResult{memberTid=" + this.memberTid + ",result=" + this.result + ",errMsg=" + this.errMsg + ",}";
    }
}
