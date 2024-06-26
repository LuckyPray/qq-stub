package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStChannelShareSign.class */
public final class GProStChannelShareSign {
    static IPatchRedirector $redirector_;
    public long createAt;
    public String token;

    public GProStChannelShareSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.token = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getCreateAt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.createAt : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getToken() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.token : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProStChannelShareSign{createAt=" + this.createAt + ",token=" + this.token + ",}";
    }
}
