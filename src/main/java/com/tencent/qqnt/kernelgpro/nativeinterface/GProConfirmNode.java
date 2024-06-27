package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProConfirmNode.class */
public final class GProConfirmNode {
    static IPatchRedirector $redirector_;
    public String buttonMsg;
    public boolean cancelOpt;
    public String confirmExt;

    public GProConfirmNode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.buttonMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.confirmExt = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getButtonMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.buttonMsg : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public boolean getCancelOpt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cancelOpt : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public String getConfirmExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.confirmExt : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProConfirmNode{buttonMsg=" + this.buttonMsg + ",confirmExt=" + this.confirmExt + ",cancelOpt=" + this.cancelOpt + ",}";
    }
}
