package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPreventAddictionCheckReq.class */
public final class GProPreventAddictionCheckReq implements Serializable {
    static IPatchRedirector $redirector_;
    public String context;
    long serialVersionUID;

    public GProPreventAddictionCheckReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.context = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getContext() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.context : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public void setContext(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.context = str;
        } else {
            iPatchRedirector.redirect((short) 4, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProPreventAddictionCheckReq{context=" + this.context + ",}";
    }

    public GProPreventAddictionCheckReq(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str);
            return;
        }
        this.serialVersionUID = 1L;
        this.context = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.context = str;
    }
}
