package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSecurityResult.class */
public final class GProSecurityResult implements Serializable {
    static IPatchRedirector $redirector_;
    public long action;
    long serialVersionUID;
    public String strDetail;
    public String strPrompt;

    public GProSecurityResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.strPrompt = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.strDetail = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getAction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.action : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getStrDetail() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.strDetail : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getStrPrompt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.strPrompt : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProSecurityResult{action=" + this.action + ",strPrompt=" + this.strPrompt + ",strDetail=" + this.strDetail + ",}";
    }

    public GProSecurityResult(long j, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2});
            return;
        }
        this.serialVersionUID = 1L;
        this.strPrompt = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.strDetail = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.action = j;
        this.strPrompt = str;
        this.strDetail = str2;
    }
}
