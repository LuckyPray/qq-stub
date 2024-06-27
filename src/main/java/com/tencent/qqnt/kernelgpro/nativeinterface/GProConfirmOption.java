package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProConfirmOption.class */
public final class GProConfirmOption {
    static IPatchRedirector $redirector_;
    public String confirmMsg;
    public ArrayList<GProConfirmNode> confirmNodes;

    public GProConfirmOption() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.confirmMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.confirmNodes = new ArrayList<>();
        }
    }

    public String getConfirmMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.confirmMsg : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProConfirmNode> getConfirmNodes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.confirmNodes : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProConfirmOption{confirmMsg=" + this.confirmMsg + ",confirmNodes=" + this.confirmNodes + ",}";
    }
}
